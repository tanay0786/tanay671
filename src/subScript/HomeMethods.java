package subScript;

import base.Testbase;
import login_page_OR.HomeObjects;

public class HomeMethods extends Testbase implements HomeObjects {
	public static boolean logincheck(){
		return driver.findElement(Home_composeBTN_Xpath).isDisplayed();
	}

}
