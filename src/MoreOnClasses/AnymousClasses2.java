package MoreOnClasses;

public class AnymousClasses2 {
    class A{
        public void print(){
            System.out.println("A");
        }
    }
    class B {
        public void main(String[] args) {
            A object = new A(){
                @Override public void print(){
                    System.out.println("Hello");
                }
            };
        }
    }
}
