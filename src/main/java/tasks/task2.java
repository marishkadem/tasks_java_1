/*Написать метод, который определяет, является ли год високосным,
 и возвращает boolean (високосный - true, не високосный - false).
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/


package tasks;

public class task2 {
    public static void main(String[] args) {
        task_2(2023);
    }

    public static void task_2(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " - не високосный год");
        else System.out.println(year + " - високосный год");
    }
}