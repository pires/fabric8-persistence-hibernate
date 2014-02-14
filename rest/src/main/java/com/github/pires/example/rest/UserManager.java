package com.github.pires.example.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pires.example.dal.UserService;
import com.github.pires.example.dal.entities.User;

@Path("/user")
public class UserManager {

  private UserService userService;

  private static final Logger log = LoggerFactory.getLogger(UserManager.class);

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<User> listUsers() {
    log.info("Listing users...");
    return userService.findAll();
  }

  @GET
  @Path("/count")
  @Produces(MediaType.APPLICATION_JSON)
  public int countUsers() {
    log.info("Counting users...");
    return userService.count();
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public void createUser(final User user) {
    log.info("Creating user with name {}...", user.getName());
    userService.create(user);
  }

  public UserService getUserService() {
    return userService;
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

}