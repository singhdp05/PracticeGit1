package demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {
	
	
	@Test
	public void testRun()
	{
		PS2 ps2 = new PS2(3); //parametrized constructor
		
			doThis();
			System.out.println(ps2.increment());
			System.out.println(ps2.decrement());
			
	//		PS3 ps3 = new PS3(3);
			System.out.println(ps2.multiplyByThree());
			System.out.println("good practice");
			System.out.println("must go on");
			System.out.println("yes we should");
			System.out.println("ok lets go");
			System.out.println("Copied from git");
			System.out.println("Copied from git2");
			System.out.println("Copied from git3");
			System.out.println("Copied from git4");
			System.out.println("Copied from git5");
			System.out.println("Copied from git6");
			System.out.println("Copied from git7");
			

	}
	

}
