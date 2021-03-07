import java.util.Scanner;

// Time Complexity: O(n)
public class Solution {

    static final int NUM_TYPES = 5;

    static int migratoryBirds(int[] arr) {
        int[] bucket = new int[5];

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] - 1]++;
        }

        int maxPosition = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > bucket[maxPosition]) {
                maxPosition = i;
            }
        }
        return ++maxPosition;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++) {
            birds[i] = scan.nextInt();
        }
        scan.close();
        int result = migratoryBirds(birds);
        System.out.println(result);
    }
}