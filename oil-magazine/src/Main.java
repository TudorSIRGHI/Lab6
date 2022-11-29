import model.design.Controller;
import model.design.ControllerInterface;

public class Main {
    public static void main(String[] args) {
        ControllerInterface controller = new Controller();
        controller.display();
    }
}