package school.hei;

import school.hei.Repository.AuthorCrudOperations;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;


import static school.hei.DatabaseConnection.getConnection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Logger logger = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws SQLException {
      /* BookCrudOperations con = new BookCrudOperations(getConnection());

        Book book = new Book( 1,"Les seigneurs des anneaux",500,"Roman",new Date(2023-10-10),true);
        con.save(book);
        logger.info("Livre enregistré : {}");*/

        AuthorCrudOperations con = new AuthorCrudOperations(getConnection());

        /**Author author = new Author(1,"Jean pierre","M");
        con.save(author);
        logger.info("Author enregistré");*/

        List<Author> allAuthor = con.findAll();
        logger.info("Tous les livres : {}");
    }


}