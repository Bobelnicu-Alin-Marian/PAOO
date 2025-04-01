import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Student>studenti = new ArrayList<>();
        studenti.add(new Student("Ion", 9.5));
        studenti.add(new Student("Vlad", 8));
        studenti.add(new Student("Gabriel", 5));
        studenti.add(new Student("Daniel", 7.5));
        studenti.add(new Student("Bogdan", 4.5));
        Collections.sort(studenti, Comparator.comparingDouble(Student::getNota).reversed());
        System.out.println("Lista sortată: " + '\n' );
        for(Student s : studenti)
        System.out.println(s);
    }

}