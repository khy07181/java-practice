package common.multilinestring;

import org.junit.jupiter.api.Test;

class MultiLineStringTest {

    @Test
    void testTextBlocks() {
        MultiLineString multiLineString = new MultiLineString();

        System.out.println(multiLineString.textBlocks());
    }

    @Test
    void testStringJoin() {
        MultiLineString multiLineString = new MultiLineString();

        System.out.println(multiLineString.stringJoin());
    }

    @Test
    void testStringBuilder() {
        MultiLineString multiLineString = new MultiLineString();

        System.out.println(multiLineString.stringBuilder());
    }

}
