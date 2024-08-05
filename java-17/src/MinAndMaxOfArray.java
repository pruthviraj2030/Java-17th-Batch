import java.util.Scanner;

public class MinAndMaxOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = {1,2,56,3,4,8,6};

        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int min = Integer.MAX_VALUE; //999999   1000000000

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }


        System.out.println("min: " + min + "    " + "max: " + max);

    }

}
