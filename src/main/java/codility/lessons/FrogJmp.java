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

    private static int solution2(int X, int Y, int D) {
        if (X == Y) return 0;
        int road = Y - X;
        int jumps = road / D;
        if (jumps * D >= road) {
            return jumps;
        } else {
            return jumps + 1;
        }
    }
}
