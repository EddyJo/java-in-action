package kr.co.eddy.java.in.action.trans;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Quiz {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactionList = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012,  700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> quiz1 = transactionList.stream()
                                                 .filter(transaction -> transaction.getYear() == 2011)
                                                 .sorted(comparing(Transaction::getValue))
                                                 .collect(toList());

        System.out.println(quiz1);

        List<String> quiz2 = transactionList.stream()
                                            .map(Transaction::getTrader)
                                            .map(Trader::getCity)
                                            .distinct()
                                            .collect(toList());

        System.out.println(quiz2);

        List<Trader> quiz3 = transactionList.stream()
                                            .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                                            .map(Transaction::getTrader)
                                            .distinct()
                                            .collect(toList());

        System.out.println(quiz3);

        List<String> quiz4 = transactionList.stream()
                                            .map(Transaction::getTrader)
                                            .distinct()
                                            .sorted(comparing(Trader::getName))
                                            .map(Trader::getName)
                                            .collect(toList());

        System.out.println(quiz4);

        boolean quiz5 = transactionList.stream()
                                       .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(quiz5);

        List<Transaction> quiz6 = transactionList.stream()
                                                 .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                                                 .collect(toList());

        System.out.println(quiz6);

        int maxValue = transactionList.stream()
                                      .max(comparing(Transaction::getValue))
                                      .map(Transaction::getValue)
                                      .get();

        System.out.println(maxValue);

        Optional<Integer> smallestValue = transactionList.stream().map(Transaction::getValue).reduce(Integer::min);
        System.out.println(smallestValue);


    }
}
