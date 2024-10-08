package structural_patterns.proxy.image;

import org.junit.jupiter.api.Test;

class ImageTest {

    @Test
    void proxy() {
        ProxyImage iamge = new ProxyImage("test_image.jpg");

        System.out.println("File name: " + iamge.getFileName());
        System.out.println("File extension: " + iamge.getFileExtension());

        iamge.display();
        iamge.display();
    }

}
