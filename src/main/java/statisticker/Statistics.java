package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
 int sum=0;
    public static Stats getStatistics(List<___> numbers) {
        for(int i:numbers){
            sum+=i;
    }
        float average=sum/numbers.size;
        int length=numbers.size();
        Collections.sort(numbers);
        float min=numbers.get(0);
        float max=numbers.get(length);
}
}
