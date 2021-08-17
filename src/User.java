public class User {
    private int age;
    private String firstName;

    public User(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
