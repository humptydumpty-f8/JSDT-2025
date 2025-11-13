package lec9;

/**
 * Відношення спадкування між класами
 * Клас Manager успадковує клас User
 */
public class Ex1_1 {

    //Батьківський клас
    static class User {
        protected int id;
        protected String name;

        public void print() {
            System.out.println("User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}');
        }
    }

    //Клас-спадкоємець
    static class Manager extends User {
        protected String company;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.id =1; //Успадковане поле
        manager.name = "Pupkin"; //Успадковане поле
        manager.company = "Microsoft";
        manager.print();//Успадкований метод
        System.out.println("Company: " + manager.company);
    }
}
