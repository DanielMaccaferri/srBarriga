package br.com.srbarriga.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import br.com.srbarriga.core.Driver;
import cucumber.api.Scenario;

public class Screenshoot {

	public static void screenshoot(Scenario cenario) {
		if(cenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			cenario.embed(screenshot, "image/png");
		}
		File file = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshoots/"+cenario.getName()+".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
