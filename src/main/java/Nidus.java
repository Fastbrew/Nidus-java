/* Nidus Java POC. This POC should include a player interface and a random game simulation.
 * 
 * Authors:
 * <me@christianlang.io>
 */


public class Nidus {
    String text = "Hello World";
    String otherText = "Hello Universe";

    public static void main(String[] args) {
        Nidus nidus = new Nidus();

        System.out.println(nidus.text);
        System.out.println(nidus.otherText);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
