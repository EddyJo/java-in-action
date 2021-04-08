package kr.co.eddy.java.in.action.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamMapQuiz {

    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5);
        List<Integer> squareList = numberList.stream()
                                             .map(n -> n * n)
                                             .collect(toList());

        System.out.println(squareList);

    }
}
