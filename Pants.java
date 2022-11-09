/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

      /** displays pants
   *
   * There's no parameter or return value
   */

    
    public void display() {
        System.out.println("                   '=========GG========.");
        System.out.println("                   |________/|\\________|");
        System.out.println("                   |        ´|`         |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |         |          |");
        System.out.println("                   |_________|__________|");    }


    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
