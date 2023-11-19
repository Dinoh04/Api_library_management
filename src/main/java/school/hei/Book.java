package school.hei;

import java.sql.Date;

public class Book {
    private int iDBook;
    private String bookName;
    private int pageNumbers;
    private String topic;
    private java.sql.Date releaseDate;
    private boolean availibility;


    public Book(int iDBook, String bookName, int pageNumbers, String topic, java.sql.Date releaseDate, boolean availibility) {
        this.iDBook = iDBook;
        this.bookName = bookName;
        this.pageNumbers = pageNumbers;
        this.topic = topic;
        this.releaseDate = releaseDate;
        this.availibility = availibility;
    }

    public int getiDBook() {
        return iDBook;
    }

    public void setiDBook(int iDBook) {
        this.iDBook = iDBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAvailibility() {
        return availibility;
    }

    public void setAvailibility(boolean availibility) {
        this.availibility = availibility;
    }
}
