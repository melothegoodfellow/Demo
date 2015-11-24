package clonePractise;

public class CloneDemo implements Cloneable
{
	
	String type;
	
	public CloneDemo(String type)
	{
		this.type = type;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
