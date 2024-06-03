public class MultiDArray{
    public static void main(String[] args) {
        int a[][] = new int [4][];
        a[0] = new int [3];
        a[1] = new int [2];
        a[2] = new int [4];
        a[3] = new int [5];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }

        for(int n[]:a){
            for(int num : n){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}