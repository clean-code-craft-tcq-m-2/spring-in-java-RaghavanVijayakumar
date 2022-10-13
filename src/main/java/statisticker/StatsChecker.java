package statisticker;
public class StatsChecker {
	float maxThreshold;
	private IAlerter[] alerters;

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maxThreshold) {
				System.out.println("true" + numbers[i]);
				alerters[0].alert();
				alerters[1].light();
			}
		}

	}

}
