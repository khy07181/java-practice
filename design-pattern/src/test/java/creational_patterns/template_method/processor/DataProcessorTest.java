package creational_patterns.template_method.processor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DataProcessorTest {

    @Test
    void templateMethod() {
        DataProcessor csvDataProcessor = new CSVDataProcessor();
        csvDataProcessor.process("CSV data");

        System.out.println();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        assertThatThrownBy(() -> jsonProcessor.process("XML data"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Data is invalid, processing aborted.");
    }
}
