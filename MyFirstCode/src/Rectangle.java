
public class Rectangle {
	private int length;
	private int width;
	
	//Variables 
	public Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	// Method or behavior
	public int Parameter()
	{
		int a=2*(length+width);
		return a;
	}
	public int Area()
	{
		int b=length*width;
		return b;
	}
	
	public String toString()
	{
		return String.format("length- %d, width- %d,Parameter- %d,Area- %d",length,width,Parameter(),Area());
	}
	
	

}
