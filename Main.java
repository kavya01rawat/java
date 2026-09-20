import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner kid = new Scanner(System.in)) {
            int [][] room = new int[2][11];
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 11; j++){
                    room[i][j]= kid.nextInt();
            }
        }
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 11; j++)
                System.out.println(room[i][j]);
            }
        
       }
    }
}