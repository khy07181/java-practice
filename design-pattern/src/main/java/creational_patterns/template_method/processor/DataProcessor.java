package creational_patterns.template_method.processor;

abstract class DataProcessor {
    public final void process(String data) {
        loadData(data);
        if (!isValidData(data)) {
            throw new IllegalArgumentException("Data is invalid, processing aborted.");
        }
        processData(data);
        saveData(data);
    }

    protected abstract void loadData(String data);
    protected abstract boolean isValidData(String data);
    protected abstract void processData(String data);
    protected abstract void saveData(String data);
}
