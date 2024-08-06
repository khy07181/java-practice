package creational_patterns.facade.file;

import org.junit.jupiter.api.Test;

class FileSystemFacadeTest {

    @Test
    void fileSystemFacadeTest() {
        FileSystemFacade fs = new FileSystemFacade();

        // Write to file
        boolean writeSuccess = fs.writeFile("test.txt", "Hello, Facade Pattern!");
        System.out.println("File write success: " + writeSuccess);

        // Read from file
        String content = fs.readFile("test.txt");
        System.out.println("File content: " + content);

        // Delete file
        boolean deleteSuccess = fs.deleteFile("test.txt");
        System.out.println("File delete success: " + deleteSuccess);
    }
}
