package Lv2;

public class MagicElevator {

    public static void main(String[] args){
        System.out.println(solution(95)); //6
        System.out.println(solution(90)); //2
        System.out.println(solution(545)); //14
        System.out.println(solution(54)); //9
        System.out.println(solution(56)); //9
        System.out.println(solution(5555)); //18
        System.out.println(solution(57595358)); //26
        System.out.println(solution(65515)); //19
        System.out.println(solution(16)); //6
        System.out.println(solution(2554)); //16
        System.out.println(solution(155)); //11
        System.out.println(solution(154)); //10
    }

    public static int solution(int storey) {
        int answer = 0;
        int c = 1;

        while (storey > 0) {
            int num = (int) Math.pow(10, c);
            int num2 = (int) Math.pow(10, c - 1);
            int tmp = storey % num;

            if (tmp > (5 * num2)) {
                answer += (10 - tmp / num2);
                storey += (10 - tmp / num2) * num2;
            } else if (tmp >= (5 * num2) && (storey/num)%10 >=5) {
                answer += (10 - tmp / num2);
                storey += (10 - tmp / num2) * num2;
            } else if (tmp >= (5 * num2) && (storey/num)%10 < 5) {
                answer += tmp / num2;
                storey -= tmp;
            } else {
                answer += tmp / num2;
                storey -= tmp;
            }

            c++;
        }

        return answer;
    }
}
