package Chapter8;

public class array {
    public static void main(String[] args) {
        int[][][] table = new int[2][2][2];
        for (int[][] is : table) {
            for (int[] is2 : is) {
                for (int is3 : is2) {
                    System.out.println(is3);
                }
            }
        }
    }
}
