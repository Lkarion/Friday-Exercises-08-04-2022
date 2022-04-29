package StringDifLength;

import org.testng.annotations.Test;
import static StringDifLength.StringsDifLength.modifyString;
import static org.testng.AssertJUnit.assertEquals;

public class StringsDifLengthTest {

    @Test
    public void test_modifyString_4_LowerCase(){
        Transformation t = new ToLowerCaseTransform();
        assertEquals("aaa bbbb ccccc", modifyString("aaa BBBB ccccc", t));
    }
    @Test
    public void test_modifyString_3_UpperCase(){
        Transformation t = new ToUpperCaseTransform();
        assertEquals("AAA BBBB ccccc", modifyString("aaa BBBB ccccc", t));
    }
    @Test
    public void test_modifyString_5_Stars(){
        Transformation t = new ToStarsTransform();
        assertEquals("aaa BBBB *****", modifyString("aaa BBBB ccccc", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_LowerCase_EmptyString(){
        Transformation t = new ToLowerCaseTransform();
        assertEquals("", modifyString("", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_Stars(){
        Transformation t = new ToStarsTransform();
        assertEquals("aaa BBBB cc", modifyString("aaa BBBB cc", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_UpperCase(){
        Transformation t = new ToUpperCaseTransform();
        assertEquals("aa BB cc", modifyString("aa BB cc", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_LowerCase(){
        Transformation t = new ToLowerCaseTransform();
        assertEquals("aa BB cc", modifyString("aa BB cc", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_LowerCase_1_Char(){
        Transformation t = new ToLowerCaseTransform();
        assertEquals("a", modifyString("a", t));
    }
    @Test
    public void test_modifyString_LowerCase_NULL(){
        Transformation t = new ToLowerCaseTransform();
        assertEquals("", modifyString(null, t));
    }

}