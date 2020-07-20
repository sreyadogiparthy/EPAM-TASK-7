package Task_6.Design_patterns;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import behavioural_state.Circle;
import behavioural_state.DrawingTool;
import behavioural_state.Rectangle;

public class StateTest {
	@Test
	public void stateTest1() {
		DrawingTool dt = new DrawingTool(new Rectangle());
		assertEquals("Drawing Rectangle",dt.draw());
		dt.setShape(new Circle());
		assertEquals("Drawing Circle", dt.draw());
	}
}