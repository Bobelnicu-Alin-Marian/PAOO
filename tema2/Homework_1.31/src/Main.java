public class Main {
    public static void main(String[] args) {
        // Creăm trei thread-uri, fiecare scriind într-un fișier diferit
        NumberWriter thread1 = new NumberWriter("file1.txt");
        NumberWriter thread2 = new NumberWriter("file2.txt");
        NumberWriter thread3 = new NumberWriter("file3.txt");

        // Pornim thread-urile
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
