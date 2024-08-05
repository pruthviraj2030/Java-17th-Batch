public class Recursion {
    public static void main(String[] args) {
        int sum=newMethod(5);
    }

    static int newMethod(int i) {
        return i == 0 ? i : i + newMethod(--i);
    }
}

