package com.baby.server;

import com.baby.server.controller.DailyController;
import com.baby.server.model.GameLogic;
import com.baby.server.service.DailyService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BabyTests {
//    @Test
//    @DisplayName("Should demonstrate a simple assertion to check if the length of the given string is six chars")
//    public void shouldTestIfStrLengthIsEqualToSix() {
//        String equation = "10*4+2";
//        String dailyEquation = DailyController.getDailyEquation();
//        assertTrue(new DailyService().validateAll(equation, dailyEquation).getIsValidInput());
//    }
//
//    @Test
//    @DisplayName("Should test multiple equations, validating the Regex")
//    public void shouldTestMultipleEquationsValidatingRegex() {
//
//        assertAll(() -> assertFalse(new DailyService().isOperationValid("input")),
//                  () -> assertFalse(new DailyService().isOperationValid("0x412a")),
//                  () -> assertFalse(new DailyService().isOperationValid("+2*501")),
//                  () -> assertFalse(new DailyService().isOperationValid("ls -la | grep vim")),
//                  () -> assertFalse(new DailyService().isOperationValid("01**32")),
//                  () -> assertFalse(new DailyService().isOperationValid("123456")),
//                  () -> assertTrue(new DailyService().isOperationValid("1+0041")),
//                  () -> assertTrue(new DailyService().isOperationValid("12*5-1")),
//                  () -> assertTrue(new DailyService().isOperationValid("1+0041")),
//                  () -> assertTrue(new DailyService().isOperationValid("125+12")),
//                  () -> assertTrue(new DailyService().isOperationValid("42-50+4515-314159275*7-1*0")));
//    }
//
//    @Test
//    @DisplayName("Tests if the given string is not a valid equation")
//    public void shouldTestIfInputIsValid() { //trocar nome
//        String equation = "VIM";
//        assertFalse(new DailyService().validateAll(equation).getIsValidInput());
//    }
//
//    @Test
//    @DisplayName("Tests if the result of the equation is equals 42")
//    public void equationsIsEqualFortyTwoExpectsTrue() { //trocar nome
//        assertTrue(new DailyService().isFortyTwo("10*5-8"));
//        assertTrue(new DailyService().isFortyTwo("05*8+2"));
//        assertTrue(new DailyService().isFortyTwo("0040+2"));
//        assertTrue(new DailyService().isFortyTwo("100-58"));
//        assertTrue(new DailyService().isFortyTwo("80/2+2"));
//        assertFalse(new DailyService().isFortyTwo("10*5-7"));
//        assertFalse(new DailyService().isFortyTwo("80-033"));
//        assertFalse(new DailyService().isFortyTwo("5*10-5"));
//        assertFalse(new DailyService().isFortyTwo("0043-2"));
//        assertFalse(new DailyService().isFortyTwo("0+0+40"));
//    }
//
//    @Test
//    @DisplayName("Have six Char?")
//    public void haveSixCharacter() { //trocar nome
//        assertTrue(new DailyService().isSixChars("012345"));
//        assertTrue(new DailyService().isSixChars("abcdef"));
//        assertTrue(new DailyService().isSixChars("1+1+1+"));
//        assertTrue(new DailyService().isSixChars("30/2*3"));
//        assertTrue(new DailyService().isSixChars("0921/("));
//        assertFalse(new DailyService().isSixChars("/Z)|"));
//        assertFalse(new DailyService().isSixChars("=-tes./;30kamens"));
//        assertFalse(new DailyService().isSixChars("1"));
//        assertFalse(new DailyService().isSixChars(""));
//        assertFalse(new DailyService().isSixChars("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
//
//    }
//
//    @Test
//    @DisplayName("Tests if the given string is equal to forty two")
//    public void checkIfIsEqualToFortyTwo() { //trocar nome
//        String correctInput = "000042";
//        String inCorrectInput = "000041";
//        assertTrue(new DailyService().isFortyTwo(correctInput));
//        assertFalse(new DailyService().isFortyTwo(inCorrectInput));
//    }
//
//    @Test
//    @DisplayName("Tests if the tips is equals to CCCCCC")
//    public void expectReturnTrueIfTipsIsCCCCCC() { //trocar nome
//        String expectedResult = "CCCCCC";
//        String equation = "10*4+2";
//        GameLogic babyCCCCCC = new DailyService().validateAll(equation);
//        assertEquals(expectedResult, babyCCCCCC.getTips());
//    }
//
//    @Test
//    @DisplayName("Tests if the tips is equals to CCCXXX")
//    public void expectReturnTrueIfTipsIsCCCXXX() { //trocar nome
//        String expectedResult = "CCCXXX";
//        String equation = "10*5-8";
//        GameLogic babyCCCXXX = new DailyService().validateAll(equation);
//        assertEquals(expectedResult, babyCCCXXX.getTips());
//    }
//
//    @Test
//    @DisplayName("Tests if the tips is equals to TTTTCC")
//    public void expectReturnTrueIfTipsIsTTTTCC() { //trocar nome
//        String expectedResult = "TTTTCC";
//        String equation = "4*10+2";
//        GameLogic babyTTTTCC = new DailyService().validateAll(equation);
//        assertEquals(expectedResult, babyTTTTCC.getTips());
//    }
}

//adicionar mais testes