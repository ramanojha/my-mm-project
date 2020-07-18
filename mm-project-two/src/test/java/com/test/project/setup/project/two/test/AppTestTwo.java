package com.test.project.setup.project.two.test;



import org.testng.annotations.Test;

import com.test.project.setup.core.application.Application;
import com.test.project.setup.main.MainApp;
import com.test.project.setup.project.two.src.AppTwo;

public class AppTestTwo {
	
	@Test
	public static void appTestTwoTest(){
		MainApp.mainApp();
		AppTwo.appTestTwoTest();
		Application.appCodeMethodOne("Two");
	}
}
