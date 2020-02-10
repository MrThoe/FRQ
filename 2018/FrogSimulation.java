package fRQ_2018;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}
	
	/*There are no parameters or description of how this works so
	 * I just made my own (-15,15) which isn't correct since in one of the 
	 * simulations it jumped 31.  But it appears as an outlier so....
	 */
	private int hopDistance() {
		return (int)Math.random()*30 - 15;
	}
	
	private boolean simulate() {
		//PART A
		for(int i = 0; i < maxHops; i++) {
			goalDistance -= hopDistance();
			if(goalDistance <= 0) {
				return true;
			}
		}
		return false;
	}
	
	public double runSimulations(int num) {
		//PART B
		double count = 0;
		for(int i = 0; i < num; i++) {
			if(simulate()) {
				count++;
			}
		}
		count /= num;
		return count;
	}
	
}
