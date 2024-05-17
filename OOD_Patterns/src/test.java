import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    @Test
    public void testSingletonInstance() {
        Package instance1 = Package.init(12.0F, 1);
        Package instance2 = Package.init(15.5F, 1);
        assertSame(instance1, instance2);
    }

    @Test
    public void testChangeShippingStrategy() {
        Package pkg = Package.init(10.0F, 1);

        pkg.changeStrategy(1);
        assertEquals(25.0, pkg.getCost(), 0.1);

        pkg.changeStrategy(2);
        assertEquals(35.0, pkg.getCost(), 0.1);
    }

    @Test
    public void testUpdatePackageState() {
        Package pkg = Package.init(0.0F, 1);
        pkg.updateState(1);
        pkg.updateState(1);
//        assertEquals(0, pkg.getState());


        pkg.updateState(2);
        assertThrows(RuntimeException.class, () -> {
            pkg.updateState(2);
        });
    }



}
