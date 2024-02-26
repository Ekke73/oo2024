public class Ounad {
    String sort;
    float kogus;
    float hind;
    float vanusPaevades;
    String varv;

    public Ounad(String sort, float kogus, float hind, float vanusPaevades, String varv) {
        this.sort = sort;
        this.kogus = kogus;
        this.hind = hind;
        this.vanusPaevades = vanusPaevades;
        this.varv = varv;
    }

    public void ounaKakluaator(float kogus, float hind) {
        System.out.println(kogus * hind);
    }

    public String ounaKolblikus(){
        if (vanusPaevades <= 3) {
            return "Tegemist on värske õunaga";
        } else if(vanusPaevades <= 10) {
            return "Tegemist on söödava õunaga";
        } else {
            return "Tegemist on mitte kõlbliku õunaga";
        }
    }
}
