    package business;
/**
 *
 * @author Zach Karr
 */
    public class GuessHiLo extends Guessing {
    public static final int GAMETYPE = 1;
    
    public GuessHiLo (int gametype) {
    super(GAMETYPE);
    }
    @Override
    public String getInstructions() {
    return "Guess my random number "
    + "between 1 and 100.  I will give you hints after " 
    + "each guess telling you if you were too high or too low. "
    + "Enter zero to stop guessing.";   
    }
    @Override
    public String getGameName() {
    return "Guess My Number - High/Low";  
    }
    @Override
    public String getGuessResult() {
    String result;
    if (this.lastguess < this.rnum) {
        result = "Your guess of " + this.lastguess + 
        " is too low.\n";
    } else if (this.lastguess > this.rnum ) {
        result = "Your guess of " + this.lastguess + 
        " is too high.\n";
    } else {
        result = "You guessed it. (" + this.rnum + ")";
    }
    return result;
    }
    }


