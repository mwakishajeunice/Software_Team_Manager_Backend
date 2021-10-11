package com.jeunice.softwareteammanager.Dao;

import com.jeunice.softwareteammanager.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
