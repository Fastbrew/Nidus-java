/* Nidus Java POC. This POC should include a player interface and a random game simulation.
 * 
 * Authors:
 * <me@christianlang.io>
 */


package main.java;
import main.java.units.*;

public class Nidus {
    String text = "Hello World";
    String otherText = "Hello Universe";

    public static void main(String[] args) {
        Nidus nidus = new Nidus();
        Unit unit = new Unit();

        System.out.println(nidus.text);
        System.out.println(nidus.otherText);
        System.out.println(unit.name);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
