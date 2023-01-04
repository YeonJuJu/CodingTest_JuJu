package Lv2;

import java.util.Stack;

public class DeliveryBox {
    public static void main(String[] args){
        System.out.println(solution(new int[] {4, 3, 1, 2, 5}));
        System.out.println(solution(new int[] {5, 4, 3, 2, 1}));
    }

    public static int solution(int[] order) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int box = 1;
        int idx = 0;
//        while(box <= order.length && idx < order.length){
        while(idx < order.length){

            //System.out.println("order[" + idx + "] : " + order[idx]);
            //System.out.println("box : " + box);
            //if(!stack.empty()) {
            //    System.out.println("stack.peek() : " + stack.peek());
            //}

            if(order[idx] == box) {
                box++;
                idx++;
            }else if(!stack.empty() && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
            }else if(order[idx] != box && (stack.empty() || !stack.empty() && (stack.peek() != order[idx])) && box>order.length){
                break;
            }else{
                stack.push(box);
                box++;
            }
        }

        return idx;
    }
}
