package school.hei.Repository;

import school.hei.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookCrudOperations  implements CrudOperations<Book> {

  private Connection connection;

    public BookCrudOperations(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Book> findAll() throws SQLException{
      List<Book> allBook = new ArrayList<>();
      String sql = "SELECT * FROM Book";

      try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
          ResultSet resultSet = preparedStatement.executeQuery();

          while (resultSet.next()){
              allBook.add(new Book(
                      resultSet.getInt("iDBook"),
                      resultSet.getString("bookName"),
                      resultSet.getInt("pageNumbers"),
                      resultSet.getString("topic"),
                      resultSet.getDate("releaseDate"),
                      resultSet.getBoolean("availibility")
              ));

          }

      }
        return allBook;
    }

    @Override
    public List<Book> saveAll(List<Book> toSave)throws SQLException{

        return null;
    }

    @Override
    public Book save(Book toSave) throws SQLException{
        String sql = "INSERT INTO Book (bookName, pageNumbers, topic, releaseDate, availibility) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, toSave.getBookName());
            preparedStatement.setInt(2, toSave.getPageNumbers());
            preparedStatement.setString(3, toSave.getTopic());
            preparedStatement.setDate(4, (Date) toSave.getReleaseDate());
            preparedStatement.setBoolean(5, toSave.isAvailibility());

            preparedStatement.executeUpdate();
        }

        return toSave;
    }

    @Override
    public Book delete(Book toDelete)throws SQLException{
        String sql = "DELETE FROM Book WHERE iDBook = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, toDelete.getiDBook());
            preparedStatement.executeUpdate();
        }

        return toDelete;
    }
}
