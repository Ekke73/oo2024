public class Main {
    public static void main(String[] args) {

        //KODUS: 3 funktsiooni, milles on kasutatud vähemalt nelja erinevat tyypi:
        // void, String, int, char, long, double, float, boolean
        // teha igast funktsioonist 2 erineva sisendiga väljakutset

        //intressi arvutamise ül
        double Rahakogus = intressiFunktsioon(100000, 1.02, 10);
        System.out.println(Rahakogus);

        String AntudHinne = Hinne(80);
        System.out.println(AntudHinne);

        String KooliSaatus = KooliKinniPanemine(102);
        System.out.println(KooliSaatus);
    }



        public static double intressiFunktsioon(double Raha, double intressAastas, int aastateArv) {
            return Raha * intressAastas * aastateArv;
        }


        public static String Hinne(float Protsent) {
            if (Protsent >= 90) {
                return "Hinne on 5";
            }
            if (75 <= Protsent && Protsent < 90) {
                return "Hinne on 4";
            }
            if (50 <= Protsent && Protsent < 75) {
                return "Hinne on 3";
            } else {
                return "Hinne on 2";
            }

        }

        public static String KooliKinniPanemine(int OpilasteArv) {
            if (OpilasteArv < 40) {
                return "Kool pannakse kindlasti kinni";
            }
            if (40 <= OpilasteArv && OpilasteArv < 100) {
                return "Haridus- ja teadusministeerium soovib koolib kinni panna";
            }
            if (100 <= OpilasteArv) {
                return "Kool jääb lahti";
            }
            else return null;



        }






}