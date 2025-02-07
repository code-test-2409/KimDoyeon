//https://softeer.ai/app/assessment/index.html?xid=416575&xsrfToken=64FvS08kBsO7xS5Xv6QRGvhMsHiSx845&testType=practice
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[])    {
        Map<Character,String> lights = new HashMap<>();
        //전광판 중 하나의 전구를 기준으로 켜짐은 1로, 꺼짐은 0으로 표시한다
        lights.put('0', "1110111");
        lights.put('1', "0010010");
        lights.put('2', "1011101");
        lights.put('3', "1011011");
        lights.put('4', "0111010");
        lights.put('5', "1101011");
        lights.put('6', "1101111");
        lights.put('7', "1110010");
        lights.put('8', "1111111");
        lights.put('9', "1111011");
        lights.put(' ', "0000000"); //아무것도 켜져있지 않은 상태

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] data = new int[n][2];
        for (int i=0; i<n; i++) {
            int c = sc.nextInt();
            int c_ = sc.nextInt();
            data[i][0] = c;
            data[i][1] = c_;
        }
        for (int i=0; i< n; i++) {
            int count = 0;

            String d1 = String.format("%5s",data[i][0]); //다섯자리 글자수로 맞춘다.
            String d2 = String.format("%5s", data[i][1]);

            char[] d1_ = d1.toCharArray();
            char[] d2_ = d2.toCharArray();

            for (int j=0; j<5; j++) {
                count+=diff(lights.get(d1_[j]), lights.get(d2_[j]));
            }
            System.out.println(count);
        }

    }
    /**
     String의 각 자리수의 차이점을 비교하여 차이나는 수를 반환한다.
     */
    static int diff (String a, String b) {
        int count = 0;
        char[] a_ = a.toCharArray();
        char[] b_ = b.toCharArray();
        for (int i=0; i<a.length(); i++) {
            if (a_[i] != b_[i]) {
                count++;
            }
        }
        return count;
    }
}