package webber;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class DoubleColon {
    public static void printStr(String str) {
        System.out.println("printStr : " + str);
    }


    public void toUpper(){
        System.out.println("toUpper : " + this.toString());
    }

    public void toLower(String str){
        System.out.println("toLower : " + str);
    }

    public int toInt(String str){
        System.out.println("toInt : " + str);
        return 1;
    }


    public static void main(String[] args) {

        Consumer<String> printStrConsumer = DoubleColon::printStr;
        printStrConsumer.accept("printStrConsumer");

        Consumer<DoubleColon> toUpperConsumer = DoubleColon::toUpper;
        toUpperConsumer.accept(new DoubleColon());

        BiConsumer<DoubleColon,String> toLowerConsumer = DoubleColon::toLower;
        toLowerConsumer.accept(new DoubleColon(),"toLowerConsumer");

        BiFunction<DoubleColon,String,Integer> toIntFunction = DoubleColon::toInt;
        int i = toIntFunction.apply(new DoubleColon(),"toInt");
        System.out.println(i);

        Function<String,String> func =  String::toUpperCase;
        System.out.println(func.apply("a"));

        List<String> l = Arrays.asList("a","b","c");
        l.stream().map(func);
        l.stream().map(s -> s.toUpperCase());

        l.forEach(new MyConsumer<>());
        l.forEach(s -> System.out.println(s));


    }



}
