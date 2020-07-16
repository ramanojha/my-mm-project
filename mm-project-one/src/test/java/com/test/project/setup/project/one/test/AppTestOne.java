package com.test.project.setup.project.one.test;



import org.testng.annotations.Test;

import com.test.project.setup.core.application.Application;
import com.test.project.setup.project.one.src.AppOne;

public class AppTestOne {
	
	@Test
	public static void appTestOneTest(){
		AppOne.appTestOneTest();
		Application.appCodeMethodOne("One");
	}
}
