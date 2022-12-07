package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상하좌우 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int x = 1;
        int y = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            switch (st.nextToken()){
                case "L" :
                    if(y-1 >= 1) y--;
                    break;
                case "R" :
                    if(y+1 <= N) y++;
                    break;
                case "U" :
                    if(x-1 >= 1) x--;
                    break;
                case "D" :
                    if(x+1 <= N) x++;
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}
