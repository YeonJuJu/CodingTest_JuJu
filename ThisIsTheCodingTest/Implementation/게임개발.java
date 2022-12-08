package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 현재
*   4 4
    1 1 0
    1 1 1 1
    1 0 0 1
    1 1 0 1
    1 1 1 1
    * 이나
    4 5
    1 1 0
    1 1 1 1
    1 0 0 1
    1 0 1 1
    1 0 0 1
    1 1 1 1
* 위와 같은 입력에서는 정상적으로 3과 4를 출력하지만,
*
*   4 4
    1 1 0
    1 1 1 1
    1 0 0 1
    1 0 0 1
    1 1 1 1
* 위와 같은 입력에서는 정상 작동 하지 않음. 추후 수정 필요.
*
* */

public class 게임개발 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        // 0은 육지, 1은 바다, 2는 가본 칸
        int[][] map = new int[M][N];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ewsn = 0;
        boolean tmp = true;
        map[y][x] = 2; // 시작하는 위치는 가본 곳으로 표시
        while(tmp){
            switch (l){
                case 0: // 북쪽의 왼쪽은 서쪽
                    l = 3; // 왼쪽 위인 서쪽을 바라보고 있다고 표시
                    if(map[y][x-1] == 0){ // 왼쪽 위가 가보지 않은 곳이라면 캐릭터 이동
                        x -= 1; // 왼쪽 위로 이동
                        map[y][x] = 2; // 이동한 곳을 가본 곳으로 표시
                        ewsn = 0;
                    }else if(ewsn == 4){ // 네 방향 모두 갈 수 없는 곳일 경우 뒤로 이동
                        if(map[y+1][x] == 1) // 뒤가 바다인 경우 이동 종료
                            tmp = false;
                        else { // 뒤가 가봤던 곳인 경우
                            y += 1;
                            ewsn = 0;
                        }
                    }else
                        ewsn++;

                    System.out.println(ewsn);
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            System.out.print(map[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    break;
                case 1: // 동쪽의 왼쪽은 북쪽
                    l = 0; // 왼쪽 위인 북쪽을 바라보고 있다고 표시
                    if(map[y-1][x] == 0){ // 왼쪽 위가 가보지 않은 곳이라면 캐릭터 이동
                        y -= 1; // 왼쪽 위로 이동
                        map[y][x] = 2; // 이동한 곳을 가본 곳으로 표시
                        ewsn = 0;
                    }else if(ewsn == 4){ // 네 방향 모두 갈 수 없는 곳일 경우
                        if(map[y][x-1] == 1)
                            tmp = false;
                        else {
                            x -= 1;
                            ewsn = 0;
                        }
                    }else
                        ewsn++;

                    System.out.println(ewsn);
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            System.out.print(map[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    break;
                case 2: // 남쪽의 왼쪽은 동쪽
                    l = 1; // 왼쪽 위인 동쪽을 바라보고 있다고 표시
                    if(map[y][x+1] == 0){ // 왼쪽 위가 가보지 않은 곳이라면 캐릭터 이동
                        x += 1; // 왼쪽 위로 이동
                        map[y][x] = 2; // 이동한 곳을 가본 곳으로 표시
                        ewsn = 0;
                    }else if(ewsn == 4){ // 네 방향 모두 갈 수 없는 곳일 경우
                        if(map[y-1][x] == 1)
                            tmp = false;
                        else {
                            y -= 1;
                            ewsn = 0;
                        }
                    }else
                        ewsn++;

                    System.out.println(ewsn);
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            System.out.print(map[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    break;
                case 3: // 서쪽의 왼쪽은 남쪽
                    l = 2; // 왼쪽 위인 남쪽을 바라보고 있다고 표시
                    if(map[y+1][x] == 0){ // 왼쪽 위가 가보지 않은 곳이라면 캐릭터 이동
                        y += 1; // 왼쪽 위로 이동
                        map[y][x] = 2; // 이동한 곳을 가본 곳으로 표시
                        ewsn = 0;
                    }else if(ewsn == 4){ // 네 방향 모두 갈 수 없는 곳일 경우
                        if(map[y][x+1] == 1)
                            tmp = false;
                        else {
                            x += 1;
                            ewsn = 0;
                        }
                    }else
                        ewsn++;

                    System.out.println(ewsn);
                    for(int i=0;i<M;i++){
                        for(int j=0;j<N;j++){
                            System.out.print(map[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    break;
            }
        }

        int cnt = 0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] == 2)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
