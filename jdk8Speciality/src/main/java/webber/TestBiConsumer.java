package webber;

import java.util.function.BiConsumer;


public class TestBiConsumer {
    public void test(BiConsumer<DoubleColon,String> consumer){
        System.out.println("do something ...");
    }

    public static void main(String[] args) {
        TestBiConsumer obj = new TestBiConsumer();
        obj.test((x,y) -> System.out.println("do something ..."));
        obj.test(DoubleColon::toLower);
    }
}
