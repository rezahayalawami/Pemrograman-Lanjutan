package MoreOnClasses;
import java.awt.*;
public class Enums1 {
    enum Color
    {
        RED, BLUE, GREEN;
    }

}

class PrintColor {

    public static void main(String[ ] args) {

        Color color = Color.RED;

        if (Color.BLUE.equals(color)) {
            System.out.println("1");
        } else if (Color.GREEN.equals(color)) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
