package insertionsorttest;

import insetrionsort.InsertionSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;

public class InsertionSortTest {

    private int[] arr = new int[20];
    private int[] arrCopy = new int[arr.length];
    private final InsertionSort insertionSort = new InsertionSort();

    @Before
    public void initArr(){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopy));
    }

    @Test
    public void shouldSortArr(){
        Assert.assertArrayEquals(arr, insertionSort.insertionSort(arrCopy));
    }
}