package school.hei.Repository;

import school.hei.Model.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorCrudOperations implements CrudOperations<Author> {
    private Connection connection;

    public AuthorCrudOperations(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Author> findAll() throws SQLException {
        List<Author> allAuthor = new ArrayList<>();
        String sql = "SELECT * FROM Author";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                allAuthor.add(new Author(
                        resultSet.getInt("authorId"),
                        resultSet.getString("name"),
                        resultSet.getString("sex")

                ));

            }

        }
        return allAuthor;
    }

    @Override
    public List<Author> saveAll(List<Author> toSave) throws SQLException{
        return null;
    }

    @Override
    public Author save(Author toSave) throws SQLException{
        String sql = "INSERT INTO Author (name,sex) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, toSave.getName());
            preparedStatement.setString(2, toSave.getSex());

            preparedStatement.executeUpdate();
        }

        return toSave;
    }

    @Override
    public Author delete(Author toDelete) {
        return null;
    }
}
