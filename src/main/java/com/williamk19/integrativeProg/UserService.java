package com.williamk19.integrativeProg;

import java.util.ArrayList;
import java.util.List;

public class UserService {
  public List<User> getAll() {
    List<User> data = new ArrayList<User>();
    for (int i = 0; i < 10; i++) {
      User u = new User("William ", i + 1);
      data.add(u);
    }
    return data;
  }
}
