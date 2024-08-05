public class MovingZerosTwoPointers {
    public static void main(String[] args) {
        int arr[]={1,5,0,6,0,7,9,0,8,0,0,0,1};



        int left =0,right=0;
        while(left< arr.length){
            if(arr[left]!=0){
                arr[right]=arr[left];
                right++;
            }
            left++;
        }

        while (right < arr.length) {
            arr[right++]=0;
        }

        for (int a:arr){
            System.out.print(a +" ");
        }



    }
}
