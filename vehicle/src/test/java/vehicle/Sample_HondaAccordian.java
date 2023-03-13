package vehicle;

public class Sample_HondaAccordian {
    
    @Test
    public void HondaConstructor_Tests() {
        HondaAccordian h = new HondaAccordian;

        assertEquals(h.getFuelCapacity(), 14.5, 0.01, "Initial fuel capaticity should be 14.5");

        assertEquals(h.toString("2018 Honda Accordian (0.0 mi)"), "toString wrong");
    }

}
