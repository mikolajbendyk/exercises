package codility.samsung;

public class task3 {

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{9,4,2,10,7,8,8,1,9}));
        System.out.println(solution2(new int[]{5,6}));
        System.out.println(solution2(new int[]{100}));
        System.out.println(solution2(new int[]{4,8,12,16}));
        System.out.println(solution2(new int[]{1,2,1,2,1,2,1,2}));
        System.out.println(solution2(new int[]{1,1}));
        System.out.println(solution2(new int[]{55,55,55,56}));
        System.out.println(solution2(new int[]{55,55,55,55}));
    }

//    public static int[] solution(int[] A) {
//        int result = 0;
//
//        for (int i=1; i<A.length; i++) {
//            int period = 0;
//            if (A[i] > A[i-1]) {
//                period++;
//                for (int j=i+1; j<A.length; j++) {
//                    if ()
//                }
//            }
//        }
//
//    }

    public static int solution2(int[] A) {
        int result = 0;

        if (A.length == 1) {
            return 1;
        }
        if (A.length == 2) {
            if (A[0] != A[1]) {
                return 2;
            } else {
                return 0;
            }
        }

        for (int i=1; i<A.length; i++) {
            int period = 0;
            if (A[i] != A[i-1]) {
                period += 2;
                for (int j=i+1; j<A.length; j++) {
                    if (turb(A[j-2], A[j-1], A[j])) {
                        period++;
                    } else {
                        break;
                    }
                }
            }
            result = period > result ? period : result;
        }

        return result;

    }

    public static boolean turb(int x, int y, int z) {
        if (x > y && y < z) {
            return true;
        }
        if (x < y && y > z) {
            return true;
        }
        return false;
    }

}
