package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics {

	public static class Stats {
		public float average;
		public float min;
		public float max;
		boolean checklist;
		boolean checkavg;
		boolean checkmin;
		boolean checkmax;

		public Stats(float average2, float min2, float max2, boolean checklist, boolean checkavg, boolean checkmin,
				boolean checkmax) {
			this.average = average2;
			this.min = min2;
			this.max = max2;
			this.checklist = checklist;
			this.checkavg = checkavg;
			this.checkmin = checkmin;
			this.checkmax = checkmax;
			return;
		}
	}

	public static Stats getStatistics(List<Float> numbers) {
		float min = 0, max = 0;
		float sum = 0;
		boolean checklist = false;
		for (Float i : numbers) {
			sum = sum + i;
		}
		int length = numbers.size();
		float average = sum / length;
		Collections.sort(numbers);
		if (numbers.isEmpty()) {
			checklist = true;
			min = 0f / 0f;
			max = 0f / 0f;
		} else {
			min = numbers.get(0);
			max = numbers.get(length - 1);
		}
		boolean checkavg = Float.isNaN(average);
		boolean checkmin = Float.isNaN(max);
		boolean checkmax = Float.isNaN(min);
		return new Stats(average, min, max, checklist, checkavg, checkmin, checkmax);
	}
}
