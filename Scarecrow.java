/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */ 

class Scarecrow {


//instance variables for each section of the scarecrow
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
   // private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;


     /** adds emphasis to a word
   * @param si: the banner itself that contains the words 
   * @param h: pumpkin head
   * @param s: snazzy shirt 
   * @param p: pants with cool belt 
   * @param l: left boot
   * @param r: right boot
   * @param m: text on banner
   * no return value :(
   */
    public Scarecrow(Banner si, Pumpkin h,Shirt s,Pants p,Boot l, Boot r,String m) {
        head = h;
        body = s;
        legs = p;
        leftFoot = l;
        rightFoot = r;
        sign = si;
        message = m;

    }

   


 /** displays the scarecrow
   * 
   * no param or return value :(
   *    */
    public void display() {
        
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    
    /* Main method (for testing) */
    public static void main(String[] args) {


        // TODO: Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Banner ("Have a magical fall everyone!"), new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new String());

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            myScarecrow.message = args[0];
        }

        myScarecrow.display();
    }

}
