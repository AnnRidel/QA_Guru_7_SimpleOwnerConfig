package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${remote}.properties"
})

public interface WebConfig extends Config {
    @Key("browser")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteWebDriver")
    boolean remoteWebDriver();

}