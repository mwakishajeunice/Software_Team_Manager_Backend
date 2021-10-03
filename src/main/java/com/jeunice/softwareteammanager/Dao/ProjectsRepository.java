package com.jeunice.softwareteammanager.Dao;

import com.jeunice.softwareteammanager.Models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Long>{

}
