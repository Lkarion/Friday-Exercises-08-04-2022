package shapes.Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test_getSumSquare_Normal(){
        ShapesInterface s3 = new Rectangle(5,2);
        ShapesInterface s4 = new Square(5);
        assertEquals(35,Solution.getSumSquare(s3,s4));
    }
    @Test
    void test_getSumSquare_Zero(){
        ShapesInterface s3 = new Rectangle(0,0);
        ShapesInterface s4 = new Square(0);
        assertEquals(0,Solution.getSumSquare(s3,s4));
    }
}