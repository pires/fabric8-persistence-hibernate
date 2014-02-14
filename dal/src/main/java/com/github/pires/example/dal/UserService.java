package com.github.pires.example.dal;

import java.util.List;

import com.github.pires.example.dal.entities.User;

public interface UserService {

  public void create(User user);

  public List<User> findAll();

  public int count();

}