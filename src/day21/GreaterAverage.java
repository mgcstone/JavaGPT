package day21;

import java.util.Scanner;
//сколько элементов массива больше среднего арифметического
public class GreaterAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //присвоили переменной метод для создания массива
        int[]arr = newArray(scanner);
        //присвоили переменной метод для подсчета среднего арифметического
        double average = arithmeticMean(arr);
        //присвоили переменной метод для поиска значений больше среднего арифметического
        int count = findMoreAverage(average, arr);
        System.out.println("среднее арифметическое " + average);
        System.out.println("больше среднего арифметического " + count);
    }
    //создаем массив
    static int[] newArray(Scanner scanner){
        System.out.println("Введите размер массива: ");
        //
        int len = scanner.nextInt();
        int[]arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    //находим среднее арифметическое
    static double arithmeticMean(int[]arr){
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average = average / arr.length;
        return average;
    }
    //находим элементы больше среднего арифметического
    static int findMoreAverage(double average, int[]arr){
        int count = 0;
        //перебор через foreach value - элемент массива, arr - массив
        for (int value:arr){
            if (value > average){
                count++;
            }
        }
        return count;
    }
}
