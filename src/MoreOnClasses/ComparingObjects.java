package MoreOnClasses;

public class ComparingObjects {
    public static void main(String[] args) {

    }
    class A {
        private int x;
        public void main(String[ ] args) {
            A a = new A();
            a.x = 5;
            A b = new A();
            b.x = 5;
            System.out.println(a == b);
        }
    }
}
