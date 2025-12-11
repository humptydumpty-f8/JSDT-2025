package lec15;

public class Ex1_0 {
    public static void main(String[] args) {
        Buttom button = new Buttom(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}

class ButtonClickHandler implements EventHandler {
    public void execute() {
        System.out.println("The button is pressed");
    }
}

interface EventHandler {
    void execute();
}

class Buttom {
    EventHandler handler;

    Buttom(EventHandler action) {
        this.handler = action;
    }

    public void click() {
        handler.execute();
    }
}