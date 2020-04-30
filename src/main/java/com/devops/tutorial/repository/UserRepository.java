package com.devops.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.tutorial.model.User;

/**
 * The interface User repository.
 *
 * @author jccalderon
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
