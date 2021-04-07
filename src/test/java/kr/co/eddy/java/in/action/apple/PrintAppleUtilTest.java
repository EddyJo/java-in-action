package kr.co.eddy.java.in.action.apple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PrintAppleUtilTest {

    @Test
    void print_with_fancy() {
        List<Apple> appleInventory = Arrays.asList(
                Apple.builder()
                     .color("Red")
                     .weight(100)
                     .build(),
                Apple.builder()
                     .color("Blue")
                     .weight(160)
                     .build(),
                Apple.builder()
                     .color("Green")
                     .weight(200)
                     .build()
                );

        PrintAppleUtil.prettyPrintApple(appleInventory, new AppleFancyFormatter());
    }
}
