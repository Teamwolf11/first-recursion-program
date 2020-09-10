package week03;


/**
   This program is a recursive one.
   It counts digits and sum of digits

    @author Mike cui
*/

public class RecursiveApp{

    
    /**This is the main method for testing purposes only.
     @param args ignored.*/
    
    public static void main (String args []){
        // System.out.println(digits(251));
        // System.out.println(sumOfDigits(-251));

    }//end main
    /** tells you how many digits the input was.
        @return number of digits in the input.
@param n the input number
    */
    public static long  digits(long n){

        if (n <10){
            return 1;
        }else{
            return 1+digits(n/10);
        }
    }//end method
    /** the sum of digits works for negative as well.
        @return the sum of digits
        @param n the input number
    */
    public static long sumOfDigits(long n){
    
        // n= Math.sqrt(n^2); // removes the negative sign
   

        if (n==0){
            return 0;
        }else{
          
            return n%10+sumOfDigits(n/10);
       
        }//end else
    }//end method
}//end ckass
