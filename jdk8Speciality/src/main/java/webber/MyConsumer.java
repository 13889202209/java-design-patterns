package webber;

import java.util.function.Consumer;

public class MyConsumer<String> implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
