    package business;
    import java.util.Random;
/**
 *
 * @author Zach Karr
 */
    abstract public class Guessing implements Game{
        
    private String endmsg, errmsg;
    protected int gametype, rnum, lastguess;
    protected int prevcat, prevdiff;
    private boolean over;
    protected int gcount;
    
    public Guessing(int gametype){
    setRandom();
    this.gametype = gametype;
    this.over = false;
    this.gcount = 0;
    this.endmsg = "";
    this.errmsg = "";
    this.lastguess = -1;
    }
    private void setRandom() {
    Random r = new Random();
    rnum = r.nextInt(100)+1;
    }
    protected int getRandom() {
    return this.rnum;
    }
    @Override
    public String getEndMsg(){
    return endmsg;
    }
    @Override
    public boolean isOver() {
    return over;
    }
    @Override
    public String getErrorMsg() {
    return this.errmsg;
    }
    @Override
    public void makeGuess(int guess) {
    try {
    if (guess < 0 || guess > 100) {
        errmsg = "Last guess is out of range: 0-100 only.";
    } else if (guess == 0) {
        over = true;
        endmsg = "Sorry, you did not guess my number in " + gcount 
        + " tries.";
    } else {
        gcount++;
        this.lastguess = guess;
    if (guess == rnum) {
        endmsg = "You guessed my number in " + gcount + " tries!";
        over = true;
    }
    }            
    } catch (NumberFormatException e) {
        errmsg = "Last guess was not a number.  Please try again.";
        this.lastguess = -1;
    }
    } 
    }
