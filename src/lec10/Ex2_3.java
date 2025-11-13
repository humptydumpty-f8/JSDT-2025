package lec10;

/**
 * Імплементація двох інтерфейсів
 */
public class Ex2_3 {
    public static void main(String[] args) {

        //Клас шифроблокноту,що імплементує інтерфейси ICipher та Colorable
        class CipherPad implements ICipher, Colorable {

            //Визначення методу шифрування
            @Override
            public void encrypt(String plainText, String key) {
                System.out.println(ANSI_CYAN + "Text \"" + plainText +
                        "\" was encrypted with key \"" + key + "\"");
            }

            //Визначення методу розшифрування
            @Override
            public void decrypt(String cryptoText, String key) {
                System.out.println(ANSI_PURPLE + "Cryptotext \"" + cryptoText +
                        "\" was decrypted with key \"" + key + "\"");
            }
        }

        //Сценарій використання
        CipherPad cipherPad = new CipherPad();
        String password = cipherPad.getKey();//Виклик метода за замовчуванням
        cipherPad.encrypt("Plain text", password);//Шифрування
        cipherPad.decrypt("Crypto text", password);//Розшифрування
    }
}
