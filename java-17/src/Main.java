public class Main {
    public static void main(String[] args){

        int arr[]={1,5,0,6,0,7,9,0,8,0,0,0};

        int endingIndex= arr.length-1;
        boolean allZeros=false;


        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                if(arr[endingIndex]==0) {
                    for (int j = endingIndex; j > 0; j--) {
                        if (endingIndex==i) {
                            allZeros=true;
                            break;
                        }
                        if (arr[j]!=0)
                            break;
                        endingIndex--;
                    }
                }
                if (allZeros)
                    break;
                int temp=arr[i];
                arr[i]=arr[endingIndex];
                arr[endingIndex--]=temp;
            }
        }







        for(int a: arr)
            System.out.print(a+ " ");

    }
}