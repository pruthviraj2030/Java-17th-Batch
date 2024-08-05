public class TowerOfHonai {
    public static void main(String[] args) {
        towerMoves(5,'A','C', 'B');
    }

    //loop


    static void towerMoves(int n, char fromRod, char toRod, char helperRod){

        if(n==1){
            System.out.println("Take the disk " + fromRod +" to rod " + toRod);
            return;
        }
        towerMoves(n-1, fromRod,helperRod,toRod);
        System.out.println("Take the disk  from Rod " + fromRod + " to rod "+ toRod);
        towerMoves(n-1,helperRod, toRod, fromRod);
    }
}
