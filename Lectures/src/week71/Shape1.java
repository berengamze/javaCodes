package week71;


public class Shape1 {
public static void main(String[] args) {
	new Shape1().area();
	new rectangle(1,2).area();
	new circle(4).area();
}
void area(){
}
}

class rectangle extends Shape1{
	int width;
	int length;
	
	public rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	void area() {
		System.out.println(width*length);
		super.area();
	}
}
class circle extends Shape1{
	int radius;
	
	public circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println(radius * radius * Math.PI);
		super.area();
	}
}
class cube extends Shape1{
	int side;
	
	public cube(int side) {
		super();
		this.side = side;
	}

	@Override
void area() {
	System.out.println(6 * Math.pow(side, 2));
	super.area();
}}
