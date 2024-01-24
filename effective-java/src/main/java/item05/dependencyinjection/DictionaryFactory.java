package item05.dependencyinjection;

import item05.DefaultDictionary;

public class DictionaryFactory {

    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }

}
