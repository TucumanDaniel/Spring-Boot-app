package com.sistema.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sistema.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
