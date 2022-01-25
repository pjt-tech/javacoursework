package chapter5.ch06;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);
        Powder material = powderPrinter.getMaterial();
        System.out.println(material.toString());

        Plastic plastic = new Plastic();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(plastic);
        Plastic material1 = plasticPrinter.getMaterial();
        System.out.println(material1.toString());

    }
}
