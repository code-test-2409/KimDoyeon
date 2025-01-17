class Solution {
    public int solution(int a, int b, int c) {
        int sum1 = a + b + c;
        int sum2 = a * a + b * b + c * c;
        int sum3 = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) { // 세 숫자가 모두 같음
            return sum1 * sum2 * sum3;
        } else if (a == b || b == c || a == c) { // 두 숫자가 같음
            return sum1 * sum2;
        } else { // 세 숫자가 모두 다름
            return sum1;
        }
    }
}
