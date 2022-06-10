package com.baby.server.service;

import com.baby.server.model.GameLogic;
import com.baby.server.model.SecretEquations;
import com.baby.server.repository.EquationRepository;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class BabyService {
    public boolean isSixChars(String input) {
        return (input.length() == 6);
    }

    public boolean isOperationValid(String input) {
        return Pattern.compile("(\\d+[+\\-*/])+\\d+").matcher(input).matches();
    }

    public boolean isFortyTwo(String equation) {
        DoubleEvaluator eval = new DoubleEvaluator();
        Double result = eval.evaluate(equation);
        return result == 42.0;
    }

    public String outputFormatter(GameLogic gameLogic) {
        String tips = gameLogic.getTips();
        for (int i = 0; i < gameLogic.getInput().length(); i++) {
            if (gameLogic.getInput().charAt(i) == gameLogic.getSecretEquation().charAt(i))
                tips = tips.concat("C");
            else if (gameLogic.getSecretEquation().contains(String.valueOf(gameLogic.getInput().charAt(i))))
                tips = tips.concat("T");
            else
                tips = tips.concat("X");
        }
        return tips;
    }

    @Autowired
    private EquationRepository repository;

    public String getDailyEquation() {
        int dayOfMonth = LocalDate.now().getDayOfMonth();

        SecretEquations dbEquation = this.repository.findSecretEquationsById(dayOfMonth);
        return dbEquation.getEquation();
    }

    public GameLogic validateAll(String input) {
        GameLogic gameLogic = new GameLogic(input);
        gameLogic.setSecretEquation(getDailyEquation()); // <<<< aqui!
        if (isSixChars(input) && isOperationValid(input)) {
            gameLogic.setIsValidInput(true);
            if (isFortyTwo(gameLogic.getInput())) {
                gameLogic.setIsFortyTwo(true);
                gameLogic.setTips(outputFormatter(gameLogic));
            }
        }
        return gameLogic;
    }
}
