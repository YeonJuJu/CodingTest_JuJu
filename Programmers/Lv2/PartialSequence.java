package Lv2;

import java.util.*;

public class PartialSequence {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {7, 9, 1, 1, 4})); //18
    }

    public static int solution(int[] elements) {
        int answer = 0;

        int length = 1; // 길이는 1 ~ elements.length 까지

        Set<Integer> set = new HashSet();

        while (length <= elements.length) {

            for (int i = 0; i < elements.length; i++) {

                int total = 0;
                for (int j = 0; j < length; j++) {

                    int index = i + j;

                    if (index >= elements.length) // 이거를 index%5 로 하면 좋았을텐데..!! 화이팅..!
                        index -= elements.length;

                    //System.out.print(elements[index]);

                    total += elements[index];
                }

                //System.out.print(" ");
                set.add(total);
            }

            //System.out.println();
            length++;
        }

        //System.out.println(set);
        answer = set.size();
        return answer;
    }
}
