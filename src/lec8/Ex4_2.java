package lec8;


import com.google.gson.Gson;

/**
 * Використання бібліотеки Google Gson
 */
public class Ex4_2 {

    //Тестовий клас користувача
    static class User {
        private String name;
        private int age;

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

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {

        //Створюємо екземпляр користувача
        User user = new User("Pupkin",20);

        //Створюємо екземпляр Gson
       Gson gson = new Gson();

        //Серіалізуємо користувача в JSON
       String JSON  = gson.toJson(user);
       System.out.println (JSON);

        //Створюємо екземпляр  користувача на основі строки JSON
        User userTwo = gson.fromJson(JSON, User.class);
        System.out.println (userTwo);
    }
}
