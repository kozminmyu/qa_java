package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeMaleReturnTrue() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean expectedMane = true;

        boolean realMane = lion.doesHaveMane();
        assertEquals("У льва должна быть грива.", expectedMane, realMane);
    }

    @Test
    public void doesHaveManeFemaleReturnFalse() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean expectedMane = false;

        boolean realMane = lion.doesHaveMane();
        assertEquals("У львица не должно быть гривы.", expectedMane, realMane);
    }

    @Test (expected = Exception.class)
    public void lionConstructorOtherSexThrowsException() throws Exception {
        Lion lion = new Lion(feline, "Оно");
    }

    @Test
    public void getFoodReturnMeats() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> realFoodList = lion.getFood();
        assertEquals("Лев должен быть хищником.", expectedFoodList, realFoodList);
    }

    @Test
    public void getKittensReturnOne() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedKittensNumber = 1;

        Mockito.when(feline.getKittens()).thenReturn(1);
        int realKittensNumber = lion.getKittens();
        assertEquals("У льва должен быть один львенок.", expectedKittensNumber, realKittensNumber);
    }
}
