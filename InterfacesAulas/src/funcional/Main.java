package funcional;

import java.util.List;
import java.util.function.Consumer;

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

        users.forEach(System.out::println);
    }
}
