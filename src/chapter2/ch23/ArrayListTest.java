package chapter2.ch23;

import chapter2.ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        //객체 배열을 조금 더 편리하게 사용할 수 있도록 자바에서 제공해주는 라이브러리 중 하나. ArrayList
        //배열을 줄이고 늘리는데 개발자는 신경쓸 필요 없이 개발을 하면된다.
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥1", "박진태"));
        library.add(new Book("태백산맥2", "박진태"));
        library.add(new Book("태백산맥3", "박진태"));
        library.add(new Book("태백산맥4", "박진태"));
        library.add(new Book("태백산맥5", "박진태"));

        for (Book book : library) {
            book.showInfo();
        }
    }
}
