package behavioral_patterns.strategy.compression;

import org.junit.jupiter.api.Test;

class CompressionStrategyTest {

    @Test
    void strategyTest() {
        String data = "aabcccccaaa";
        Compressor RLEcompressor = new Compressor(new RunLengthEncoding());
        Compressor simpleReplacementCompressor = new Compressor(new SimpleReplacementCompression());

        // a2b1c5a3
        System.out.println(RLEcompressor.compress(data));
        // 11bccccc111
        System.out.println(simpleReplacementCompressor.compress(data));
    }

}
