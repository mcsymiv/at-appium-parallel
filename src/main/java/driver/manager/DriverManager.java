package driver.manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import lombok.Getter;

@Getter
public class DriverManager {

    private final static ThreadLocal<AppiumDriver<MobileElement>> driver = new ThreadLocal<>();

    public static void setDriver(AppiumDriver<MobileElement> webDriver) {
        driver.set(webDriver);
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver.get();
    }
}
