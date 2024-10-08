package structural_patterns.facade.smart_home;

import org.junit.jupiter.api.Test;

class SmartHomeFacadeTest {

    @Test
    void smartHomeFacadeTest() {
        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHomeFacade smartHome = new SmartHomeFacade(thermostat, lights, coffeeMaker);

        smartHome.wakeUp();
        smartHome.leaveHome();
    }

}
