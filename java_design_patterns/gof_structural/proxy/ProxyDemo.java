package java_design_patterns.gof_structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10MB.jpg");

        //Image will be loaded from disk
        image.display();

        //image will not be loaded from disk
        image.display();
    }
}