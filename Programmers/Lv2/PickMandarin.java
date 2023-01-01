package Lv2;

import java.util.Arrays;

public class PickMandarin {
    public static void main(String[] args){
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(6, new int[] {1,3,2,5,4,5,2,3}));
        System.out.println(solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] tanArr = new int[tangerine[tangerine.length-1]];

        for(int i=0;i<tangerine.length;i++){
            int tmp = tangerine[i];
            tanArr[tmp-1] = tanArr[tmp-1]+1;
        }

        Arrays.sort(tanArr);

        int total = 0;
        for(int i= tanArr.length-1 ; i>=0 ; i--){
            total += tanArr[i];
            answer++;
            if(total >= k)
                break;
        }

        return answer;
    }
}
