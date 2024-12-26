import java.util.Scanner;

public class EarringPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][][] earrings = new int[N][][];
        for (int i = 0; i < N; i++) {
            int K = scanner.nextInt();
            earrings[i] = new int[K][2];
            for (int j = 0; j < K; j++) {
                earrings[i][j][0] = scanner.nextInt();
                earrings[i][j][1] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (areEarringsIdentical(earrings[i], earrings[j])) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
    }

    private static boolean areEarringsIdentical(int[][] earring1, int[][] earring2) {
        int K = earring1.length;
        if (K != earring2.length) {
            return false;
        }

        int[][] normalizedEarring1 = normalizeEarring(earring1);
        int[][] normalizedEarring2 = normalizeEarring(earring2);

        for (int i = 0; i < K; i++) {
            if (normalizedEarring1[i][0] != normalizedEarring2[i][0] ||
                    normalizedEarring1[i][1] != normalizedEarring2[i][1]) {
                return false;
            }
        }

        return true;
    }

    private static int[][] normalizeEarring(int[][] earring) {
        int K = earring.length;
        int[][] normalizedEarring = new int[K][2];

        int x0 = earring[0][0];
        int y0 = earring[0][1];
        for (int i = 0; i < K; i++) {
            normalizedEarring[i][0] = earring[i][0] - x0;
            normalizedEarring[i][1] = earring[i][1] - y0;
        }

        double angle = Math.atan2(normalizedEarring[1][1], normalizedEarring[1][0]);
        for (int i = 0; i < K; i++) {
            double x = normalizedEarring[i][0];
            double y = normalizedEarring[i][1];
            normalizedEarring[i][0] = (int) Math.round(x * Math.cos(-angle) - y * Math.sin(-angle));
            normalizedEarring[i][1] = (int) Math.round(x * Math.sin(-angle) + y * Math.cos(-angle));
        }

        return normalizedEarring;
    }
}