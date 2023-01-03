package Lv2;

import java.util.ArrayList;
import java.util.Arrays;

//런타임에러 ~....
public class HailStormSequence {

    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(5, new int[][] {{0,0}, {0,-1}, {2,-3}, {3,-3}})));
    }
    public static double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];

        // 1. k에 대한 우박수열 구하기
        Integer[] hsSeq = getHSSeq(k);
        //System.out.println(Arrays.toString(hsSeq));

        // 2. 각 우박수열에 대한 좌표 구하기
        int[][] hsSeqXY = new int[hsSeq.length][2];
        for(int i=0 ; i< hsSeqXY.length ; i++){
            hsSeqXY[i][0] = i;
            hsSeqXY[i][1] = hsSeq[i];
            //System.out.println("(" + i + "," + hsSeq[i] + ")");
        }

        // 3. 각 구간에 대한 넓이 구하기 - 한칸씩? b = a+1
        double[] area = new double[hsSeqXY.length];

        double total= 0;
        for(int i=1 ; i<area.length ; i++){
            area[i] = hsSeqXY[i][1] - (hsSeqXY[i][1] - hsSeqXY[i-1][1])/2.0;
            total += area[i];
        }
        //area[0] = total;
        area[0] = 0;

        System.out.println(Arrays.toString(area));

        // 4. 각 범위에 대한.. 정적분.. ranges int[][\] // {0,0}, {0,-1}, {2,-3}, {3,-3}}

        for(int idx = 0 ; idx < ranges.length ; idx++){
            int a = ranges[idx][0];
            int b = (ranges.length + ranges[idx][1]);

            System.out.println("a : " + a + ", b : " + b);
            //System.out.println("b : " + (ranges.length + b));

            if(a == b)
                answer[idx] = 0;
            else if(a > b+1)
                answer[idx] = -1;
            else{
                for(int i=a ; i<=b; i++)
                    answer[idx] += area[i+1];
            }
        }

        return answer;
    }

    public static Integer[] getHSSeq(int n){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);

        while(n!=1){
            if(n%2 == 0)
                n /= 2;
            else
                n = n*3 + 1;

            arrayList.add(n);
        }

        return arrayList.toArray(new Integer[0]);
    }
}
