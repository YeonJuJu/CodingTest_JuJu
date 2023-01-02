package Lv2;

public class MakingDots {
    public static void main(String[] args){
        System.out.println(bestSolution(2, 4));
        System.out.println(bestSolution(1, 5));
        System.out.println(bestSolution(3, 5));
    }

    // 시간초과..
    public static long solution(int k, int d) {
        long answer = 0;

        // d^2 >= k^2(a^2 + b^2) 인 자연수 a, b 쌍 찾기

        long distance = d*d;
        long squareK = k*k;

        //일단 b가 0일때를 생각해
        long a=0;
        while(distance >= squareK*(a*a)){
            a++;
        }

        for(long i=0;i<a;i++){
            for(long j=0;j<a;j++){
                if(distance >= squareK*(i*i + j*j)) {
                    //System.out.println("(" + i + "," + j + ")");
                    answer++;
                }else
                    break;
            }
        }

        return answer;
    }

    public static long bestSolution(int k, int d) {
        int answer = 0;

        // 원의 방정식을 이용한 풀이 -> (x^2 + y^2 <= d^2)

        /*
            k^2 * x^2 + k^2 * y*2 <= d^2
            k^2(x^2 + y^2) <= d^2
            x^2 + y^2 <= d^2 / k^2

            if y == 0 (y가 0일때 x가 최댓값)
            -> x^2 <= d^2/k^2
           --> x <= d/k

           --------------------------------

           k^2 * x^2 + k^2 * y*2 <= d^2
           k^2 * y*2 <= d^2 - k^2 * x^2
           k*y <= Math.sqrt(d^2 - k^2 * x^2)
           y <= Math.sqrt(d^2 - k^2 * x^2)/k

         */

        for (long i = 0; i <= d/k; i++) {
            long x = i * k;
            long y = (long) Math.sqrt((long) Math.pow(d, 2) - (long) Math.pow(x, 2)) / k;

            answer += y + 1; // 0도 포함해주어야 하므로 +1
        }
        return answer;
    }
}
