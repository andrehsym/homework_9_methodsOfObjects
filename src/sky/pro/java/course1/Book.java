package sky.pro.java.course1;

import java.util.Objects;

public class Book {
    private final String title;
    private int publishingYear;
    private final Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Книга {" +
                "Название: '" + title + '\'' +
                ". Год публикации: " + publishingYear +
                ". Автор: " + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishingYear, author);
    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return title.equals(book.title);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title);
//    }
}
