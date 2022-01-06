package chapter3.ch09;

public class ComputerTest {

    public static void main(String[] args) {

        Computer desktop = new Desktop();
        desktop.display();
        Computer myNoteBook = new MyNoteBook();
        myNoteBook.typing();
        myNoteBook.display();
    }
}
