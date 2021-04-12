package codility.lessons;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(84,85,415));
    }

    public static int solution(int X, int Y, int D) {
        int div = Y - X;
        if (div % D == 0) {
            return div / D;
        } else {
            return (div / D) + 1;
        }
    }
}
