public class Cylinder extends Circle1{
	double height=1.0;
	int base=2;
	int area=4;
	double pi=3.14;
	void getArea(){
		
		System.out.println("surface area =" + (2*pi*radius*height) + (2*base-area)); 
		super.getArea();
	}
	public static void main(String[] args) {
		Cylinder obj=new Cylinder();
		obj.getArea();

	}

}