package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void test_getSquare_Circle_Normal(){
        Shape s1 = new Circle(5);
        assertEquals((int)(5*2*Math.PI), s1.getSquare());
    }
    @Test
    void test_getSquare_Circle_Zero(){
        Shape s1 = new Circle(0);
        assertEquals(0, s1.getSquare());
    }
    /*@Test
    void test_getSquare_Circle_Null(){
        Shape s1 = null;
        assertEquals((int)(5*2*Math.PI), s1.getSquare());
    }*/

    /*@Test
    void test_getSquare_Circle_Negative(){
        Shape s1 = new Circle(-5);
        assertEquals((int)(5*2*Math.PI), s1.getSquare());
    }*/

    @Test
    void test_getSquare_Square_Normal(){
        Shape s1 = new Square(5);
        assertEquals(25, s1.getSquare());
    }
    @Test
    void test_getSquare_Square_Zero(){
        Shape s1 = new Square(0);
        assertEquals(0, s1.getSquare());
    }
    @Test
    void test_getSquare_Rectangle_Normal(){
        Shape s1 = new Rectangle(2,5);
        assertEquals(10, s1.getSquare());
    }
    @Test
    void test_getSquare_Rectangle_Zero(){
        Shape s1 = new Rectangle(0,0);
        assertEquals(0, s1.getSquare());
    }


    @Test
    void test_compareTo_Squares_Normal_FirstIsMore(){
        Shape s1 = new Square(2);
        Shape s2 = new Square(3);
        assertEquals(-5, s1.compareTo(s2));
    }
    @Test
    void test_compareTo_Squares_Normal_SecondIsMore(){
        Shape s1 = new Square(3);
        Shape s2 = new Square(2);
        assertEquals(5, s1.compareTo(s2));
    }
    @Test
    void test_compareTo_Squares_Normal_Equal(){
        Shape s1 = new Square(3);
        Shape s2 = new Square(3);
        assertEquals(0, s1.compareTo(s2));
    }
}