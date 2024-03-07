package Annotations;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;

public class AnnotationDemo1 
{

	@Test
	public void f ()
	{
		System.out.println("f of AnnotationDemo1");
	}
	@BeforeMethod
	public void BeforeMethod ()
	{
		System.out.println("f of AnnotationDemo1");
	}
	@BeforeMethod
	public void AfterMethod()
	{
		System.out.println("f of AnnotationDemo1");
	}
	@BeforeClass
	public void BeforeClass ()
	{
		System.out.println("f of AnnotationDemo1");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("f of AnnotationDemo1");
	}
}
