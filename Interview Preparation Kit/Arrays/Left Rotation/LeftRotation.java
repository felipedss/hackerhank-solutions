import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LeftRotation {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = rotLeft(a, d);

        bufferedReader.close();

        out.println(result.stream()
                .map(Object::toString)
                .collect(joining(" "))
                + "\n");

    }

    private static List<Integer> rotLeft(List<Integer> items, int numberOfRotations) {
        final List<Integer> newArray = new LinkedList<>();
        IntStream.range(numberOfRotations, items.size())
                .forEach(index -> newArray.add(items.get(index)));
        IntStream.range(0, numberOfRotations)
                .forEach(index -> newArray.add(newArray.size(), items.get(index)));
        return newArray;
    }
}
