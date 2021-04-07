package kr.co.eddy.java.in.action.method.reference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.list;

public class MethodReferenceTest {

    @Test
    void ToIntFunctionTest() {
        ToIntFunction<String> stringToIntOriginal = (String s) -> Integer.parseInt(s);
        ToIntFunction<String> stringToIntMethodReference = Integer::parseInt;

        Stream<String> strStream = Stream.<String>builder().add("1")
                                                           .add("2")
                                                           .add("3")
                                                           .build();


        assertThat(stringToIntMethodReference.applyAsInt("2")).isEqualTo(stringToIntOriginal.applyAsInt("2"));
    }

    @Test
    void BiPredicateTest() {
        BiPredicate<List<String>, String> containsOriginal = (list, element) -> list.contains(element);
        BiPredicate<List<String>, String> containsMethodReference = List::contains;

        List<String> list1 = new ArrayList<>();
        list1.add("안녕");
        assertThat(containsMethodReference.test(list1, "메롱")).isFalse();
        assertThat(containsOriginal.test(list1, "메롱")).isFalse();

        assertThat(containsMethodReference.test(list1, "안녕")).isTrue();
        assertThat(containsOriginal.test(list1, "안녕")).isTrue();

    }

}
