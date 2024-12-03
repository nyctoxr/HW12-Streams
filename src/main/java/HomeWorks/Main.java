package HomeWorks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        String[] myWords = {"Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen"};

        Map<Integer, List<String>> resultWords = stream(myWords)
                .collect(Collectors.groupingBy(String::length));
        System.out.println("\n****Example 1:");
        System.out.println(resultWords);

        System.out.println("\n****Example 2:");

        resultWords.forEach((length , words) -> System.out.println("length: "+length +"   "+ "words: " +words+"   "+"count: "+words.size()));
    }
}