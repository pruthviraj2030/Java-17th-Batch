public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8};
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;
        int target = 8;
        int iterations=1;
        for (;start<=end;) {
            if (arr[mid]<target)
                start=mid+1;
            else if (arr[mid] == target) {
                System.out.println("found");
                return;
            }
            else
                end=mid-1;
            mid=(start+end)/2;

            System.out.println(iterations);
            iterations++;
        }

        System.out.println("Not found");

    }
}
