public class EvenSum {
    public static void main(String[] args) {
        int[] array = {1,4,7,8,15,16,92,85,73};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}
