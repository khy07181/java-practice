package creational_patterns.singleton;

import java.io.Serializable;

public class Settings4 implements Serializable {

    private Settings4() { }

    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
