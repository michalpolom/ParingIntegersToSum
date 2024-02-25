package pl.michalpolom;


import java.util.*;
import java.util.stream.Collectors;

public class ParingIntegersToSum {
    public static final int SUM = 13;

    public static void main(String[] args) {

        try {
            LinkedList<Integer> input = Arrays.stream(args).map(Integer::valueOf).sorted().collect(Collectors.toCollection(LinkedList::new));
            LinkedList<Integer> inputCopy = new LinkedList<>(input);

            List<String> output = new ArrayList<>();
            for (Integer i : inputCopy) {
                if (input.remove(i) & input.remove(Integer.valueOf(SUM - i))){
                    output.add(i + " " + (SUM - i));
                }
            }

            System.out.println(String.join("\n", output));
        } catch (NumberFormatException e) {
            System.out.println("ERROR: At least one of the argument is not an Integer (min=-2147483648, max=2147483647)");
        }
    }
}