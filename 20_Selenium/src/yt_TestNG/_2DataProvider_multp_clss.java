package yt_TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class _2DataProvider_multp_clss {
	
	@DataProvider					//Method name not mandetory. It is just to see linked method.
	public static Object[][] getdata(Method name){ // making static bcoz have to use in another class
		
		System.out.println("Test case which has the method is :" + name.getName());
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="USR1";
		data[0][1]="PASS1";
		
		data[1][0]="USR2";
		data[1][1]="PASS2";
		
		return data;
	}

}
// go to repractice package --> TestClassDataProvider class