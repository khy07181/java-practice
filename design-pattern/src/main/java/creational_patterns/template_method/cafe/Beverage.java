package creational_patterns.template_method.cafe;

abstract class Beverage {
    // Template method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();
}
