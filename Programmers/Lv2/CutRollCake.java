package Lv2;

import java.util.*;

public class CutRollCake {
    public static void main(String[] args){
        System.out.println(solution2(new int[] {1,2,1,3,1,4,1,2}));
        System.out.println(solution2(new int[] {1,2,3,1,4}));
        System.out.println(solution2(new int[] {1,1,1,1}));
    }

    public static int solution(int[] topping) {
        int answer = 0;

        for(int i=0 ; i<topping.length ; i++){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for(int x=0 ; x<i; x++){
                if(!set1.contains(topping[x]))
                    set1.add(topping[x]);
            }

            for(int y=i ; y<topping.length; y++){
                if(!set2.contains(topping[y]))
                    set2.add(topping[y]);
            }

            if(set1.size() == set2.size())
                answer++;
        }

        return answer;
    }

    public static int solution2(int[] topping) {
        int answer = 0;
        
        HashSet<Integer> first = new HashSet<>();
        HashMap<Integer, Integer> second = new HashMap<>();

        // 기본 세팅
        first.add(topping[0]);
        for(int i=1 ; i<topping.length ; i++){
            second.put(topping[i], second.getOrDefault(topping[i], 0)+1);
        }

        // 형이 하나씩 뺏으면서 cnt
        for(int i=1 ; i<topping.length ; i++){
            first.add(topping[i]);
            second.put(topping[i], second.get(topping[i]) -1);
            if(second.get(topping[i]) == 0)
                second.remove(topping[i]);

            if(first.size() == second.size())
                answer++;
        }

        return answer;
    }
}
