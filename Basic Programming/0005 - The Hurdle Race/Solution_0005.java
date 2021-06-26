import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static java.util.stream.Stream.of;

public class Solution_0005 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] firstInput = scan.nextLine().replaceAll("\\s+$", "").split(" ");
        String[] secondInput = scan.nextLine().replaceAll("\\s+$", "").split(" ");
        scan.close();

        int k = parseInt(firstInput[1]);

        final List<Integer> heights = of(secondInput).map(Integer::parseInt)
                .collect(Collectors.toList());

        out.println(hurdleRace(k, heights));
    }

    //Time Complexity O(n)
    private static int hurdleRace(int k, List<Integer> heights) {
        return heights.stream()
                .filter(v -> v > k)
                .map(v -> v - k)
                .max(Integer::compare)
                .orElse(0);
    }
}
