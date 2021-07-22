package baekjoon;

import java.util.Scanner;

public class b1629 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        System.out.println(pow(a, b, c));
    }

    public static long pow(long A, long B, long C) {
        if (B == 1)
            return A % C;
        long temp = pow(A, B / 2, C);
        if (B % 2 == 0)
            return temp * temp % C;
        else return (temp * temp % C) * A % C;
    }
}
