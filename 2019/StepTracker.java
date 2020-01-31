
public class StepTracker {
	private int numActiveDays;
	private int stepRequired;
	private int totalDailySteps;
	private int daysTracked;
	
	public StepTracker(int numDays) {
		stepRequired = numDays;
	}
	public void addDailySteps(int n) {
		totalDailySteps += n;
		if(n >= stepRequired) {
			numActiveDays++;
		}
		daysTracked++;
	}
	public int activeDays() {
		return numActiveDays;
	}
	
	public double averageSteps() {
		return totalDailySteps/daysTracked;
	}
}
