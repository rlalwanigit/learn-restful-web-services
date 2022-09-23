package com.rohitlalwani.rest.webservices.learnrestfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohitlalwani.rest.webservices.learnrestfulwebservices.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
