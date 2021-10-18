package com.home.iterator;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public class IteratorTest {

    public static void main(String[] args) {
        Book book = new Book("百年孤独");
        Book book2 = new Book("理想国");
        Book book3 = new Book("国富论");
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(book);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        MyIterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book b = (Book) iterator.next();
            System.out.println(b);
        }
    }
}
