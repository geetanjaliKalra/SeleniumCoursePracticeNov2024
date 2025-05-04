package SeleniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarAutomation {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.ae/flights");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[contains(@class,'homeCalender')]/button")).click();
		String journeyDate = "4-May-2026";
		Thread.sleep(1000);
		selectDate(journeyDate);
	}

	public static void selectDate(String departDate) {
		String[] split = departDate.split("-");
		String journeyDay = split[0];
		String expectedjourneyMonthYear = split[1] + " " + split[2];
		// WebElement expectedCalendarMonthUI =
		// driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div[text()='"+expectedjourneyMonthYear+"']"));

		while (true) {
			List<WebElement> actualMonthYearsOnCal = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));

			if (!(actualMonthYearsOnCal.get(0).getText().equalsIgnoreCase(expectedjourneyMonthYear)
					|| actualMonthYearsOnCal.get(1).getText().equalsIgnoreCase(expectedjourneyMonthYear))) {
				System.out.println(actualMonthYearsOnCal.get(0).getText());
				System.out.println(actualMonthYearsOnCal.get(1).getText());
				driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
				System.out.println("after clicking on next");
			} else {
				System.out.println("conditionmatched");
				break;
			}
		}
		
		System.out.println("outside loop");
		driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[text()='" + expectedjourneyMonthYear
				+ "']/parent::div/parent::div//following-sibling::div[@class='DayPicker-Body']//div[text()='"
				+ journeyDay + "']")).click();

	}
}
