package testscripts;

public class ThirdTest {
	public void thirdTest()throws InterruptedException{
		soft.assertEquals(javaVideo.getpageHeader(),"core Java For seleninum Training");
		
		javaVideo.clickCloseCookies();
		web.switchToFrame();
		javaVideo.clickPlayButton(;)
		Thread.sleep(2000);
		javaVideo.clickPauseButton();
		
		web.switchBackFromFrame();
		
		javaVideo.clickAddToWishlist();
		 soft.assertAll();
		 
	}

}
