package com.williamk19.integrativeProg.DBManager;

import com.williamk19.integrativeProg.Bean.User;
import com.williamk19.integrativeProg.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class UserDBManager {
  public static Vector<User> getAllUsers() throws SQLException {
    String query = "select * from users";
    Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    ResultSet resultSet = preparedStatement.executeQuery();

    Vector<User> allUsers = new Vector();

    while (resultSet.next()) {
      User user = new User();
      user.setUsername(resultSet.getString("username"));
      user.setPassword(resultSet.getString("password"));
      user.setFirstName(resultSet.getString("firstname"));
      user.setLastName(resultSet.getString("lastname"));

      allUsers.add(user);
    }

    return allUsers;
  }

  public static User getUser(String username) throws SQLException {
    String query = "select * from users where username=?";
    PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
    preparedStatement.setString(1, username);

    ResultSet resultSet = preparedStatement.executeQuery();
    if (resultSet.next()) {
      User user = new User();
      user.setUsername(resultSet.getString("username"));
      user.setPassword(resultSet.getString("password"));
      user.setFirstName(resultSet.getString("firstname"));
      user.setLastName(resultSet.getString("lastname"));

      return user;
    } else {
      return null;
    }
  }

  public static Vector<User> getUserByName(String namePart) throws SQLException {
    String query = "select * from users where firstname like %?% or lastname like %?%";
    PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
    preparedStatement.setString(1, namePart);
    preparedStatement.setString(2, namePart);
    ResultSet resultSet = preparedStatement.executeQuery();

    Vector<User> filteredUsers = new Vector();

    while (resultSet.next()) {
      User user = new User();
      user.setUsername(resultSet.getString("username"));
      user.setPassword(resultSet.getString("password"));
      user.setFirstName(resultSet.getString("firstname"));
      user.setLastName(resultSet.getString("lastname"));

      filteredUsers.add(user);
    }

    return filteredUsers;
  }

  public static int insertUser(User newUserData) throws SQLException {
    String query = "insert into users(username,password,firstname,lastname) values(?,?,?,?)";
    PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
    preparedStatement.setString(1, newUserData.getUsername());
    preparedStatement.setString(2, newUserData.getPassword());
    preparedStatement.setString(3, newUserData.getFirstName());
    preparedStatement.setString(4, newUserData.getLastName());

    int affectedRows = preparedStatement.executeUpdate();
    return affectedRows;
  }

  public static int deleteUser(String username) throws SQLException {
    String query = "delete from users where username=?";
    PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(query);
    preparedStatement.setString(1, username);

    int affectedRows = preparedStatement.executeUpdate();
    return affectedRows;
  }
}
