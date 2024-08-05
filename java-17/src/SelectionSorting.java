public class SelectionSorting {
    public static void main(String[] args) {
        int arr[]={3,7,6,4,8,1,3};

        for(int i=0;i<arr.length-1;i++){
            int constant=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[constant]>arr[j]){
                    constant=j;
                }
            }
            int temp=arr[constant];
            arr[constant]=arr[i];
            arr[i]=temp;
        }



        for(int a:arr){
            System.out.print(a +" ");
        }
        System.out.println();


    }
}
