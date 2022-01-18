    package business;
/**
 *
 * @author Zach Karr
 */
    public interface Game {
    public String getGameName(); 
    public String getInstructions(); 
    public void makeGuess(int guess);
    public String getGuessResult(); 
    public String getErrorMsg(); 
    public boolean isOver(); 
    public String getEndMsg(); 
    }