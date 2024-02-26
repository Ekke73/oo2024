public class Main {
    public static void main(String[] args) {
        Ounad esimene = new Ounad("Valgeklaar", 3, 4, 3, "roheline");
        Ounad teine = new Ounad("Kuldrenett", 5, 2, 8, "kollane");


        esimene.ounaKakluaator(3,4);
        teine.ounaKakluaator(5,2);

        String esimeneOunaKolblikus = esimene.ounaKolblikus();
        System.out.println(esimeneOunaKolblikus);
        String teineOunaKolblikus = teine.ounaKolblikus();
        System.out.println(teineOunaKolblikus);

        jalkaKlubi one = new jalkaKlubi(81, 50000000, 40000000, 81, 32, "Messi");
        jalkaKlubi two = new jalkaKlubi(64, 35000000, 42000000, 61, 40, "Benzema");

        String oneKasum = one.Kasum();
        System.out.println(oneKasum);
        String twoKasum = two.Kasum();
        System.out.println(twoKasum);

        Double oneVaravatevahe = one.varavateVahe();
        System.out.println(oneVaravatevahe);
        Double twoVaravatevahe = two.varavateVahe();
        System.out.println(twoVaravatevahe);
    }
}