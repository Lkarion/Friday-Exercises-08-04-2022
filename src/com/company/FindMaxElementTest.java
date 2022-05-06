package com.company;

import org.junit.jupiter.api.Assertions;
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

    @Test
    public void test_findMax_Empty(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            FindMaxElement.findMax(new int[]{});
        });
    }
    @Test
    public void test_findMax_Null(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            FindMaxElement.findMax(null);
        });
    }
}