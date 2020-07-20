package behavioural_state;

public class DrawingTool {
	Shape shape;

	public DrawingTool(Shape shape) {
		this.shape = shape;
	}

	public String draw() {
		return shape.draw();
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
}