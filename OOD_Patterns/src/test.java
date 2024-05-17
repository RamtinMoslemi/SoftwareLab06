import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    @Test
    public void testSingletonInstance() {
        Package instance1 = Package.init(12.0F);
        Package instance2 = Package.init(15.5F);
        assertSame(instance1, instance2);
    }

    @Test
    public void testChangeShippingStrategy() {
        Package pkg = Package.init(10.0F);

        pkg.changeStrategy(0);
        assertEquals(25.0, pkg.getCost(), 0.1);

        pkg.changeStrategy(1);
        assertEquals(35.0, pkg.getCost(), 0.1);
    }

    @Test
    public void testUpdatePackageState() {
        Package pkg = Package.init(0.0F);
        pkg.updateState(0);
        pkg.updateState(0);
//        assertEquals(0, pkg.getState());


        pkg.updateState(1);
        assertThrows(RuntimeException.class, () -> {
            pkg.updateState(1);
        });
    }



}
