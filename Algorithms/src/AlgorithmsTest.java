import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AlgorithmsTest {
    @Test
    public void smallestNumberInAListOfPositives() {
        int[] li = {9, 12, 18, 4, 5};
        assertEquals(42, Algorithms.smallest(li));
    }

    @Test
    public void smallestNumberInAListWithNegatives() {
        int[] li = {5, 2, -4, 6, -5, -3};
        assertEquals(-53, Algorithms.smallest(li));
    }

    @Test
    public void indexOfSmallestNumber() {
        int[] li = {5, 8, 13, 4, 9};
        assertEquals(3, Algorithms.indexOfSmallest(li));
    }

    @Test
    public void indexOfSmallestNumberDuplicates() {
        int[] li = {5, 5, 8, 13, 8, 4, 9, 4, 5};
        assertEquals(5, Algorithms.indexOfSmallest(li));
    }

    @Test
    public void indexOfSmallestNumberAfterIndex() {
        int[] li = {-1, 6, 9, 8, 12};
        assertEquals(0, Algorithms.indexOfSmallestFrom(li, 0));
        assertEquals(1, Algorithms.indexOfSmallestFrom(li, 1));
        assertEquals(3, Algorithms.indexOfSmallestFrom(li, 2));
    }

    @Test
    public void swappingTwoElements() {
        int[] li = {3, 2, 5, 4, 8};
        Algorithms.swap(li, 1, 0);
        assertEquals(new int[]{2, 3, 5, 4, 8}, li);
        Algorithms.swap(li,0, 3);
        assertEquals(new int[]{4, 3, 5, 2, 8}, li);
    }

    @Test
    public void selectionSort() {
        int[] li = {8, 3, 7, 9, 1, 2, 4};
        Algorithms.selectionSort(li);
        assertEquals(new int[]{1, 2, 3, 4, 7, 8, 9}, li);
    }

    @Test
    public void linearSearchMiddle() {
        int[] li = {2, 5, 7, 12, 15, 17, 60, 65, 90, 98, 99, 99, 100};
        assertEquals(2, Algorithms.linearSearch(li, 7));
    }

    @Test
    public void linearSearchFirst() {
        int[] li = {2, 5, 7, 12, 15, 17, 60, 65, 90, 98, 99, 99, 100};
        assertEquals(0, Algorithms.linearSearch(li, 2));
    }

    @Test
    public void linearSearchLast() {
        int[] li = {2, 5, 7, 12, 15, 17, 60, 65, 90, 98, 99, 99, 100};
        assertEquals(12, Algorithms.linearSearch(li, 100));
    }

    @Test
    public void binarySearchMiddle() {
        int[] li = {2, 5, 7, 12, 15, 17, 60, 65, 90, 98, 99, 99, 100};
        assertEquals(2, Algorithms.binarySearch(li, 7));
    }

    @Test
    public void binarySearchFirst() {
        int[] li = {2, 5, 7, 12, 15, 17, 60, 65, 90, 98, 99, 99, 100};
        assertEquals(0, Algorithms.binarySearch(li, 2));
    }

    @Test
    public void binarySearchLast() {
        int[] li = {2, 5, 7, 12, 15, 17, 60, 65, 90, 98, 99, 99, 100};
        assertEquals(12, Algorithms.binarySearch(li, 100));
    }
}
