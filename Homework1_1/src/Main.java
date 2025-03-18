import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner value  = new Scanner(System.in);
        C object = new C(0, "", 0.0f);
        object.displayXYS(value);
        value.close();
    }
}