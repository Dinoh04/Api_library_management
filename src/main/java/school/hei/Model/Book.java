package school.hei.Model;

import school.hei.topic_enum;

import java.sql.Date;


public class Book {
    private int iDBook;
    private String bookName;
    private int pageNumbers;
    private topic_enum topic;
    private Date releaseDate;
    private boolean availibility;
    private int authorId;


    public Book(int iDBook, String bookName, int pageNumbers, topic_enum topic, Date releaseDate, boolean availibility, int authorId) {
        this.iDBook = iDBook;
        this.bookName = bookName;
        this.pageNumbers = pageNumbers;
        this.topic = topic;
        this.releaseDate = releaseDate;
        this.availibility = availibility;
        this.authorId = authorId;
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

    public topic_enum getTopic() {
        return topic;
    }

    public void setTopic(topic_enum topic) {
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iDBook=" + iDBook +
                ", bookName='" + bookName + '\'' +
                ", pageNumbers=" + pageNumbers +
                ", topic='" + topic + '\'' +
                ", releaseDate=" + releaseDate +
                ", availibility=" + availibility +
                ", authorId=" + authorId +
                '}';
    }
}
