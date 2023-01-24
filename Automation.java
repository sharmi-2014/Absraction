package week4.day1;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public void Selenium() {
		
		System.out.println("Selenium");
		
	}

	public void Java() {
	  System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.Selenium();
		obj.Java();
	
		obj.ruby();
		obj.python();
		
	}

}
