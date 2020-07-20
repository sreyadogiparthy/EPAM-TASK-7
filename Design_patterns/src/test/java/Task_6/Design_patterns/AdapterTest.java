package Task_6.Design_patterns;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import structural_adapter.HpIndianCharger;
import structural_adapter.HpUsCharger;
import structural_adapter.UsToIndiaAdapter;

public class AdapterTest {
	@Test
	public void adapterTest1() {
		HpIndianCharger hI = new HpIndianCharger();
		HpUsCharger hU = new HpUsCharger();
		assertEquals("Indian",hI.fitsWhat());
		assertEquals("US",hU.fitsWhat());
		UsToIndiaAdapter hUI = new UsToIndiaAdapter(hU);
		assertEquals("Indian",hUI.fitsWhat());
	}
}

