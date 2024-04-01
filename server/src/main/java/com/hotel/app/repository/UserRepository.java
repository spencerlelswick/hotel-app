package com.hotel.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.entity.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Integer> {

}
