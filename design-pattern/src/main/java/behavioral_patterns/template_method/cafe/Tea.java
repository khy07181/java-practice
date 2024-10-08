package behavioral_patterns.template_method.cafe;

public class Tea extends Beverage {

    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
