package task1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {
    
	// The Constants
    public static final int MIN = 0;
    public static final int MAX = 100;

    Model model;
    View view;
    int number, mas[];
    ArrayList history = new ArrayList();
    
    // Constructor
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
        mas = model.rand(MIN, MAX);
    }

    // The Work method
    public void processUser() {
    	Scanner sc = new Scanner(System.in);
        
    	number = inputIntValueWithScanner(sc);   	
        while (number < mas[0] || number > mas[1])
        	number = inputIntValueWithScanner(sc);
        history.add(Integer.toString(number));
        
        while (number != mas[2]) {
        	if (number < mas[2]) {
        		view.printMessage(view.INT_LESS);
        		mas[0] = number;
        	}
        	else {
        		view.printMessage(view.INT_LARGER);
        		mas[1] = number;
        	}
    		number = inputIntValueWithScanner(sc);
	        while (number < mas[0] || number > mas[1])
	        	number = inputIntValueWithScanner(sc);
	        history.add(Integer.toString(number));
        }
        view.printMessage(view.WIN);
        view.printMessage(view.HISTORY);
        view.printHistory(history);
        
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
    	view.printMessage(view.INPUT_INT_DATA + '[' + mas[0] + ", " + mas[1] + ']');
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA + '[' + mas[0] + ", " + mas[1] + ']');
            sc.next();
        }
        return sc.nextInt();
    }
}
