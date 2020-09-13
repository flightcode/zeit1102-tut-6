import java.util.Scanner;

public class Tut6 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Tut6 tut = new Tut6();
        int x = -1;
        x = tut.getNumber();
        System.out.print(x + " inputted");
    }

    public int getNumber() {
        try {
            System.out.println("Input integer: ");
            int x = Integer.parseInt(input.nextLine());
            return x;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input");
            return -1;
        }
    }
}
