package com.baby.server.model;

import com.baby.server.repository.EquationRepository;
import com.baby.server.service.DailyEquations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.DayOfWeek;

public class GameLogic {
    @JsonIgnore
    private String secretEquation;
    private boolean isFortyTwo;
    private boolean isValidInput;
    private String input;
    private String tips;

    public GameLogic(String equation) {
        secretEquation = "";
        input = equation;
        isFortyTwo = false;
        isValidInput = false;
        tips = "";
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public boolean getIsValidInput() {
        return isValidInput;
    }

    public void setIsValidInput(boolean validInput) {
        isValidInput = validInput;
    }

    public boolean getIsFortyTwo() {
        return isFortyTwo;
    }

    public void setIsFortyTwo(boolean fortyTwo) {
        isFortyTwo = fortyTwo;
    }

    public String getSecretEquation() {
        return secretEquation;
    }

    public void setSecretEquation(String input) {
        this.secretEquation = input;
    }

}
