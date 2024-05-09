package MonteCarlo;

public class Monte {
    public static void main(String[] args) {
        int[] door = new int[3];
        double correct = 0;
        

        for (int i = 0; i < 1000000000; i++) {
            //establishing variables and setting door
            int carLocation = (int)(Math.random()*3);
            door[carLocation] = 1;
            int choice = (int)(Math.random()*3);

            int reveal = 0;
            
            //reveal
            switch (choice) {
                case 0:
                    if(door[1]==0){
                        reveal = 1;
                    }else{
                        reveal = 2;
                    }
                    break;

                case 1:
                if(door[0] == 0){
                    reveal = 0;
                }else{
                    reveal = 2;
                }
                break;

                case 2:
                if(door[0] == 0){
                    reveal = 0;
                }else{
                    reveal = 1;
                }
                break;

                default:
                System.out.println("error");
                    break;
            }

            boolean swap = ((int)Math.random()*2==1);
            door[reveal] = 5;
            
            if(swap){
                door[choice] = 5;
                for (int j = 0; j < 2; j++) {
                    if(door[i] != 5){
                        choice = i;
                    }
                }
            }
            if (door[choice] == 1){
                correct++;
            }
            

        }
        System.out.println(correct/1000000000);
        
    }
}
