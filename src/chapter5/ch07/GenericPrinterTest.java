package chapter5.ch07;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new chapter5.ch06.Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);
        Powder p = powderPrinter.getMaterial();
        System.out.println(p.toString());


        Plastic plastic = new chapter5.ch06.Plastic();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(plastic);
        Plastic a = plasticPrinter.getMaterial();
        System.out.println(a.toString());

    }
}
