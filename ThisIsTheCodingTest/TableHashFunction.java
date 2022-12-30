import java.util.Arrays;
import java.util.Comparator;

public class TableHashFunction {
    public static void main(String[] args){
        int[][] data = {{2,2,6}, {1,5,10}, {4,2,9}, {3,8,3}};
        int col = 2;
        int row_begin = 2;
        int end_begin = 3;

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

        for(int i=row_begin ; i<=row_end; i++){
            int total = 0;
            int[] tmp = data[i-1];
            for(int j=0;j< tmp.length; j++){
                total += tmp[j]%(i);
            }
            answer = answer ^ total;
        }

        return answer;
    }
}
