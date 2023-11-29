package harshitha;

public class Methoddemo2
{
	public static void main(String[] args)
	{
		System.out.println("main method of Methoddemo2");
	//	funC();
	//	funA();
	//	funB();
		Methoddemo2 m1 = new Methoddemo2();
		m1.funA();
		m1.funB();
		System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of Methoddemo2");
	}
	void funB()
	{
		System.out.println("funB of Methoddemo2");
	}
	void funC()
	{
		System.out.println("funC of Methoddemo2");
	}

}
