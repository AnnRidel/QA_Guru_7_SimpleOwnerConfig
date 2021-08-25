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
}
