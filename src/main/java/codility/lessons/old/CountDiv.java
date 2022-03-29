package codility.lessons.old;

public class CountDiv {

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }

    public static int solution(int A, int B, int K) {
        int counter = 0;
        for (int i=A; i<=B; i++) {
            counter = i % K == 0 ? counter+1 : counter;
        }
        return counter;
    }
}
