
// A Java program to demonstrate user defined annotations
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// user-defined annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation
{
	String Developer() default "Rahul"; 
	String Expirydate();
} // will be retained at runtime

// Driver class that uses @TestAnnotation
public class Anotation
{
	@TestAnnotation(Developer="Rahul", Expirydate="01-10-2020")
	void fun1()
	{
		System.out.println("Test method 1");
	}

	@TestAnnotation(Developer="Anil", Expirydate="01-10-2021")
	void fun2()
	{
		System.out.println("Test method 2");
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello");
		Anotation t=new Anotation();
		t.fun1();
	}
}