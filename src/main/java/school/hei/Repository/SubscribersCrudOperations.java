package school.hei.Repository;

import school.hei.Model.Subscribers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubscribersCrudOperations implements CrudOperations<Subscribers>{

    private Connection connection;

    public SubscribersCrudOperations(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Subscribers> findAll() throws SQLException {
        List<Subscribers> allSubscribers = new ArrayList<>();
        String sql = "SELECT * FROM Subscribers";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                allSubscribers.add(new Subscribers(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDate("dateOfBirth"),
                        resultSet.getString("email"),
                        resultSet.getString("reference")

                ));

            }

        }
        return allSubscribers;
    }

    @Override
    public List<Subscribers> saveAll(List<Subscribers> toSave) throws SQLException {
        return null;
    }

    @Override
    public Subscribers save(Subscribers toSave) throws SQLException {
        String sql = "INSERT INTO Subscribers  (name,dateOfBirth,email,reference) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, toSave.getName());
            preparedStatement.setDate(2, toSave.getDateOfBirth());
            preparedStatement.setString(3, toSave.getEmail());
            preparedStatement.setString(4, toSave.getReference());

            preparedStatement.executeUpdate();
        }

        return toSave;
    }

    @Override
    public Subscribers delete(Subscribers toDelete) throws SQLException {
        return null;
    }
}
