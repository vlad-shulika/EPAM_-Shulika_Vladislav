package task1;

import java.util.ArrayList;

public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Enter INT number in the range ";
    public static final String INT_LARGER = "Your number is greater than the specified number.";
    public static final String INT_LESS = "Your number is less than the specified number.";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please.";
    public static final String WIN = "Congratulations! You guessed the number!";
    public static final String HISTORY = "History input numbers:";

    public void printMessage(String message) {
        System.out.println(message);
    }
    
    public void printHistory(ArrayList history) {
        for (int i = 0; i < history.size(); i++)
        	System.out.println(history.get(i));
    }  

}

