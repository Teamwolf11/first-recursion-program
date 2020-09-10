package week03;

/**
 *  A recursive representation of a tower of blocks.
 *
 * @author Michael Albert
 */
public class Tower{

    /** The top block. */
    private char top;
 
    /** The rest of the tower. */
    private Tower rest;

    /**
     * Creates a new empty Tower.
     */
    public Tower() {
        this.top = ' ';
        this.rest = null;
    }

    /**
     *  External classes can only create empty towers and manipulate
     *  them using public methods, because this constructor is
     *  private.
     * @param top the top block in this tower
     * @param rest the rest of the tower
     */
    private Tower(char top, Tower rest) {
        this.top = top;
        this.rest = rest;
    }

    /**
     *  Returns true if this tower is empty, otherwise false.  Empty
     *  towers are represented with the top block being a space
     *  character.
     * @return whether the tower is empty or not.
     */
    public boolean isEmpty() {
        return top == ' ';
    }

    /**
     *  Creates a new tower by adding the given block to the top of
     *  this tower.
     * @param block a block to add to the top of this tower.
     * @return a new tower created by adding a block to the top of
     * this tower.
     */
    public Tower add(char block) {
        return new Tower(block, this);
    }
    /**
       it tells you the height of the tower.
       @return height of the tower
    */
    public int height(){
        if (this.isEmpty()){
            return  0;
        }else{
            return 1+ this.rest.height();
        }//end else
    }// end method
    /** counts the number of blocks equal to c in tower.
        @param c is the character to test
        @return number of times it matches
    */
    public int count (char c){
        if (this.isEmpty()){
            return 0;
        }else if(c==top){
            return 1+rest.count(c);
        }else{
            return 0+rest.count(c);
        }//end else
    }//end method

    
}//end class
