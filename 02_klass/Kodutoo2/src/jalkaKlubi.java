public class jalkaKlubi {
    double punktideArv;
    float sissetulek;
    float valjaminek;
    double varvateArv;
    double sisselastudVaravateArv;
    String hooajaParimMangija;

    public jalkaKlubi(double punktideArv, float sissetulek, float valjaminek, double varvateArv, double sisselastudVaravateArv, String hooajaParimMangija) {
        this.punktideArv = punktideArv;
        this.sissetulek = sissetulek;
        this.valjaminek = valjaminek;
        this.varvateArv = varvateArv;
        this.sisselastudVaravateArv = sisselastudVaravateArv;
        this.hooajaParimMangija = hooajaParimMangija;
    }

    public String Kasum(){
        if (sissetulek-valjaminek > 0){
            return "Klubi jäi kasumisse";
        } else {
            return "Klubi ei jäänud kasumisse";
        }
    }
    public double varavateVahe() {
        return varvateArv-sisselastudVaravateArv;
    }




}
