import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Seven {
    public static void main(String[] args) throws Exception {
        Set<String> stops = new HashSet<>(Arrays.asList(Files.readString(Path.of("stopwords.txt")).split(",")));
        List<String> words = Pattern.compile("[a-z]{2,}").matcher(Files.readString(Path.of(args[0])).toLowerCase())
                .results().map(MatchResult::group).filter(w -> !stops.contains(w)).collect(Collectors.toList());
        words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream().sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(25).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
