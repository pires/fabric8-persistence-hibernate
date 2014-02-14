package com.github.pires.example.dal.impl.daos;

import com.github.pires.example.dal.impl.entities.UserEntity;

/**
 * DAO for {@link UserEntity}.
 */
public class UserEntityDao extends AbstractDao<UserEntity> {

  public UserEntityDao() {
    super(UserEntity.class);
  }

}