package chapter2.ch21;

public class BookTest {


    public static void main(String[] args) {
        Book[] library = new Book[5];

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("태백산맥1", "박진태");
        library[1] = new Book("태백산맥2", "박진태");
        library[2] = new Book("태백산맥3", "박진태");
        library[3] = new Book("태백산맥4", "박진태");
        library[4] = new Book("태백산맥5", "박진태");

        for (Book book : library) {
            book.showInfo();
            System.out.println("book = " + book);
        }
    }
}
