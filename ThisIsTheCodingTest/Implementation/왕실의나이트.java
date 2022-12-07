package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 왕실의나이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pos = br.readLine();

        int x = Integer.parseInt(String.valueOf(pos.charAt(0) - 'a' + 1)); // a=1, h=8
        int y = Integer.parseInt(String.valueOf(pos.charAt(1)));

        int[][] steps = {{2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2}, {-1,-2}};

        int cnt = 0;
        for(int i=0;i<8;i++){
            if(x+steps[i][0] > 0 && y+steps[i][1] > 0)cnt++;
        }

        System.out.println(cnt);
    }
}
