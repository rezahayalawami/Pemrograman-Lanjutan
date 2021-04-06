package ExceptionsListsThreadsAndFiles;

public class Module6quiz2 {
    void myFunc(int arg)
            throws IllegalArgumentException
    {
        if (arg < 0) {
            throw new IllegalArgumentException();
        }
    }
}
