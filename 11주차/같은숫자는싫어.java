//https://school.programmers.co.kr/learn/courses/30/lessons/12906
//https://develog.co.kr/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B0%99%EC%9D%80-%EC%88%AB%EC%9E%90%EB%8A%94-%EC%8B%AB%EC%96%B4/
//https://dev-hiro.tistory.com/99

public class Solution {

    public int[] solution(int[] arr) {
        Stack<Integer> ans = new Stack<>();

        for (int num: arr) {
            if (ans.isEmpty() || ans.peek() != num) {
                ans.add(num);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}