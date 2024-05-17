package test;

import Package.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class test {
    @Test
    public void testSingletonInstance() {
        Package instance1 = Package.getInstance();
        Package instance2 = Package.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testChangeShippingStrategy() {
        Package pkg = Package.getInstance();
        pkg.setWeight(10.0f);

        pkg.changeShippingStrategy(Strategy.normal);
        assertEquals(25.0f, pkg.getCost(), 0.1);

        pkg.changeShippingStrategy(Strategy.express);
        assertEquals(35.0f, pkg.getCost(), 0.1);
    }

    @Test
    public void testUpdatePackageState() {
        Package pkg = Package.getInstance();
        pkg.setState(State.transition);
        pkg.updatePackageState(State.transition);
        assertEquals(State.transition, pkg.getState());


        pkg.setState(State.delivered);
        assertThrows(RuntimeException.class, () -> {
            pkg.updatePackageState(State.delivered);
        });
    }



}
