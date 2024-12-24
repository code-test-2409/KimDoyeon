import java.util.Scanner;

class Solution {
    public int solution(int[][] sizes) {
        int maxHeight = 0;
        int minWidth = 0;

        // 명함의 가로와 세로 중 큰 값, 작은 값을 정리
        for (int i = 0; i < sizes.length; i++) {
            int height = Math.max(sizes[i][0], sizes[i][1]);
            int width = Math.min(sizes[i][0], sizes[i][1]);

            maxHeight = Math.max(maxHeight, height);
            minWidth = Math.max(minWidth, width);
        }

        return maxHeight * minWidth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 행 수를 입력하세요: ");
        int rows = scanner.nextInt();

        int[][] sizes = new int[rows][2];
        System.out.println("각 행의 두 숫자를 공백으로 구분하여 입력하세요:");
        for (int i = 0; i < rows; i++) {
            sizes[i][0] = scanner.nextInt();
            sizes[i][1] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int answer = solution.solution(sizes);
        System.out.println("결과: " + answer);

        scanner.close();
    }
}
