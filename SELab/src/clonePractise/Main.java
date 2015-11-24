package clonePractise;

public class Main
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneDemo demo = new CloneDemo("this");
		CloneDemo demo1 =  (CloneDemo) demo.clone();

		System.out.println(demo.type);
		System.out.println(demo1.type);
	}

}
