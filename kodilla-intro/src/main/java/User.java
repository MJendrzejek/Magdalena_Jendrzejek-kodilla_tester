public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static float average(User[] users) {
        float sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getAge();
        }

        return sum / users.length;
    }

    public static void main(String[] args) {
        User kinga = new User("Kinga", 31);
        User magda = new User("Magda", 32);
        User aga = new User("Aga", 28);
        User lucas = new User("Lucas", 30);
        User olek = new User("Olek", 21);

        User[] users = {kinga, magda, aga, lucas, olek};

        System.out.println(average(users));

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average(users)) {
                System.out.println(users[i].getName());
            }
        }
    }
}
