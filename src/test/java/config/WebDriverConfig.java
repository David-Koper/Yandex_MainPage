package config;

import org.aeonbits.owner.Config;
import java.net.URL;

    @Config.Sources("classpath:${host}.properties")
    public interface WebDriverConfig extends Config {

        @Key("base.url")
        @DefaultValue("https://yandex.ru/")
        String getBaseUrl();

        @Key("browser.name")
        @DefaultValue("CHROME")
        String getBrowser();

        @Key("browser.version")
        @DefaultValue("100.0")
        String getBrowserVersion();

        @Key("browser.size")
        @DefaultValue("1920x1080")
        String getBrowserSize();

        @Key("remote.url")
        URL getRemoteUrl();

        @Config.Key("remote.WebDriver")
        String getRemoteWebDriver();

    }

