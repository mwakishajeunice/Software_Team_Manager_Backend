package com.jeunice.softwareteammanager.Dao;

import com.jeunice.softwareteammanager.Models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {

}
