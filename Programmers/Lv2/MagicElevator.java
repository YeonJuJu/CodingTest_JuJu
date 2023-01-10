package Lv2;

public class MagicElevator {

    public static void main(String[] args){
        //		System.out.println(solution2(95));
        //		System.out.println(solution2(90));
        //System.out.println(solution(545));
        System.out.println("^^^^^^^^^^^^^^^^^^^^" + solution2(54)); //9
        System.out.println("^^^^^^^^^^^^^^^^^^^^" + solution2(56)); //9
        System.out.println("^^^^^^^^^^^^^^^^^^^^" + solution2(5555)); //18
        System.out.println("^^^^^^^^^^^^^^^^^^^^" + solution2(57595358)); //26
        //		System.out.println(solution(16));
        //		System.out.println(solution(2554));
        //		System.out.println(solution(155));
        //		System.out.println(solution(154));
    }

    public static int solution(int storey) {
        int answer = 0;

        // 0층으로 가기 위한 최솟값

        int c = String.valueOf(storey/10).length();
        System.out.println("c : " + c);

        while(storey!=0){
            int num = (int) Math.pow(10, c);
            System.out.println("storey : " + storey);
            System.out.println("Math.pow(10," + c + ") : " + num);
            System.out.println("storey/Math.pow(10, c) : " + storey/num);

            if(storey/num <= 5){
                storey-=num;
                System.out.println("storey in if : " + storey);
                if(storey < num)
                    c--;
                System.out.println("c after if : " + c);
            }else if(storey/num > 5){
                storey = (10 - storey/num) * num + storey%num;
                System.out.println("storey in else if : " + storey);
                System.out.println("c after else if : " + c);
            }
            answer++;
        }

        return answer;
    }

    public static int solution2(int storey) {
        int answer = 0;

        int c = 1;

        while (storey > 0) {
            int num = (int) Math.pow(10, c);
            int num2 = (int) Math.pow(10, c - 1);
            int tmp = storey % num;

            //System.out.println("c : " + c + ", num : " + num + ", tmp : " + tmp);
            //System.out.println("storey : " + storey);
            if (tmp > (5 * num2)) {
                answer += (10 - tmp / num2);
                storey += (10 - tmp / num2) * num2;
            } else if (tmp >= (5 * num2) && storey >= 5 * num) {
                answer += (10 - tmp / num2);
                storey += (10 - tmp / num2) * num2;
            } else if (tmp >= (5 * num2) && storey < 5 * num) {
                answer += tmp / num2;
                storey -= tmp;
            } else {
                answer += tmp / num2;
                storey -= tmp;
            }

            //System.out.println("answer : " + answer);
            //System.out.println("storey : " + storey);

            c++;
        }

        return answer;
    }
}
