package MoreOnClasses;

public class AnymousClasses1 {
    public static void main(String[] args) {
    }
    class Machine{
        Machine m = new Machine();{
        }
    }
    public void start(){
    }
    static{
        System.out.print("Hi");
    }
}
