package codility;

import java.util.*;

public class SecondProblem {

    private final Map<String, List<Integer>> found = new TreeMap<>();
    public int solution(int[] A) {
//        return Arrays.stream(Arrays.stream(A).filter(SecondProblem::filterLists).toArray()).sum();

        Arrays.stream(A).forEach(element -> {
            final String elementAsString = String.valueOf(element);
            final char firstDigit = elementAsString.charAt(0);
            final char finalDigit = elementAsString.charAt(elementAsString.length() - 1);
            final String key = "" + firstDigit + finalDigit;

            if(found.containsKey(key)) {
                found.get(key).add(element);
            } else {
                final List<Integer> newList = new ArrayList<>();
                newList.add(element);
                found.put(key, newList);
            }
        });

        found.forEach((k,v) -> {
            System.out.println("[" + k + ":" + v + "]");
        });

        final Optional<Integer> result = found.values().stream()
                .filter(elem -> elem.size() > 1)
                .map(value -> value.stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .max(Integer::compareTo);

        return result.orElse(-1);
    }

//    private static boolean filterLists(int element) {
//        final String elementAsString = String.valueOf(element);
//        final char firstDigit = elementAsString.charAt(0);
//        final char finalDigit = elementAsString.charAt(elementAsString.length() - 1);
//
//        return firstDigit == finalDigit;
//    }
}
