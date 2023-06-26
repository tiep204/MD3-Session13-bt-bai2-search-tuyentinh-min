import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("số nhỏ nhất trong mảng là: "+min);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}