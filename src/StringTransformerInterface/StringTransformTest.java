package StringTransformerInterface;

import org.testng.annotations.Test;

import static StringTransformerInterface.StringTransform.modifyString;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

public class StringTransformTest {

    @Test
    public void test_modifyString_2_LowerCase(){
        Transformable t = new ToLowerCaseTransform();
        assertEquals("aaa bb ccccc", modifyString("aaa BB ccccc", t));
    }
    @Test
    public void test_modifyString_3_UpperCase(){
        Transformable t = new ToUpperCaseTransform();
        assertEquals("AAA BB ccccc", modifyString("aaa BB ccccc", t));
    }

    @Test
    public void test_modifyString_NoTrasformation_LowerCase_EmptyString(){
        Transformable t = new ToLowerCaseTransform();
        assertEquals("", modifyString("", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_UpperCase(){
        Transformable t = new ToUpperCaseTransform();
        assertEquals("aa BB cc", modifyString("aa BB cc", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_LowerCase(){
        Transformable t = new ToLowerCaseTransform();
        assertEquals("aa B cc", modifyString("aa B cc", t));
    }
    @Test
    public void test_modifyString_NoTrasformation_LowerCase_1_Char(){
        Transformable t = new ToLowerCaseTransform();
        assertEquals("a", modifyString("a", t));
    }
    @Test
    public void test_modifyString_LowerCase_NULL(){
        Transformable t = new ToLowerCaseTransform();
        assertEquals("", modifyString(null, t));
    }


}