package kr.co.eddy.java.in.action.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamMapQuiz {

    public static void main(String[] args) {

        System.out.println("======= Quiz 5-2.1 =========");
        List<Integer> numberList = List.of(1, 2, 3, 4, 5);
        List<Integer> squareList = numberList.stream()
                                             .map(n -> n * n)
                                             .collect(toList());

        System.out.println(squareList);

        System.out.println("======= Quiz 5-2.2 =========");

        List<Integer> numberList1 = List.of(1, 2, 3);
        List<Integer> numberList2 = List.of(3, 4);
        List<int[]> pairList = numberList1.stream()
                                          .flatMap(
                                                   i -> numberList2.stream()
                                                                   .map(j -> new int[]{i, j})
                                          ).collect(toList());

        pairList.forEach(i -> System.out.println(i[0] + "," +  i[1]));

        System.out.println("======= Quiz 5-2.3 =========");

        pairList = numberList1.stream()
                              .flatMap( i -> numberList2.stream()
                                                        .filter(j -> (i + j) % 3 == 0)
                                                        .map(j -> new int[]{i, j})
                              ).collect(toList());
        pairList.forEach(i -> System.out.println(i[0] + "," +  i[1]));


        System.out.println("======= 번외 ========");
        pairList = numberList1.stream()
                              .filter(i -> i % 3 == 0)
                              .flatMap( i -> numberList2.stream()
                                                        .filter(j -> j % 3 == 0)
                                                        .map(j -> new int[]{i, j})
                              ).collect(toList());
        pairList.forEach(i -> System.out.println(i[0] + "," +  i[1]));
    }
}
