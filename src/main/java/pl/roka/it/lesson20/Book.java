package pl.roka.it.lesson20;

import java.util.Objects;

public class Book {
    private int bookID;
    private String title;
    private String genre;
    private String author;

    public Book(int bookID, String title, String genre, String author) {
        this.bookID = bookID;
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return bookID == book.bookID && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = bookID;
        result = 31 * result + Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(genre);
        result = 31 * result + Objects.hashCode(author);
        return result;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
