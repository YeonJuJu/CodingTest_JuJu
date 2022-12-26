package 그리디;

/*
 *  문제
 *
 *  언제나 최고만을 지향하는 굴지의 대기업 진영 주식회사가 신규 사원 채용을 실시한다.
 *  인재 선발 시험은 1차 서류심사와 2차 면접시험으로 이루어진다.
 *  최고만을 지향한다는 기업의 이념에 따라 그들은 최고의 인재들만을 사원으로 선발하고 싶어 한다.
 *  그래서 진영 주식회사는, 다른 모든 지원자와 비교했을 때 서류심사 성적과 면접시험 성적 중 적어도 하나가 다른 지원자보다 떨어지지 않는 자만 선발한다는 원칙을 세웠다.
 *  즉, 어떤 지원자 A의 성적이 다른 어떤 지원자 B의 성적에 비해 서류 심사 결과와 면접 성적이 모두 떨어진다면 A는 결코 선발되지 않는다.
 *  이러한 조건을 만족시키면서, 진영 주식회사가 이번 신규 사원 채용에서 선발할 수 있는 신입사원의 최대 인원수를 구하는 프로그램을 작성하시오.
 *
 *  입력
 *
 *  첫째 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 20)가 주어진다.
 *  각 테스트 케이스의 첫째 줄에 지원자의 숫자 N(1 ≤ N ≤ 100,000)이 주어진다.
 *  둘째 줄부터 N개 줄에는 각각의 지원자의 서류심사 성적, 면접 성적의 순위가 공백을 사이에 두고 한 줄에 주어진다.
 *  두 성적 순위는 모두 1위부터 N위까지 동석차 없이 결정된다고 가정한다.
 *
 *  출력
 *
 *  각 테스트 케이스에 대해서 진영 주식회사가 선발할 수 있는 신입사원의 최대 인원수를 한 줄에 하나씩 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        int[] totalRslt = new int[T];
        
       for(int i=0;i<T;i++){

            int N = Integer.parseInt(br.readLine()); // 지원자 수
            int[][] score = new int[N][2]; // 지원자 서류심사 성적, 면접 성적 순위 배열
            int cnt = 1; // 선발할 수 있는 지원자 수
            
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                
                score[j][0] = Integer.parseInt(st.nextToken());
                score[j][1] = Integer.parseInt(st.nextToken());
                
            }

           // 서류심사 기준으로 오름차순으로 정렬해서 면접 성적만 비교할 수 있도록 함.
           Arrays.sort(score, new Comparator<int[]>() {
               @Override
               public int compare(int[] o1, int[] o2) {
                   return o1[0] - o2[0];
               }
           });

           // 현재 지원자보다 서류심사 기준이 높은 지원자들 중 가장 낮은 면접 성적
           int lowScore = score[0][1];

           for(int k=1;k<N;k++){
               if(lowScore < score[k][1]){
                   // 얘는 뽑으면 안되는 애
               }else {
                   lowScore = score[k][1];
                   cnt++;
               }
           }

//            for(int k=0;k<N;k++){
//
//                int score1 = score[k][0];
//                int score2 = score[k][1];
//
//                boolean chk = true;
//
//                for(int l=0;l<N;l++){
//                    if( k == l ) continue;
//
//                    boolean vs1 = (score1 > score[l][0]);
//                    boolean vs2 = (score2 > score[l][1]);
//
//                    if((vs1 && vs2)){
//                        chk = false;
//                        break;
//                    }
//                }
//
//                if(chk)
//                    cnt++;
//            }

            totalRslt[i] = cnt;
       }

       for(int i=0;i<T;i++){
           System.out.println(totalRslt[i]);
       }
    
    }
}
