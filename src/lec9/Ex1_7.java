package lec9;

/**
 * Заміна відношення спадкування на відношення агрегації
 * Клас Manager агрегує клас User
 */
public class Ex1_7 {

    //Підлеглий клас
    static class User {
        int id;
        String name;

        public void print() {
            System.out.println("User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}');
        }
    }

    //Клас-агрегатор
    static class Manager {
        User user;
        String company;

        public Manager(User user) {
            this.user = user;
        }
    }

    public static void main(String[] args) {

        var user = new User();
        user.id =1;
        user.name = "Pupkin";
        user.print();

        var manager = new Manager(user);
        manager.company = "Microsoft";
        System.out.println("Company: " + manager.company);
    }
}
