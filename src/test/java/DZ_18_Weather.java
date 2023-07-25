import activitiesObjects.SettingWeatherDomashka;
import org.junit.BeforeClass;
import org.junit.Test;

public class DZ_18_Weather extends Base {
    static SettingWeatherDomashka object;

    @BeforeClass
    public static void before() {
        object = new SettingWeatherDomashka(driver);
    }

    @Test
    public void testTime() {
        object.timeFormatSelect(SettingWeatherDomashka.TIME.TWENTY_FOUR);
    }

    @Test
    public void testNotification() {
        object.notificationSelect(SettingWeatherDomashka.NOTIFICATION.ON);
    }

    @Test
    public void testStatus() {
        object.setStatus(SettingWeatherDomashka.STATUS.ON);
    }

    @Test
    public void testDoneButton() {
        object.clickDone();
    }
}
