import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        //匿名内部类
        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> set = new TreeSet<>(cpt);

        System.out.println("=========================");

        //使用lambda表达式
        Comparator<Integer> cpt2 = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> set2 = new TreeSet<>(cpt2);



        List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
        List<String> lowercaseNames1 = proNames.stream().map(name -> {return name.toLowerCase();}).collect(Collectors.toList());
        for (String name :lowercaseNames1 ) {
            System.out.println(name);
        }

        proNames.forEach(System.out::println);

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple());
        inventory.add(new Apple());

        filterApples(inventory,Main::isGreenApple);

        filterApples(inventory,Main::isHeavyApple);
    }

    public static List<Apple> filterGreenApple(List<Apple> inventory){

        List<Apple> result  = new ArrayList<Apple>();
        for(Apple apple : inventory){
            if(Color.GREEN.equals(apple.getColor())){
                    result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterHeavyApple(List<Apple> inventory){

        List<Apple> result  = new ArrayList<Apple>();
        for(Apple apple : inventory){
            if(apple.getWeight()>150){
                result.add(apple);
            }
        }

        return result;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    static List<Apple> filterApples(List<Apple> inventory,
                                    Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
