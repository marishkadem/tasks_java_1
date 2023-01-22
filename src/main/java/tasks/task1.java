


package tasks;
import java.util.Arrays;
import java.util.Random;

    public class task1 {

        public static void main(String[] args) {
            task_1();
        }
        // Задать одномерный массив и найти в нем минимальный и максимальный элементы

        public static void task_1() {
            int[] arr = new int[10];
            int max = arr[0];
            int min = arr[0];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(11);
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                        max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                        min = arr[i];
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("max = " + (max));
            System.out.println("min = " + (min));

            }

        }
