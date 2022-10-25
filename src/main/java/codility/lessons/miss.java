package codility.lessons;

public class miss {
    
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{-1, -3}));
    }

    private static int solution(int[] A) {
        boolean[] check = new boolean[A.length + 1];

        for (int i : A) {
            if (i > 0) check[i - 1] = true;
        }
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) return i + 1;
        }

        return -1;
    }
}
