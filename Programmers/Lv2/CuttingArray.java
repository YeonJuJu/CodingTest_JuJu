package Lv2;

import java.util.Arrays;

public class CuttingArray {
    public static void main(String[] args){
        System.out.println(solution(3, 2, 5)); // 3 2 2 3
        System.out.println(solution(4, 7, 14)); // 4 3 3 3 4 4 4 4
    }

    public static int[] solution(int n, long left, long right){
        int[] answer = new int[(int) (right-left+1)];

        for(long i=left ; i<=right ; i++ ){
            long num = i / n;
            if(num == 0) {
                //System.out.println("if num == 0 : i-left = " + (i-left) + ", i+1 = " + (i+1));
                answer[(int) (i - left)] = (int) (i + 1);
            }else{
                if(i%n < num+1){
                    //System.out.println("if i%n < num+1 : i-left = " + (i-left) + ", num+1 = " + (num+1));
                    answer[(int) (i-left)] = (int) (num+1);

                }else{
                    //System.out.println("if else : i-left = " + (i-left) + ", i/3+1 = " + (i+1));
                    answer[(int) (i-left)] = (int) (i%n)+1;
                }
            }
        }

        //System.out.println(Arrays.toString(answer));

        return answer;
    }
}
