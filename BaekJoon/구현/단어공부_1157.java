package 구현;

/*
 *  문제
 *
 *  알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 *
 *  입력
 *
 *  첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 *  출력
 *
 *  첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] strCnt = new int[26];

        for(int i=0;i<str.length();i++){
           strCnt[str.charAt(i) - 'A']++;
        }

        int maxCnt = -1;
        char printChar = '?';

        for(int i=0;i<strCnt.length;i++){
            if(maxCnt < strCnt[i]){
                maxCnt = strCnt[i];
                printChar = (char) (65 + i);
            }else if(maxCnt == strCnt[i]){
                printChar = '?';
            }
        }

        System.out.println(printChar);
    }
}

/*
* 쉽게 생각하려고 노력하자.....
* 너무 꼬아서 생각하지 말자....
* ㅠㅠ
* */