public class C2ToC3Adapter {
    public static C3Nr convert(C2Nr c2Nr) {
        return new C3Nr(c2Nr.getA(), c2Nr.getB(), 0); // adăugăm 0 ca al 3-lea număr
    }
}
