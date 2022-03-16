import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SquareEquationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testGetRoots_zero() {
        SquareEquation equation = new SquareEquation(1, 4, 49);
        equation.getRoots();
    }

    @Test
    public void testGetRoots_one() {
        SquareEquation equation = new SquareEquation(1, -14, 49);
        assertEquals("[7.0]", Arrays.toString(equation.getRoots()));
    }

    @Test
    public void testGetRoots_two() {
        SquareEquation equation = new SquareEquation(1, -8, 7);
        assertEquals("[7.0, 1.0]", Arrays.toString(equation.getRoots()));
    }
}