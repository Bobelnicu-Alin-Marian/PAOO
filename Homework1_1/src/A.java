import java.util.Scanner;

public class A
{
    private int x;
    public A(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
    public void displayX(){
        System.out.println("x = " + this.x);
    }
    public void readX(Scanner value){
        this.x = value.nextInt();
    }
}
