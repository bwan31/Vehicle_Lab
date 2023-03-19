package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HondaAccordianTester {
    
    @Test
    public void HondaConstructor_Test() {
        HondaAccordian h = new HondaAccordian(2018);
        assertEquals(h.getMileage(), 0, 0.01, "Verify Mileage equals 0");
        assertEquals(h.getFuelCapacity(), 14.5, 0.01, "Verify fuel capacity equals 14.5");
        assertEquals(h.getFuelLevel(), 14.5, .01, "Verify Fuel Level matches fuel capacity");
        assertEquals(h.getMPG(), 33.2, .01, "Verify mpg equals 33.2");
        assertEquals(h.getRemainingRange(), 481.4, .01, "Verify remaining range matches fuel level * mpg");
        assertEquals(h.toString(), "2018 Honda Accordian (0.0 mi)", "Verify toString matches '2018 Honda Accordian (0.0 mi)'");
        assertEquals(new HondaAccordian(-12.2, 2018), new IllegalArgumentException(), "Verify an IllegalArgumentException is thrown (negative)");
        assertEquals(null, null);

    }
}
