/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * TODO: Modify this method to print ASCII Art Boot
     */

       /** displays shoes
   *
   * There's no parameter or return value
   */

    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("                   |mwmwmw|");
        } else if (this.direction.equals("right")) {
          System.out.println("    |mwmwmw|");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
