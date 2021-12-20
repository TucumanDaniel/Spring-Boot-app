package com.sistema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sistema.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
