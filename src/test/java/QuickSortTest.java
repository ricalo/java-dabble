import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest extends BaseArraySortTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testWorstScenario() {
        int[] data = {4, 3, 2, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testSameNumber() {
        int[] data = {1, 1, 1, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testOneElement() {
        int[] data = {672};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testOddNumber() {
        int[] data = {4, 3, 5, 2, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testNegative() {
        int[] data = {-4, -3, -5, -2, -1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testSplitMiddle() {
        int[] data = {-4, -3, -5, 2, 1, 8, 0};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(isSorted(sortedData));
    }
}

