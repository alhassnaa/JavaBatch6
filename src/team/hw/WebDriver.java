package team.hw;

 public interface WebDriver {
	void open();
	void close();
	String getTitle();
 }
  interface TakeScreenShot{
	void getScreenShot();
 }
  interface RemoteWebDriver extends WebDriver{
	void navigate();
}

 class ChromeDriver implements RemoteWebDriver,TakeScreenShot{
	public void open() {
		System.out.println("Open ChromeDriver");
	}
	public void close() {
		System.out.println("Close ChromeDriver");
	}
	public String getTitle() {
		System.out.println("GetTitle ChromeDriver");
		return null;
	}
	public void getScreenShot() {
		System.out.println("GetScreenShot ChromeDriver");
	}
	public void navigate() {
		System.out.println("Navigate ChromeDriver");
	}
}
 class FireFoxDriver implements TakeScreenShot,RemoteWebDriver{
	public void open() {
		System.out.println("Open FireFox");
	}
	public void close() {
		System.out.println("Close FireFox");
	}
	public String getTitle() {
		System.out.println("GetTitle FireFox");
		return null;
	}
	public void getScreenShot() {
		System.out.println("GetScreenShot FireFox");
	}
	public void navigate() {
		System.out.println("Navigate FireFox");
	}
}
 class SafariDriver implements TakeScreenShot,RemoteWebDriver{
	public void open() {
		System.out.println("Open SafariDriver");
	}
	public void close() {
		System.out.println("Close SafariDriver");
	}
	public String getTitle() {
		System.out.println("GetTitle SafariDriver");
		return null;
	}
	public void getScreenShot() {
		System.out.println("GetScreenShot SafariDriver");
	}
	public void navigate() {
		System.out.println("Navigate SafariDriver");
	}
}

