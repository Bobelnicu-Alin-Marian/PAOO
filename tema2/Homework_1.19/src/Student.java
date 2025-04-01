public class Student {
    private String nume;
    private double nota;
    public Student(String _nume, double _nota) {
        this.nume = _nume;
        this.nota = _nota;
    }
    public double getNota(){
        return nota;
    }
    @Override
    public String toString() {
        return nume + ' ' + nota + '\n';
    }
}
