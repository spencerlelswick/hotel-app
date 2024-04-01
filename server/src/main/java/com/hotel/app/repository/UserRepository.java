package com.hotel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.model.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Integer> {

}
