public class Main {
    public static void main(String[] args) {
        // Exemplul 1: Variabilă primitivă (int)
        int a = 5;
        System.out.println("Exemplul 1 - Variabilă primitivă (înainte de apel): " + a);
        instantaPrim(a);
        System.out.println("Exemplul 1 - Variabilă primitivă (după apel): " + a);

        // Exemplul 2: Obiect (String)
        String b = "Salut";
        System.out.println("\nExemplul 2 - Obiect (String) (înainte de apel): " + b);
        instantaString(b);
        System.out.println("Exemplul 2 - Obiect (String) (după apel): " + b);

        // Exemplul 3: Obiect al unei clase
        MyClass c = new MyClass(5);
        System.out.println("\nExemplul 3 - Obiect personalizat (înainte de apel): " + c.value);
        instantaMyClass(c);
        System.out.println("Exemplul 3 - Obiect personalizat (după apel): " + c.value);
    }

    // Exemplu 1: Modificarea unei variabile primitive
    public static void instantaPrim(int a) {
        a = 10;
        System.out.println("Exemplul 1 - În interiorul funcției (variabilă primitivă): " + a);
    }

    // Exemplu 2: Modificarea unui obiect de tip String
    public static void instantaString(String a) {
        a = "Bună ziua";
        System.out.println("Exemplul 2 - În interiorul funcției (String): " + a);
    }

    // Exemplu 3: Modificarea unui obiect
    public static void instantaMyClass(MyClass a) {
        a.value = 10;
        System.out.println("Exemplul 3 - În interiorul funcției (MyClass): " + a.value);
    }
}

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}
