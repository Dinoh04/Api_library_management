package school.hei;

import school.hei.Model.Book;
import school.hei.Model.Subscribers;
import school.hei.Repository.BookCrudOperations;
import school.hei.Repository.SubscribersCrudOperations;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;


import static school.hei.DatabaseConnection.getConnection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Logger logger = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws SQLException {
      BookCrudOperations con = new BookCrudOperations(getConnection());

        Book book = new Book(1,"Pride and Prejudice", 352, topic_enum.ROMANCE, new Date(2010-11-23), true,1);
        con.save(book);
        logger.info("Livre enregistré : {}");

        /**AuthorCrudOperations con = new AuthorCrudOperations(getConnection());

        Author author = new Author(1,"Jean pierre","M");
        con.save(author);
        logger.info("Author enregistré");

        List<Author> allAuthor = con.findAll();
        System.out.println(allAuthor);*/

        /**SubscribersCrudOperations con = new SubscribersCrudOperations(getConnection());

        Subscribers subscribers = new Subscribers(1,"Alfred",new Date(2023-11-11),"Alfred@gmail.com","46465123156");
        con.save(subscribers);

        List<Subscribers> allSubscribers = con.findAll();
        System.out.println(allSubscribers);*/

    }


}