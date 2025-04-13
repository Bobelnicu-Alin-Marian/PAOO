public class Main {
    public static void main(String[] args) {

        Curs curs = new Curs();
        Student student1 = new Student("Ion");
        Student student2 = new Student("Maria");
        Student student3 = new Student("Andrei");

        curs.adaugaStudent(student1);
        curs.adaugaStudent(student2);
        curs.adaugaStudent(student3);


        curs.prezenta();  // Toți studenții vor fi notificați și vor transmite statusul lor
    }
}
