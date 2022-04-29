package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxElementTest {

    @Test
    void test_findMax_Normal(){
        assertEquals(5, FindMaxElement.findMax(new int[]{3,2,5,1}));
    }
    @Test
    void test_findMax_All_0(){
        assertEquals(0, FindMaxElement.findMax(new int[]{0,0,0}));
    }
    @Test
    void test_findMax_Negativ(){
        assertEquals(-1, FindMaxElement.findMax(new int[]{-4,-1,-9}));
    }

    //TODO tests on Exceptions: null and empty array
    /*@Test
    void test_findMax_Empty(){
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        }, "NumberFormatException was expected");

        Assertions.assertEquals("For input string: \"One\"", thrown.getMessage());
        assertEquals(-1, FindMaxElement.findMax(new int[]{}));
    }*/
}