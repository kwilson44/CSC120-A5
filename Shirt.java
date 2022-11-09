/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

      /** displays a sweater
   *
   * There's no parameter or return value
   */

    public void display() {
        
        System.out.println("                       ._      _. ");
        System.out.println("                      /  `vvvv`  \\");
        System.out.println("                 _-^^`'-..____..-'`^^-_");
        System.out.println("                /`\\                    /`\\");
        System.out.println("               /`  |                  |  `\\");
        System.out.println("              /`   |    Pumpkin       |   `\\");
        System.out.println("             /     |                  |     \\");
        System.out.println("            /      /     Spicy        \\      \\");
        System.out.println("           /       |                  |        \\");
        System.out.println("          '-._____.|       ;)         |._____.-'");
        System.out.println("            \\___\\  |                  | \\___\\");
        System.out.println("                   |                  |");
        System.out.println("                   |                  |");
        System.out.println("                    `.---------------.`");


    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
