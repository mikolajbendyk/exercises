package codility.lessons.old;

public class MinAvgTwoSlice {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,2,2,5,1,5,8}));
    }

    public static int solution(int[] A) {
        double minAvg = Double.MAX_VALUE;
        int result = 0;

        for (int i=0; i<A.length; i++) {
            double sum = A[i];
            int counter = 1;
            for (int j=i+1; j<A.length; i++) {
                sum += A[j];
                counter++;
                double avg = sum / counter;
                if (avg < minAvg) {
                    minAvg = avg;
                    result = i;
                }
            }
        }

        return result;
    }
}
