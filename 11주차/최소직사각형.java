//import java.util.Scanner;
//
//class Solution {
//    public int solution(int[][] sizes) {
//        int maxWidth = 0;
//        int maxHeight = 0;
//
//        // 명함의 가로와 세로 중 큰 값, 작은 값을 정리
//        for (int i = 0; i < sizes.length; i++) {
//            int width = Math.max(sizes[i][0], sizes[i][1]);
//            int height = Math.min(sizes[i][0], sizes[i][1]);
//
//            maxWidth = Math.max(maxWidth, width);
//            maxHeight = Math.max(maxHeight, height);
//        }
//
//        return maxWidth * maxHeight;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("배열의 행 수를 입력하세요: ");
//        int rows = scanner.nextInt();
//
//        int[][] sizes = new int[rows][2];
//        System.out.println("각 행의 두 숫자를 공백으로 구분하여 입력하세요:");
//        for (int i = 0; i < rows; i++) {
//            sizes[i][0] = scanner.nextInt();
//            sizes[i][1] = scanner.nextInt();
//        }
//
//        Solution solution = new Solution();
//        int answer = solution.solution(sizes);
//        System.out.println("결과: " + answer);
//
//        scanner.close();
//    }
//}


import java.util.Scanner;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int i;
        int x = 0;
        int y = 0;

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        sizes = new int[rows][2]; // 열의 수는 고정된 2로 설정

        for (i = 0; i < rows; i++) {
            sizes[i][0] = scanner.nextInt();
            sizes[i][1] = scanner.nextInt();
        }

        for (i = 0; i < sizes.length; i++) {
            if (x < sizes[i][0])
                x = sizes[i][0];
        }

        for (i = 0; i < sizes.length; i++) {
            if (sizes[i][1] > y) {
                if (!(sizes[i-1][0] < sizes[i][1] && sizes[i-1][1] > sizes[i][0]))
                    y = sizes[i][1];
            }
        }

        answer = x*y;
        return answer;
    }
}