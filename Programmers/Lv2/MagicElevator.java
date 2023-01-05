package Lv2;

public class MagicElevator {

    public static void main(String[] args){
        //System.out.println(solution(16));
        System.out.println(solution(646));
        //System.out.println(solution(2554));
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

        // 0층으로 가기 위한 최솟값

        int c = String.valueOf(storey/10).length();
        System.out.println("c : " + c);

        while(storey!=0){
            int num = (int) Math.pow(10, c);
            System.out.println("storey : " + storey);
            System.out.println("Math.pow(10," + c + ") : " + num);
            System.out.println("storey/Math.pow(10, c) : " + storey/num);

            if(storey/num <= 5){
            }else if(storey/num > 5){
            }
            answer++;
        }

        return answer;
    }
}
