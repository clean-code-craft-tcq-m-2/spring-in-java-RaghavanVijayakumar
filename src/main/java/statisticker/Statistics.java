package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
    
    public float average;
    public float min;
    public float max;
    public float sum=0.0f;
  
    public Stats(float average,float min,float max) {
  
        this.average = average;
        this.max = max;
        this.min = min;
    }
    public static Stats getStatistics(List<___> numbers) {
        for(int i:numbers){
            sum+=i;
    }
        average=sum/numbers.size;
        int length=numbers.size();
        Collections.sort(numbers);
         min=numbers.get(0);
         max=numbers.get(length);
        return new Stats(average,min,max);
}
}
