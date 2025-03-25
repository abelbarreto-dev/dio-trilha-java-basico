package funcional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("abel", 26),
                new User("paulo", 22),
                new User("maria", 23),
                new User("josé", 25)
        );

        var consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        };

        // users.forEach(System.out::println);
        //printStringValue(User::name,users);
        printStringValue(Record::toString, users);
    }

    private static void printStringValue(Function<User, String> callback,
                                         List<User> users
                                         ) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}
