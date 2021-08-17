import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Git!!!");

        List<User> users = new ArrayList<>();

        User userEvgeniy = new User(22,"Evgeniy");
        User userKate = new User(20,"Kate");
        users.add(userEvgeniy);
        users.add(userKate);

        for (User u :
                users) {
            System.out.println("My name is " + u.getFirstName() + ". I'm " + u.getAge() + " years old.");
        }
        System.out.println("Bye my first project!!!");
    }
}
