public class Triangle {

    public static void main(String[] args) {
        int n=6;

        rhombus(n);

    }

    private static void rhombus(int n) {
        for(int i = 1; i<= n; i++){ //i=2
            for(int k=1;k<i;k++)
                System.out.print(" ");
            for (int l = 1; l<= n; l++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }

    private static void triangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }


}
