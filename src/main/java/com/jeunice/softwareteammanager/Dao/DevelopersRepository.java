package com.jeunice.softwareteammanager.Dao;

import com.jeunice.softwareteammanager.Models.Developers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopersRepository extends JpaRepository<Developers, Long> {

}
