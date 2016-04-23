package task1;
/**
 * Created by User on 17.03.2016.
 */
public class Model {
	
	public static final int MAX_RANDOM = 100;
    private int mas[] = new int[3];
    
	// The Program logic
	
    public int[] rand(int min, int max) {
    	mas[0] = min;
    	mas[1] = max;
    	mas[2] = min + (int)(Math.random() * ((max - min) + 1));
        return mas;
    }

    public int[] rand() {
    	mas[0] = 0;
    	mas[1] = MAX_RANDOM;
    	mas[2] = (int) (Math.random()*MAX_RANDOM + 1);
        return mas;
    }

}
