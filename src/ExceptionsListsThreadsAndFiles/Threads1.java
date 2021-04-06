package ExceptionsListsThreadsAndFiles;

public class Threads1 {
    static class A implements Runnable{
        public void run() {
            System.out.println("Bye");
        }
    }
    public class App {
        public void main(String[] args) {
            Thread ob = new Thread(new A());
            ob.start();
        }
    }
}
