package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
    float sum=0.0f;
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
