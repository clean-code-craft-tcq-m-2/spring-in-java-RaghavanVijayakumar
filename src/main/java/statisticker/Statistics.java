package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
    public static Stats getStatistics(List<___> numbers) {
     float sum=0.0f;
        for(int i:numbers){
            sum+=i;
    }
        float average=sum/numbers.size;
        int length=numbers.size();
        Collections.sort(numbers);
        float min=numbers.get(0);
        float max=numbers.get(length);
        return new Stats(average,min,max);
}
}
