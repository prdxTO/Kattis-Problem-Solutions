import java.util.Scanner;

public class Sibice {

    public static void main(String[] args) {
        //Happy Paths Only :)
        int numOfMatches, width, height;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in);

        String boxInputLine = scanner.nextLine();
        String[] boxInputDimensionArr = boxInputLine.split(" ");
        numOfMatches = Integer.valueOf(boxInputDimensionArr[0]);
        width = Integer.valueOf(boxInputDimensionArr[1]);
        height = Integer.valueOf(boxInputDimensionArr[2]);

        hypotenuse = Math.sqrt((width*width) + (height*height));
        for (int i = 0; i < numOfMatches; i++) {
            int x = scanner.nextInt();

            if (x <= hypotenuse) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
        scanner.close();
    }
}