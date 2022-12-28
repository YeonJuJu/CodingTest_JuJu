import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class TableHashFunction {
    public static void main(String[] args){
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] data = {{2,2,6}, {1,5,10}, {4,2,9}, {3,8,3}};
        int col = 2;
        int row_begin = 2;
        int end_begin = 2;

        System.out.println(solution(data, col, row_begin, end_begin));
    }

    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[col-1] == o2[col-1])
                    return o2[0] - o1[0];
                else
                    return o1[col-1] - o2[col-1];
            }
        });

        for(int i=0;i<data.length;i++){
            int[] tmp = data[i];
            for(int j=0;j<data[i].length;j++){
                System.out.print(tmp[j] + " ");
            }
            System.out.println();
        }



        return answer;
    }
}
