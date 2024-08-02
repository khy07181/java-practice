package creational_patterns.strategy.compression;

public class Compressor {

    private final CompressionStrategy compressionStrategy;

    public Compressor(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public String compress(String data) {
        return compressionStrategy.compress(data);
    }
}
