import java.util.ArrayList;

/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;
    ArrayList<String> resize = new ArrayList<String>();

    /* Constructor */
    public Banner(String m) {
        this.message = m;
        int count = m.length();

        for (int i = 0; i < count; i++){
            resize.add("*");
        }
    }

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the message
     */

       /** displays a banner
   *
   * There's no parameter or return value
   */

    public void display() {
        
        for (String k : resize) {
            System.out.print(k);
        }
        System.out.println("");
        System.out.println("* " + this.message + " *");

        for (String k : resize) {
            System.out.print(k);
        }

        System.out.println("");

        for (String k : resize) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (String k : resize) {
            System.out.print(" ");
        }
        
        System.out.println("**");


        for (String k : resize) {
            System.out.print(" ");
        }

        System.out.println("*");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello World");
        myBanner.display();
    }
}
