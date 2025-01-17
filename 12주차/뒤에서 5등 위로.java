import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 오름차순 정렬
        return Arrays.copyOfRange(num_list, 5, num_list.length); // 앞의 5개 제외 후 반환
    }
}