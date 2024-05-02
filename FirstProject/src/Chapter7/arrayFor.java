package Chapter7;

public class arrayFor {
    public static void main(String[] args) {
        int A[] = new int[3];
        int B[] = {
            1,2,3
        };
        for(int a : A){
            System.out.println(a);
        }
        System.arraycopy(B, 0, A, 0, 3);
        System.out.println(A[1]);

        int y = 100;
        printA(y);
        System.out.println(y);
    }

        public static void printA(int x){

           x = 4;
           System.out.println(x);
        }

}
