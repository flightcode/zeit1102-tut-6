import java.util.Scanner;

public class Tut6 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Tut6 tut = new Tut6();
        int x = -1;
        do {
            try {
                x = tut.getNumber();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println();
            }
        } while (x == -1);
        System.out.println(x + " inputted");
    }

    public int getNumber() throws Exception {
        System.out.println("Input positive integer: ");
        int x = -1;
        try {
            x = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println();
            return -1;
        }
        if (x < 0) {
            throw new NegativeException("String less than 0");
        }
        return x;
    }
}
