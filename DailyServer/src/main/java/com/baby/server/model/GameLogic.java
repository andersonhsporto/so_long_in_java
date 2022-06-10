package com.baby.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class GameLogic {
    @JsonIgnore
    private String secretEquation;
    private boolean isFortyTwo;
    private boolean isValidInput;
    private String input;
    private String tips;

    public GameLogic(String equation, String dailyEquation) {
        secretEquation = dailyEquation;
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
