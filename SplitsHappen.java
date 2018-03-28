/*

 */
package splitshappen;

/**
 *
 * @author Keenan
 */
public class SplitsHappen {

    //This file just contains the test suite running the code, 
    //will require gameScore.java to function
    public static void main(String[] args) {
       String line1 = "XXXXXXXXXXXX";
       String line2 = "9-9-9-9-9-9-9-9-9-9-";
       String line3 = "5/5/5/5/5/5/5/5/5/5/5";
       String line4 = "X7/9-X-88/-6XXX81";
       
       System.out.println(gameScore.calc(line1));
       System.out.println(gameScore.calc(line2));
       System.out.println(gameScore.calc(line3));
       System.out.println(gameScore.calc(line4));
       
    }
    
}
