import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

// Time complexity O(n)
// The purpose was converted the character for your ascii correspondent
public class Solution0004 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String height = scan.nextLine();
        String word = scan.nextLine();
        scan.close();

        List<Integer> items = Stream.of(height.replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(designerPdfViewer(items, word));

    }

private static int designerPdfViewer(List<Integer> items, String word) {
    int max = 0;
    for (int i = 0; i < word.length(); i++) {
        final char c = word.charAt(i);
        int asciiValue = c - 97;
        max = Math.max(items.get(asciiValue), max);
    }
    return max * word.length();
}
}
