public class Allocate {
    public static void main(String[] args) {
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
        int room = 1;

        for (int i = 0; i < names.length; i++) {
            for (int k = 0; k < roomNumbers.length; k++) {
                if (gender[i] == 'M' && k / 2 < 21) {
                    M++;

                } else if (gender[i] == 'F' && k / 2 < 21) {
                    F++;

                }
            }
            for (int k = 0; k < names.length && room <= roomNumbers.length; k++) {
                if (gender[k] == 'M') {
                    System.out.println("Room Number: " + room + " Name: " + names[k]);
                    for (int j = k + 1; j < names.length; j++) {
                        if (gender[j] == 'M') {
                            System.out.println("Room Number: " + room + " Name: " + names[j]);
                            room++;
                            break;
                        }
                    }
                } else if (gender[k] == 'F') {
                    System.out.println("Room Number: " + room + " Name: " + names[k]);
                    // Find another female student for
                    for (int j = k + 1; j < names.length; j++) {
                        if (gender[j] == 'F') {
                            System.out.println("Room Number: " + room + " Name: " + names[j]);
                            room++;
                            break;
                        }
                    }
                }
            }
        }

        if (room > roomNumbers.length) {
            for (int j = 0; j < names.length; j++) {
                if (j >= roomNumbers.length * 2) {
                    System.out.println("WAITLIST: " + names[j]);
                }
            }
        }

    }

}