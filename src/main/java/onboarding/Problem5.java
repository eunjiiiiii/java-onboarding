package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        
        int [] prices = {50000,10000,5000,1000,500,100,50,10,1};

        for(int i=0; i<prices.length; i++){
            answer.add(money / prices[i]);
            money -= answer.get(i)*prices[i];
        }

        return answer;
    }
}
