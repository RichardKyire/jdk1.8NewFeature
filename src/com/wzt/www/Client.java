package com.wzt.www;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Client {
  public static void main(String[] args) {
    //
      List<Apple> apples = new ArrayList();
      filterApple(apples,apple -> apple.getColor().equals(Color.green));
  }

  public static void filterGreenApple(List<Apple> apples){
        List<Apple> list = new ArrayList<>();
        for(Apple apple:list){
            if(apple.getColor().equals(Color.green)){
                list.add(apple);
            }
        }
  }

  public static void filterAppleByColor(List<Apple> apples , Color color){
      List<Apple> list = new ArrayList<>();
      for(Apple apple:list){
          if(apple.getColor().equals(color)){
              list.add(apple);
          }
      }
  }

  public static void filterApple(List<Apple> apples, Predicate<Apple> action){
      List<Apple> list = new ArrayList<>();
      for(Apple apple:list){
          if(action.test(apple)){
              list.add(apple);
          }
      }
  }
}
