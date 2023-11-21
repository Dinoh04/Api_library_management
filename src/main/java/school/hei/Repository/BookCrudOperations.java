package school.hei.Repository;

import school.hei.Model.Book;
import school.hei.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookCrudOperations  implements CrudOperations<Book> {

    private static Connection connection;

    public BookCrudOperations(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Book> findAll() throws SQLException {
        return null;
    }

    @Override
    public List<Book> saveAll(List<Book> toSave) throws SQLException {
        List<Book> savedBooks = new ArrayList<>();

        for (Book book : toSave) {
            savedBooks.add(save(book));
        }

        return savedBooks;
    }

    @Override
    public Book save(Book toSave) throws SQLException {
        String sql = "INSERT INTO Book (bookName, pageNumbers, topic, releaseDate, availibility, authorId) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, toSave.getBookName());
            preparedStatement.setInt(2, toSave.getPageNumbers());
            preparedStatement.setString(3, toSave.getTopic().name());
            preparedStatement.setDate(4, toSave.getReleaseDate());
            preparedStatement.setBoolean(5, toSave.isAvailibility());
            preparedStatement.setInt(6, toSave.getAuthorId());

            preparedStatement.executeUpdate();
        }

        return toSave;
    }

    @Override
    public Book delete(Book toDelete) throws SQLException {
        String sql = "DELETE FROM Book WHERE iDBook = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, toDelete.getiDBook());
            preparedStatement.executeUpdate();
        }

        return toDelete;
    }
}
