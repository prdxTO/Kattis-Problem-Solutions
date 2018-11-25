import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bandwidthMb;
        int numOfMonths;

        bandwidthMb = in.nextInt();
        numOfMonths = in.nextInt();

        int previousBandwidth = 0;
        int usedBandwidth;

        for (int i = 0; i < numOfMonths; i++) {
            usedBandwidth = in.nextInt();
            previousBandwidth = (bandwidthMb + previousBandwidth) - usedBandwidth;
        }

        System.out.println(previousBandwidth + bandwidthMb);
        in.close();
    }
}
