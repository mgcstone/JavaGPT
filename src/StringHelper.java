import java.util.Scanner;

public class StringHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        System.out.println("В фразе " + countVowels(str) + " гласных");
        System.out.println("В фразе " + countConsonants(str) + " согласных");
        System.out.println("Строка наоборот: " + reverseString(str));
//        System.out.println(reverseString(str));
    }
    static int countVowels(String str){
        String vowels = "аеёиоуыэюя";
        int count = 0;
        for (char ch:str.toCharArray()){
            if (vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
    static int countConsonants(String str ){
        String consonants = "бвгджзклмнпрстфхцчшщ";
        int count = 0;
        for (char ch:str.toCharArray()){
            if (consonants.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
    static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

}
