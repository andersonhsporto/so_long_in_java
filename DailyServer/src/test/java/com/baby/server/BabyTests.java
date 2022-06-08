package com.baby.server;

import com.baby.server.model.GameLogic;
import com.baby.server.service.BabyService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BabyTests {
    @Test
    @DisplayName("Should demonstrate a simple assertion to check if the length of the given string is six chars")
    public void shouldTestIfStrLengthIsEqualToSix() {
        String equation = "10*4+2";
        assertTrue(new BabyService().validateAll(equation).getIsValidInput());
    }

    @Test
    @DisplayName("Should test multiple equations, validating the Regex")
    public void shouldTestMultipleEquationsValidatingRegex() {

        assertAll(() -> assertFalse(new BabyService().isOperationValid("input")),
                  () -> assertFalse(new BabyService().isOperationValid("0x412a")),
                  () -> assertFalse(new BabyService().isOperationValid("+2*501")),
                  () -> assertFalse(new BabyService().isOperationValid("ls -la | grep vim")),
                  () -> assertFalse(new BabyService().isOperationValid("01**32")),
                  () -> assertFalse(new BabyService().isOperationValid("123456")),
                  () -> assertTrue(new BabyService().isOperationValid("1+0041")),
                  () -> assertTrue(new BabyService().isOperationValid("12*5-1")),
                  () -> assertTrue(new BabyService().isOperationValid("1+0041")),
                  () -> assertTrue(new BabyService().isOperationValid("125+12")),
                  () -> assertTrue(new BabyService().isOperationValid("42-50+4515-314159275*7-1*0")));
    }

    @Test
    @DisplayName("Tests if the given string is not a valid equation")
    public void shouldTestIfInputIsValid() { //trocar nome
        String equation = "VIM";
        assertFalse(new BabyService().validateAll(equation).getIsValidInput());
    }

    @Test
    @DisplayName("Tests if the result of the equation is equals 42")
    public void equationsIsEqualFortyTwoExpectsTrue() { //trocar nome
        assertTrue(new BabyService().isFortyTwo("10*5-8"));
        assertTrue(new BabyService().isFortyTwo("05*8+2"));
        assertTrue(new BabyService().isFortyTwo("0040+2"));
        assertTrue(new BabyService().isFortyTwo("100-58"));
        assertTrue(new BabyService().isFortyTwo("80/2+2"));
        assertFalse(new BabyService().isFortyTwo("10*5-7"));
        assertFalse(new BabyService().isFortyTwo("80-033"));
        assertFalse(new BabyService().isFortyTwo("5*10-5"));
        assertFalse(new BabyService().isFortyTwo("0043-2"));
        assertFalse(new BabyService().isFortyTwo("0+0+40"));
    }

    @Test
    @DisplayName("Have six Char?")
    public void haveSixCharacter() { //trocar nome
        assertTrue(new BabyService().isSixChars("012345"));
        assertTrue(new BabyService().isSixChars("abcdef"));
        assertTrue(new BabyService().isSixChars("1+1+1+"));
        assertTrue(new BabyService().isSixChars("30/2*3"));
        assertTrue(new BabyService().isSixChars("0921/("));
        assertFalse(new BabyService().isSixChars("/Z)|"));
        assertFalse(new BabyService().isSixChars("=-tes./;30kamens"));
        assertFalse(new BabyService().isSixChars("1"));
        assertFalse(new BabyService().isSixChars(""));
        assertFalse(new BabyService().isSixChars("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));

    }

    @Test
    @DisplayName("Tests if the given string is equal to forty two")
    public void checkIfIsEqualToFortyTwo() { //trocar nome
        String correctInput = "000042";
        String inCorrectInput = "000041";
        assertTrue(new BabyService().isFortyTwo(correctInput));
        assertFalse(new BabyService().isFortyTwo(inCorrectInput));
    }

    @Test
    @DisplayName("Tests if the tips is equals to CCCCCC")
    public void expectReturnTrueIfTipsIsCCCCCC() { //trocar nome
        String expectedResult = "CCCCCC";
        String equation = "10*4+2";
        GameLogic babyCCCCCC = new BabyService().validateAll(equation);
        assertEquals(expectedResult, babyCCCCCC.getTips());
    }

    @Test
    @DisplayName("Tests if the tips is equals to CCCXXX")
    public void expectReturnTrueIfTipsIsCCCXXX() { //trocar nome
        String expectedResult = "CCCXXX";
        String equation = "10*5-8";
        GameLogic babyCCCXXX = new BabyService().validateAll(equation);
        assertEquals(expectedResult, babyCCCXXX.getTips());
    }

    @Test
    @DisplayName("Tests if the tips is equals to TTTTCC")
    public void expectReturnTrueIfTipsIsTTTTCC() { //trocar nome
        String expectedResult = "TTTTCC";
        String equation = "4*10+2";
        GameLogic babyTTTTCC = new BabyService().validateAll(equation);
        assertEquals(expectedResult, babyTTTTCC.getTips());
    }
}

//adicionar mais testes