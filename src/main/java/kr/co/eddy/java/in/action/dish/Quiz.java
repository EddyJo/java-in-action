package kr.co.eddy.java.in.action.dish;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Quiz {

    public static void main(String[] args) {

        //외부반복 -> 내부반복
        System.out.println("======== 외부반복 -> 내부반복 ========");
        List<Dish> highCaloriesDish = new Menu().menu.stream()
                                                     .filter(dish -> dish.getCalories() > 300)
                                                     .collect(toList());

        System.out.println(highCaloriesDish);

        //Quiz 5-1. 스트림을 이용하여 처음 등장하는 두 고기 요리를 필터링하시오.
        System.out.println("======== Quiz 5-1 ========");
        System.out.println(new Menu().menu.stream()
                                          .filter(dish -> dish.getType() == Dish.Type.MEAT)
                                          .limit(2)
                                          .collect(toList())
                          );


    }
}
