package com.Educationlogin.Api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Educationlogin.Api.Entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

}