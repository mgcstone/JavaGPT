package day22;

import java.util.Arrays;
import java.util.Scanner;
//работе с массивами и строками — поиск максимальной длины слова в строке.
public class FindMaxWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]arr = newArray(scanner);
        String max = findMax(arr);
        //Arrays.toString(arr) приводит массив к виду [привет, как, дела]
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
    //делим фразу на слова и создаем массив из этих слов
    static String[] newArray(Scanner scanner) {
        System.out.println("Введи фразу");
        String line = scanner.nextLine();
        String[]arr = line.split(" ");

        return arr;
    }
    //ищем максимальное слово
    static String findMax(String[]arr) {
        String max = arr[0];
        //через foreach перебирает и сравнивает с первым элементом массива
        for(String value:arr){
            if (value.length() > max.length()) max = value;
        }
        return max;
    }
}
