package Chapter6;

public class OpeneingProblem {
    public static void main(String[] args) {
        System.out.println(sum(1,7));
        
    }
    public static int sum(int start, int end){
        int total = 0;
        for(int i = start; i <= end; i++){
            total += i;

        }
        return total;
    }
    
}
