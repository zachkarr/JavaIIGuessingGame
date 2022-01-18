    package business;
/**
 *
 * @author Zach Karr
 */
    public class GuessHotCold extends Guessing {
    public static final int GAMETYPE = 2;
       
    public GuessHotCold (int gametype) {
    super(GAMETYPE);
    }
    @Override
    public String getInstructions() {
    return "Guess my random number "
    + "between 1 and 100.  I will give you hints after " 
    + "each guess telling you if you are getting hotter or " 
    + "colder.  Enter zero to stop guessing.";
    }
    @Override
    public String getGameName() {
    return "Guess My Number = Hot/Cold";
    }
    @Override
    public String getGuessResult() {
    int category=0, guess;
    String result="";
    int diff = Math.abs(this.rnum - this.lastguess);
    if (diff >= 75) {
        category = 1;
        result = "Your guess of " + this.lastguess + " is very cold";
    } else if (diff >= 50) {
        category = 2;
        result = "Your guess of " + this.lastguess + " is cold";
    } else if (diff >= 25) {
        category = 3;
        result = "Your guess of " + this.lastguess + " is warm";
    } else if (diff >= 13) {
        category = 4;
        result = "Your guess of " + this.lastguess + " is very warm";
    } else if (diff >= 1) {
        category = 5;
        result = "Your guess of " + this.lastguess + " is HOT";
    } else {
        //unexpected result
        result = "You guessed my number. ";
    }
    if (category == prevcat) {
        //need additional msg for direction
    if (prevdiff == diff ) {
        result += " (same degree).";
    } else {
        switch (category){
        case 1:  //very cold
        case 2: //cold and same as case 1 so moved under it
    if (diff > prevdiff) {
        result += " and getting colder.";
    } else {
        result += " but getting warmer.";
    }
        break; // end the switch  
        case 3: // warm
        case 4:
        if (diff > prevdiff) {
        result += " but getting colder.";
    } else {
        result += " and getting warmer.";
    }
        break;
        case 5: //hot
    if (diff > prevdiff){
        result += " but getting colder.";
    } else {
        result += " and getting hotter";
    }
        break;
    }//end of switch
    }//end of else
    }//end of if
    prevcat = category;
    prevdiff = diff;
    result += "\n";
    return result;
    }
    }


