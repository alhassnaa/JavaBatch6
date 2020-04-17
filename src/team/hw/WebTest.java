package team.hw;

public class WebTest {

	public static void main(String[] args) {
		RemoteWebDriver chrome=new ChromeDriver();
		chrome.open();
		chrome.close();
		chrome.getTitle();
		chrome.navigate();
		
		System.out.println("*******************");
		
		RemoteWebDriver fox=new FireFoxDriver();
		fox.open();
		fox.close();
		fox.getTitle();
		fox.navigate();
		
		System.out.println("*******************");
		
		RemoteWebDriver safari=new SafariDriver();
		safari.open();
		safari.close();
		safari.getTitle();
		safari.navigate();
	}

}
