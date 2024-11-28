//https://swexpertacademy.com/main/solvingProblem/solvingProblem.do

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            int count = 0;
            int result = 0;

            while (result == 0) {
                if (A < B) {
                    A += B;
                    if (A > N)
                        result = 1;
                }
                else {
                    B += A;
                    if (B > N)
                        result = 1;
                }
                count++;
            }

            System.out.println(count);
        }
    }
}