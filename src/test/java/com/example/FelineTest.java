package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnMeats() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");

        List<String> realFoodList = feline.eatMeat();
        assertEquals("Кошачьи должны быть хищниками.", expectedFoodList, realFoodList);
    }

    @Test
    public void getFamilyReturnFelines() throws Exception {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        String realFamily = feline.getFamily();
        assertEquals("Семья должна быть Кошачьи.", expectedFamily, realFamily);
    }

    @Test
    public void getKittensNoParamsReturnOne() throws Exception {
        Feline feline = new Feline();
        int expectedKittensNumber = 1;

        int realKittensNumber = feline.getKittens();
        assertEquals("Котенок должен быть один.", expectedKittensNumber, realKittensNumber);
    }

    @Test
    public void getKittensParamReturnTen() throws Exception {
        Feline feline = new Feline();
        int expectedKittensNumber = 10;

        int realKittensNumber = feline.getKittens(10);
        assertEquals("Котят должно быть десять.", expectedKittensNumber, realKittensNumber);
    }
}
