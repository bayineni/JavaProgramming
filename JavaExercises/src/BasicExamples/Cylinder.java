package BasicExamples;

public class Cylinder extends Circle {
	double height;
	double volume;

	public Cylinder(double radius, double height) {
		super(radius);
		if (height < 0) {
			height = 0;
		} else {
			this.height = height;
		}
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume() {
		this.volume = this.area * this.height;
	}

}
