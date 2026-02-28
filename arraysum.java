import java.util.*;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int sum = 0;
        System.out.println("Enter 6 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        System.out.println("Array elements are:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);

        }
        System.out.println("summ is" + sum);

    }

}
