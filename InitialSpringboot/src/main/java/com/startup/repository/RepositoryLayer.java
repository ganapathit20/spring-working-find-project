package com.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.model.UserDetails;

@Repository
interface RepositoryLayer extends JpaRepository<UserDetails, Long>{

}
