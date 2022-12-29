package codility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ThirdProblem {

    public String solution(String S) {
        final List<String> lines = List.of(S.split("\n"));
        final List<List<String>> parsedLines = new ArrayList<>();

        lines.forEach(element -> {
            final List<String> tokens = List.of(element.split("\\s+"));
            parsedLines.add(tokens);
        });

        final Optional<String> result = parsedLines.stream()
                .filter(ThirdProblem::applyWhereClause)
                .map(ThirdProblem::getDateCreated)
                .findFirst();

        return result.orElse("NO FILES");
    }

    private static String getDateCreated(List<String> list) {
        return list.get(2).concat(" " + list.get(3)).concat(" " + list.get(4));
    }

    private static boolean applyWhereClause(List<String> line) {
        final String user = line.get(0);
        final String isExecutable = line.get(1);
        final String byteSize = line.get(5);

        return user.equals("admin") &&
                isExecutable.contains("x") &&
                Integer.parseInt(byteSize) < Integer.MAX_VALUE;
    }
}
