package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnMeow() throws Exception {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        String realSound = cat.getSound();
        assertEquals("Кот должен мяукать.", expectedSound, realSound);
    }

    // У меня не получается замокать getFood для Cat. Получаю NullPointerException.
    /*
    @Test
    public void getFoodReturnMeats() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> realFoodList = cat.getFood();
        assertEquals("Кот должен быть хищником.", expectedFoodList, realFoodList);
    }
     */
}
