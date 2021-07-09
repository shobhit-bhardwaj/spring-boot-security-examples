package com.shobhit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shobhit.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer>  {
}