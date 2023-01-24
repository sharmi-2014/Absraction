package week4.day1;

public class Electronics  extends Television implements Mobile, Laptop{

	public void windows() {
		System.out.println( "windows 10");
		// TODO Auto-generated method stub
		
	}

	public void version() {
		System.out.println("j5");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brand() {
		System.out.println("Samsung");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Electronics obj= new Electronics();
		obj.windows();
		obj.version();
		obj.brand();
		obj.android();
		
	}

}
