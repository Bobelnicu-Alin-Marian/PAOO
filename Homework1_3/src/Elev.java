public class Elev {
    private String nume;
    private int varsta ;
    private float medie;
    public Elev(String _s, int _x, float _y){
        this.nume = _s;
        this.varsta = _x;
        this.medie = _y;
    }
    @Override
    public String toString(){
        return nume + " are " + varsta + " ani si a obtinut media "+ medie;
    }
}
