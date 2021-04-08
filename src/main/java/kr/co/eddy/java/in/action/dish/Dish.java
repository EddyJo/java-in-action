package kr.co.eddy.java.in.action.dish;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Data
public class Dish {
    private final String name;
    private final boolean vegeterian;
    private final int calories;
    private final Type type;

    public enum Type {
        MEAT,
        FISH,
        OTHER
    }
}
