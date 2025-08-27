package lec3;

import java.io.Console;

/**
 * Введення з консолі за допомогою java.io.Console
 * Запускається тільки з консолі!!!!!!!!
 */
public class Ex8_1 {

    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine ( "User name: ");
        char [] passwd = cons.readPassword ( "Password: ") ;
        System.out.println("User name: " + username);
        System.out.println("Password: " + new String(passwd));
    }
}
