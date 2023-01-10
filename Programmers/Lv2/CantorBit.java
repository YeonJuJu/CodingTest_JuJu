package Lv2;

public class CantorBit {
    public static void main(String[] args){
        System.out.println(solution2(2, 4, 17)); //8
    }

    //0 번째 유사 칸토어 비트열은 "1" 입니다.
    //n(1 ≤ n) 번째 유사 칸토어 비트열은 n - 1 번째 유사 칸토어 비트열에서의 1을 11011로 치환하고 0을 00000로 치환하여 만듭니다.

    public static int solution(int n, long l, long r) {
        int answer = 0;

        // 0번째 유사 칸토어 비트열 : 1
        // 1번째 유사 칸토어 비트열 : 11011
        // 2번째 유사 칸토어 비트열 : 1101111011000001101111011

        int idx = 0 ; // idx째 유사 칸토어 비트열

        // 0번째 유사 칸토어 비트열 초기화
        StringBuffer bits = new StringBuffer();
        bits.append(1);

        while (idx != n){
            StringBuffer tmpBits = bits;
            bits = new StringBuffer();

            for(int i=0 ; i<tmpBits.length() ; i++){
                if(tmpBits.charAt(i) == '1')
                    bits.append("11011");
                else
                    bits.append("00000");
            }

            idx++;
        }

        for(long i = l-1 ; i < r ; i++){
            if(bits.charAt((int) i) == '1')
                answer++;
        }

        return answer;
    }

    public static int solution2(int n, long l, long r) {
        int answer = 0;

        // 0번째 유사 칸토어 비트열 (5^0): 1
        // 1번째 유사 칸토어 비트열 (5^1): 11011
        // 2번째 유사 칸토어 비트열 (5^2): 11011 11011 00000 11011 11011
        // 3번째 유사 칸토어 비트열 (5^3): 1101111011000001101111011 1101111011000001101111011 0000000000000000000000000 1101111011000001101111011 1101111011000001101111011

        // n번째 유사 칸토어 비트열 (5^n):

        return answer;
    }
}
