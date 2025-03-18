import java.util.Scanner;
public class B extends A{
    private String s;
    public B() {
        super(0);
        this.s = "";
    }
    public B(int x, String s){
        super(x);
        this.s = s;
    }
    public void readS(Scanner value){
        value.nextLine();
        this.s = value.nextLine();
    }
    public void displayXS(){
        super.displayX();
        System.out.println("s : " + this.s);
    }
}
