package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:/Users/admin/Documents/QA_Guru/api.properties",
        "classpath:api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String token();
}