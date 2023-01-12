package Lv2;

import java.util.*;

public class DiscountEvent {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1},
                new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"})); //3
        System.out.println(solution(new String[] {"apple"}, new int[] {10}, new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"})); //0
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int idx = 0;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        while (idx < discount.length) {

            Map<String, Integer> tmpMap = new HashMap<>();
            tmpMap.putAll(map);

            for (int i = idx; i < idx + 10; i++) {

                if (i >= discount.length)
                    break;

                if (tmpMap.get(discount[i]) != null && tmpMap.get(discount[i]) > 0)
                    tmpMap.put(discount[i], tmpMap.get(discount[i]) - 1);
            }

            Set<Integer> setCompare = new HashSet();
            setCompare.add(0);

            Set<Integer> set = new HashSet();
            set.addAll(tmpMap.values());

            if (set.equals(setCompare))
                answer++;

            idx++;
        }

        return answer;
    }
}
