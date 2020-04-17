package com.syntax.class25;

public interface WebDrivers {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}
class ChromeDriver implements WebDrivers{

	@Override
	public void openBrowser() {
		System.out.println("OpenBrowser in ChromeDriver");
	}

	@Override
	public void closeBrowser() {
		System.out.println("closeBrowser in ChromeDriver");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("maximizeWindow in ChromeDriver");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}
}
	class FirefoxDriver implements WebDrivers{

		@Override
		public void openBrowser() {
			System.out.println("OpenBrowser in FirfoxDriver");
		}

		@Override
		public void closeBrowser() {
			System.out.println("CloseBrowser in FirfoxDriver");
		}

		@Override
		public void maximizeWindow() {
			System.out.println("maximizeWindow in FirfoxDriver");
		}

		@Override
		public void findElement() {
			// TODO Auto-generated method stub
			
		}
		
	}

