package 구현;

/*
 *  문제
 *
 *  오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 *
 *  입력
 *
 *  첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다.
 *  참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 *
 *  출력
 *
 *  첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.StringTokenizer;

public class Ex_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        LocalDate date = LocalDate.of(2007, x, y);
        DayOfWeek dayOfWeek= date.getDayOfWeek();

        //System.out.println(dayOfWeek.getValue()); // 요일을 숫자로 표현
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase()); // 요일을 숫자(대문자)로 표현
        //System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREA)); // 요일을 숫자로 표현
    }
}
