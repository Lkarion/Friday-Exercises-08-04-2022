package com.company;

import static com.company.Main.getSubstringWithMaxLength;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MainTest {

    @Test
    public void getSubstringWithMaxLengthTest_1_Char(){
        assertEquals(1, getSubstringWithMaxLength("a"));
    }
    @Test
    public void getSubstringWithMaxLengthTest_Empty_String(){
        assertEquals(0, getSubstringWithMaxLength(""));
    }
    @Test
    public void getSubstringWithMaxLengthTest_Longest_In_Middle(){
        assertEquals(3, getSubstringWithMaxLength("abbbcc"));
    }
    @Test
    public void getSubstringWithMaxLengthTest_Longest_At_End(){
        assertEquals(5, getSubstringWithMaxLength("abccccc"));
    }
}
