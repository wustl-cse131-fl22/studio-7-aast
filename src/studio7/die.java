package studio7;

public class die {

	private int sideNumber;

	public die(int initSideNumber) {
		sideNumber = initSideNumber;
	}
	
	public int simulator(int sideNumber) {
		return (int)(Math.random()*(sideNumber-1) + 1);	
	}
	
}
