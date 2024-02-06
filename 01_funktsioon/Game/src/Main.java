import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int kaardiKorgus = 5;
        int kaardiLaius = 10;

        int mangijaXCoord = saaKoordinat(random, kaardiLaius);
        int mangijaYCoord = saaKoordinat(random, kaardiKorgus);
        char mangijaSymbol = 'x';

        int draakonXCoord = saaKoordinat(random, kaardiLaius);
        int draakonYCoord = saaKoordinat(random, kaardiKorgus);
        char draakonSymbol = 'D';

        int orkXCoord = saaKoordinat(random, kaardiLaius);
        int orkYCoord = saaKoordinat(random, kaardiKorgus);
        char orkSymbol = 'O';

        Scanner scanner = new Scanner(System.in);
        prindiKaart(kaardiKorgus, kaardiLaius, mangijaXCoord, mangijaYCoord, mangijaSymbol, draakonXCoord, draakonYCoord, draakonSymbol, orkXCoord, orkYCoord, orkSymbol);
        String sisend = scanner.nextLine();

        switch (sisend) {
           case "w" -> mangijaYCoord--;
           case "s" -> mangijaYCoord++;
           case "a" -> mangijaXCoord--;
           case "d" -> mangijaXCoord++;
        }



        while (sisend.equals("end")) {

            prindiKaart(kaardiKorgus, kaardiLaius, mangijaXCoord, mangijaYCoord, mangijaSymbol, draakonXCoord, draakonYCoord, draakonSymbol, orkXCoord, orkYCoord, orkSymbol);
            sisend = scanner.nextLine();
            switch (sisend) {
                case "w" -> mangijaYCoord--;
                case "s" -> mangijaYCoord++;
                case "a" -> mangijaXCoord--;
                case "d" -> mangijaXCoord++;
            }
        }


// |||||


    } //main (args[])

    private static void prindiKaart(int kaardiKorgus, int kaardiLaius, int mangijaXCoord, int mangijaYCoord, char mangijaSymbol, int draakonXCoord, int draakonYCoord, char draakonSymbol, int orkXCoord, int orkYCoord, char orkSymbol) {
        for (int y = 0; y < kaardiKorgus; y++) {
            for (int x = 0; x < kaardiLaius; x++) {
                char symbol = ' ';
                if (y == 0 || y == kaardiKorgus -1) {
                    //System.out.print('-');
                    symbol = '-';
                } else if (x == 0 || x == kaardiLaius -1) {
                    //System.out.print('|');
                    symbol = '|';
                } else {
                    if (x == mangijaXCoord && y == mangijaYCoord) {
                        //System.out.print(mangijaSymbol);
                        symbol = mangijaSymbol;
                    } else if (x == draakonXCoord && y == draakonYCoord) {
                        //System.out.print(mangijaSymbol);
                        symbol = draakonSymbol; }
                    else if (x == orkXCoord && y == orkYCoord) {
                        //System.out.print(mangijaSymbol);
                        symbol = orkSymbol; {
                        }

                    }  else {
                        symbol = ' ';
                    }

                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static int saaKoordinat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }
} // main ()