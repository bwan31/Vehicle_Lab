package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.swing.undo.CannotRedoException;

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
        assertThrows(IllegalArgumentException.class, () --> {new HondaAccordian(-1, 2018)}, "Starting mileage cannot be negative.");
        assertEquals(null, null);

    }

    public void HondaDriving_test() {
        HondaAccordian honda = new HondaAccordian(2018);
        assertEquals(honda.getMPG(), 33.2, .01, "Verify 33.2 is returned.");
        assertEquals(honda.getFuelCapacity(), 14.5, .01, "Verify 14.5 is returned.");
        assertThrows(IllegalArgumentException.class, ()--> {honda.drive(-1)};, "Verify IllegalArgumentException is thrown (Negative Distance).");
        assertThrows(null, () --> {honda.drive(0)}, "Verify no exception is thrown though the car doesn't move.");
        honda.drive(30);
        assertEquals(honda.getMileage(), 30, .01, "Verify mileage is now 30");
        honda.drive(200);
        assertEquals(honda.getMileage(), 230, .01, "Verify mileage is now 230");
        assertEquals(honda.getRemainingRange(), 251.4, .01, "Verify it is now the full tank range (481.4) minus 230= 251.4");
        assertEquals(honda.getFuelLevel(), 7.57, .01, "Verify it is now the full tank (14.5) minus (230 miles / 33.2 mpg) = 7.57");
        assertEquals(honda.canDrive(252), false, "Verify the return value is False");
        assertEquals(honda.canDrive(251), true, "Verify the return value is True");
        honda.drive(251);
        assertEquals(honda.getMileage(), 481, .01, "Verify mileage is now 481");
        assertThrows(IllegalArgumentException.class, () --> {honda.drive(.5)}, "Verify an IllegalArgumentException is thrown (Driving passed empty).");
        assertThrows(null, () --> {honda.drive(.4)}, "Verify no exception is thrown");
        assertThrows(IllegalArgumentException.class, ()--> {honda.refillTank(-1);}, "Verify an IllegalArgumentException is thrown (Negative refill value).");
        honda.refillTank(7);
        assertEquals(honda.getFuelLevel(), 7, .01, "Verify fuel level is now 7");
        assertThrows(I)
    }
}