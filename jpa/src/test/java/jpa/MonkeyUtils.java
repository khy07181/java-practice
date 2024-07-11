package jpa;

import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.introspector.ArbitraryIntrospector;
import com.navercorp.fixturemonkey.jakarta.validation.plugin.JakartaValidationPlugin;

public class MonkeyUtils {

    public static FixtureMonkey monkey(ArbitraryIntrospector introspector) {
        return FixtureMonkey.builder()
                .objectIntrospector(introspector)
                .plugin(new JakartaValidationPlugin())
                .build();
    }

}
