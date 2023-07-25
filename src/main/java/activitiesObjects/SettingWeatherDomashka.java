package activitiesObjects;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingWeatherDomashka {
    static AndroidDriver driver;
    public SettingWeatherDomashka (AndroidDriver driver) {
        this.driver = driver;
    }
    By timeFormat = By.id("com.weather.forecast.weatherchannel:id/tg_format_time_setting");
    By notification = By.id("com.weather.forecast.weatherchannel:id/tgNotifi_settings");
    By statusBar = By.id("com.weather.forecast.weatherchannel:id/tg_notifi_second_settings");
    By doneButton = By.id("com.weather.forecast.weatherchannel:id/tvDone");

    public void timeFormatSelect (TIME temp) {
        MobileElement time = (MobileElement) driver.findElement(timeFormat);
        switch (temp) {
            case TWELVE -> {
                if (time.getAttribute("checked").equals("true")) {
                    time.click();
                }
            }
            case TWENTY_FOUR -> {
                if (time.getAttribute("checked").equals("false")) {
                    time.click();
                }
            }
        }
    }
    public void notificationSelect(NOTIFICATION note) {
        MobileElement sendNotification = (MobileElement) driver.findElement(notification);
        switch (note) {
            case ON -> {
                if (sendNotification.getAttribute("checked").equals("true")) {
                    sendNotification.click();
                }
            }
            case OFF -> {
                if (sendNotification.getAttribute("checked").equals("false")) {
                    sendNotification.click();
                }
            }
        }
    }

    public void setStatus(STATUS stat) {
        MobileElement chooseStatus = (MobileElement) driver.findElement(statusBar);
        switch (stat) {
            case ON -> {
                if (chooseStatus.getAttribute("checked").equals("true")) {
                    chooseStatus.click();
                }
            }
            case OFF -> {
                if (chooseStatus.getAttribute("checked").equals("false")) {
                    chooseStatus.click();
                }
            }
        }
    }
    public void clickDone() {
        driver.findElement(doneButton).click();
    }


    public enum TIME {
        TWELVE("12"), TWENTY_FOUR("24");
        String time;
        TIME(String time) {
            this.time = time;
        }
        public String getTime() {
            return time;
        }
    }
    public enum NOTIFICATION {
        ON, OFF;
    }
    public enum STATUS {
        ON, OFF;
    }
}
