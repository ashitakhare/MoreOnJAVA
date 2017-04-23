class Rectangle{
	public int width;
	public int height;
	
	public void show(){
		System.out.println("This is a Method");
	}
}
public class Demo {
	public static void main(String[] args) {
		Rectangle myRect1= new Rectangle();
		myRect1.width=10;
		System.out.println(myRect1.width);
	
		myRect1.height=20;
		System.out.println(myRect1.height);
		myRect1.show();
	}
	
	
	
}
