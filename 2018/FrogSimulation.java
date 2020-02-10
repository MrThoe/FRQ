package fRQ_2018;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}
	
	private int hopDistance() {
		return 0;
	}
	
	private boolean simulate() {
		//PART A
		int count = maxHops;
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
		
	}
	
}


