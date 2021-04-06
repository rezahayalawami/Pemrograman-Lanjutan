package Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class ReserveAString {
public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String text = Scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        String rev = "";
        for(char i:arr){
        rev = i + rev;
        }
        System.out.println(rev);
        }
}
