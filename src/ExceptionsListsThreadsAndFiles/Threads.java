package ExceptionsListsThreadsAndFiles;

public class Threads {
    class A extends Threads {
        public void run() {
            System.out.println("hello");
        }

        public void main(String[] args) {
            A object = new A();
            object.Start();
        }

        private void Start() {
        }
    }
}
