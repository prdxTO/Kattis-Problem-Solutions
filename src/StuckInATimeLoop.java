import java.util.Scanner;

public class StuckInATimeLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        for (int i = 0; i < j; i++) {
            System.out.println((i + 1) + " Abracadabra");
        }
    }
}
