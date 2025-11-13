package lec9;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Відношення направленої асоціації між класами
 * Клас Client асоціює клас Account
 */

public class Ex1_4 {

    //Клас-ассоціація
    static class Client {
        String name;
        Account[] accounts = new Account[3];

        @Override
        public String toString() {
            return "Client{" +
                    "Name='" + name + '\'' +
                    ", accounts=" + Arrays.toString(accounts) +
                    '}';
        }
    }

    //Асоційований клас
    static class Account {
        Long number;
        BigDecimal balance;

        public Account(Long number, BigDecimal balance) {
            this.number = number;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "number=" + number +
                    ", balance=" + balance +
                    '}';
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Pupkin";
        client.accounts[0] = new Account(123456789L, new BigDecimal("98765432.45"));
        client.accounts[1] = new Account(678912345L, new BigDecimal("54398762.12"));
        System.out.println(client.toString());
    }
}
