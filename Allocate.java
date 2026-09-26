public class Allocate {
    public static void main(String[] args){
        final int ROOMS = 10;
        final int NUM_NAMES = 21;
        char[] gender = new char[NUM_NAMES];
        String[] names = new String[NUM_NAMES];
        String[] courses = new String[NUM_NAMES];
        int[] roomNumbers = new int[ROOMS];
        studentdetails(names, gender, courses, roomNumbers);

    }

    public static void studentdetails(String[] names, char[] gender, String[] courses, int[] roomNumbers) {
    
        int M = 0;
        int F = 0;


        for (int i = 0; i < names.length; i++) {
            for (int k=0; k<roomNumbers.length; k++){
                if (gender[i] == 'M'&& k/2< 21) {
                    M++;
                    System.out.println("Room Number:"+ k/2 + " Name:" + names[i]);
                } else if (gender[i] == 'F'&& k/2< 21) {
                    F++;
                    System.out.println("Room Number:"+ k/2 + " Name:" + names[i]);
                }
            }

        }


        for (int j=0; j<names.length; j++){
            if (M%2 !=0 || F%2 !=0){
                System.out.println("WAITLIST:"+names[j]);
            }
        }
        
        
        

        

        


    }

}
