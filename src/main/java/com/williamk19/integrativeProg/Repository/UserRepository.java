package com.williamk19.integrativeProg.Repository;

import com.williamk19.integrativeProg.Bean.User;
import com.williamk19.integrativeProg.DBManager.UserDBManager;

import java.sql.SQLException;
import java.util.Vector;

public class UserRepository {
  public static Vector<User> getAllUsersData(){
    try {
      return UserDBManager.getAllUsers();
    } catch (SQLException e) {
      return null;
    }
  }

  public static int deleteUser(String username) {
    try {
      return UserDBManager.deleteUser(username);
    } catch (SQLException throwables) {
      return -1;
    }
  }

  public static User getUserData(String username) {
    try {
      return UserDBManager.getUser(username);
    } catch (SQLException throwables) {
      return null;
    }
  }

  public static int createUser(User newUserData) {
    try {
      return UserDBManager.insertUser(newUserData);
    } catch (SQLException throwables) {
      return -1;
    }
  }
}
