package kr.co.eddy.java.in.action.dish;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Quiz {

    public static void main(String[] args) {

        //외부반복 -> 내부반복
        List<Dish> highCaloriesDish = new Menu().menu.stream()
                                                     .filter(dish -> dish.getCalories() > 300)
                                                     .collect(toList());

        System.out.println(highCaloriesDish);
    }
}
