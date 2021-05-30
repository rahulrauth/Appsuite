package com.andriod.mob;

import org.testng.annotations.Test;

import com.android.common.ComBase;

public class TestSuite extends ComBase{
	
	
	@Test(priority = 1)
	public static void CheckLoanActiveCase() throws InterruptedException{
		login();
		swipe(921,610,175,620);
		swipe(540,1824,540,672);
		creditScoreView();
		swipe(540,1824,540,672);
		pragatiPage();
		swipe(540,1824,540,672);
		navigateBack();
		loanStatement();
		topUp();
		requestSupport();
		navigateBack();
		swipe(540,1824,540,672);
		makePayment();
		logout();
		quit();
		
	}

}
