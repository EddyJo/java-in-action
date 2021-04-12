package kr.co.eddy.java.in.action.stream;

import kr.co.eddy.java.in.action.dish.Dish;
import kr.co.eddy.java.in.action.dish.Menu;

import java.util.Arrays;
import java.util.List;

public class ReduceQuiz {

    public static void main(String[] args) {
        List<Dish> menu = new Menu().menu;

        System.out.println(menu.stream()
                               .map(d -> 1)
                               .reduce(0, (a, b) -> a + b));

        System.out.println(menu.stream().count());


    }
}
