import java.util.Scanner;
public class C extends B {
    private float y;

    public C(int x, String s, float y) {
        super(x, s);
        this.y = y;
    }

    public void readY(Scanner value) {
        this.y = value.nextFloat();
    }

    public void displayXYS(Scanner value) {
        readX(value);
        readS(value);
        readY(value);
        super.displayXS();
        System.out.println("y : " + this.y);
    }
}

