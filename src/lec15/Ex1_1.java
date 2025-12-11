package lec15;

import java.util.ArrayList;
import java.util.List;

/**
 * Delegation event model
 */

// An interface to be implemented by everyone interested in "Hello" events
interface SayHelloListener {
    void someoneSaidHello();
}

// Someone who says "Hello"
class Initiater {
    private List<SayHelloListener> listeners = new ArrayList<SayHelloListener>();

    public void addSayHelloListener(SayHelloListener toAdd) {
        listeners.add(toAdd);
    }

    public void sayHello() {
        System.out.println("Hello, Responder!!");

        // Notify everybody that may be interested.
        for (SayHelloListener hl : listeners)
            hl.someoneSaidHello();
    }
}

// Someone interested in "Hello" events
class Responder implements SayHelloListener {
    @Override
    public void someoneSaidHello() {
        System.out.println("Hello there...");
    }
}

class Test {
    public static void main(String[] args) {
        Initiater initiater = new Initiater();
        Responder responder = new Responder();
        Responder responder1 = new Responder();
        Responder responder2 = new Responder();

        initiater.addSayHelloListener(responder);
        initiater.addSayHelloListener(responder1);
        initiater.addSayHelloListener(responder2);

        initiater.sayHello();  // Prints "Hello!!!" and "Hello there..."
    }
}
