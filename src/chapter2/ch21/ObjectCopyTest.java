package chapter2.ch21;

public class ObjectCopyTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "박진태");
        library[1] = new Book("태백산맥2", "박진태");
        library[2] = new Book("태백산맥3", "박진태");
        library[3] = new Book("태백산맥4", "박진태");
        library[4] = new Book("태백산맥5", "박진태");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        //깊은복사
        for(int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        //얕은복사
        //System.arraycopy(library,0,copyLibrary,0,5);
        /*System.out.println("==library==");
        for (Book book : library) {
            book.showInfo();
            System.out.println("book = " + book);
        }
        System.out.println("==copyLibrary==");
        for (Book book : copyLibrary) {
            book.showInfo();
            System.out.println("book = " + book);
        }*/
        System.out.println("==library==");
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        for (Book book : library) {
            book.showInfo();
            System.out.println("book = " + book);
        }

        System.out.println("==copyLibrary==");
        for (Book book : copyLibrary) {
            book.showInfo();
            System.out.println("book = " + book);
        }


    }
}
