package kr.co.eddy.java.in.action.optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalTest {

    private String inputOfNull;
    private String inputOfEmpty;
    private String input;
    private Order order;

    @BeforeEach
    void setup() {
        inputOfNull = null;
        inputOfEmpty = "";
        input = "test_input";

        order = new Order();
        order.setDefaultCoffe("Americano");
    }

    @Test
    void orElse_Test() {
        //null이면 orElse값을 return

        //when
        String actual = Optional.ofNullable(inputOfNull)
                                .orElse("Test");

        String actural2 = Optional.ofNullable(input)
                                  .orElse("Test");

        //then
        assertThat(actual).isEqualTo("Test");
        assertThat(actural2).isEqualTo(input);

    }

    @Test
    void orElseGet_Test() {
        //when
        String actual = Optional.of(order)
                                .map(Order::getCoffee)
                                .orElseGet(() -> order.getDefaultCoffee());

        //then
        assertThat(actual).isEqualTo("Americano");
    }

    @Test
    void or_Test() {
        order.setDefaultCoffe(null);
        //when
        String actual =  Optional.of(order)
                                 .map(Order::getCoffee)
                                 .or(() -> Optional.ofNullable(order.getDefaultCoffee()))
                                 .orElse("coffee mix");

        assertThat(actual).isEqualTo("coffee mix");

    }

    private class Order {
        String coffee;
        String defaultCoffee;

        public String getCoffee() {
            return coffee;
        }

        public void setCoffee(String coffee) {
            this.coffee = coffee;
        }

        public String getDefaultCoffee() {
            return defaultCoffee;
        }

        public void setDefaultCoffe(String defaultCoffee) {
            this.defaultCoffee = defaultCoffee;
        }
    }
}
