import java.util.Scanner;

public class Solution_0002 {

    static int pageCount(int n, int p) {
        int front = p >> 1;
        int back =  ((n & 1) == 1)
                ? (n - p) >> 1
                : (n - p + 1) >> 1;
        return Math.min(front, back);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        scan.close();
        int result = pageCount(n, p);
        System.out.println(result);
    }
}