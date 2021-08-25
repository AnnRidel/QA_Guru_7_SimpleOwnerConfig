package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class WebTests {
    @Test
    public void testWebLocal() {
        System.setProperty("remote", "local");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("chrome");
        assertThat(config.browserVersion()).isEqualTo("92.0");
        assertThat(config.remoteWebDriver()).isEqualTo(false);
    }

    @Test
    public void testWebRemote() {
        System.setProperty("remote", "remote");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("opera");
        assertThat(config.browserVersion()).isEqualTo("75.0");
        assertThat(config.remoteWebDriver()).isEqualTo(true);
    }
}
