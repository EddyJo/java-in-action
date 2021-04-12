package kr.co.eddy.java.in.action.dish;

import java.util.Arrays;
import java.util.List;

public class Menu {
    public List<Dish> menu = Arrays.asList(
                Dish.builder()
                    .name("pork")
                    .vegeterian(false)
                    .calories(800)
                    .type(Dish.Type.MEAT)
                    .build(),
                Dish.builder()
                    .name("beef")
                    .vegeterian(false)
                    .calories(700)
                    .type(Dish.Type.MEAT)
                    .build(),
                Dish.builder()
                    .name("chicken")
                    .vegeterian(false)
                    .calories(400)
                    .type(Dish.Type.MEAT)
                    .build(),
                Dish.builder()
                    .name("french fried")
                    .vegeterian(true)
                    .calories(530)
                    .type(Dish.Type.OTHER)
                    .build(),
                Dish.builder()
                    .name("rice")
                    .vegeterian(true)
                    .calories(350)
                    .type(Dish.Type.OTHER)
                    .build(),
                Dish.builder()
                    .name("season fruit")
                    .vegeterian(true)
                    .calories(120)
                    .type(Dish.Type.MEAT)
                    .build(),
                Dish.builder()
                    .name("pizza")
                    .vegeterian(true)
                    .calories(550)
                    .type(Dish.Type.OTHER)
                    .build(),
                Dish.builder()
                    .name("prawns")
                    .vegeterian(false)
                    .calories(300)
                    .type(Dish.Type.FISH)
                    .build(),
                Dish.builder()
                    .name("salmon")
                    .vegeterian(false)
                    .calories(450)
                    .type(Dish.Type.FISH)
                    .build()
    );
}
