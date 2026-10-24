package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base_class{
	
	@Test
	public void Login_Test()
	{
		System.out.println("********Login Test********");
		String Page_Title=driver.getTitle();
		System.out.println(Page_Title);
		
		
		Assert.assertEquals(Page_Title, "Google");
	}

}
