package lab10;
import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class testselectionsort {

    private selectionsort sort = new selectionsort();

    @Test
    public void testPositives() {
        int[] input = {29, 64, 25, 12, 22};
        int[] expected = {12, 22, 25, 29, 64};
        sort.basicSelectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNegatives() {
        int[] input = {-29, -64, -25, -12, -22};
        int[] expected = {-64, -29, -25, -22, -12};
        sort.basicSelectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMixed() {
        int[] input = {0, -64, 25, -15, 28};
        int[] expected = {-64, -15, 0, 25, 28};
        sort.basicSelectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testDuplicates() {
        int[] input = {22, -64, 25, 22, -64};
        int[] expected = {-64, -64, 22, 22, 25};
        sort.basicSelectionSort(input);
        assertArrayEquals(expected, input);
    }
}