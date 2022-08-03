package quicksort;

import java.util.Random;

public class Qsort {

    public void qsort(int[] arr, int low, int high){
        Random rand = new Random();
        int indPickNum = rand.nextInt();
        int pickNumArr = arr[rand.nextInt(low + (high + low)/2)];

    }
}
