package tasks;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        task_3();
    }

    public static void task_3() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(arr));
        int el = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if( arr[i] == 3) {

                int position = i;
                for (int j = arr.length - 1; j > i; j--) {
                    if(arr[j] == 3) {
                        continue;
                    }
                    else{
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }

            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
