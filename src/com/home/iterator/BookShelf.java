package com.home.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合，包含存元素和取元素
 * @author GTsung
 * @date 2021/10/18
 */
public class BookShelf implements Aggregate {

    private List<Book> books ;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public MyIterator iterator() {
        return new BookShelfIterator(this);
    }
}
