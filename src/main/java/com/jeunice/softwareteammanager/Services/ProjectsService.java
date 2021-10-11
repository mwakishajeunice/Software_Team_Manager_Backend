package com.jeunice.softwareteammanager.Services;

import com.jeunice.softwareteammanager.Dao.ProjectsRepository;
import com.jeunice.softwareteammanager.Models.Projects;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectsService {

    private ProjectsRepository projectsRepository;

//    Returns a list of all available projects to the contoller
    public List<Projects> getAllProjects(){
        return projectsRepository.findAll();
    }

//    Save Method for Projects
    public Projects saveProject(Projects projects){
        return projectsRepository.save(projects);
    }

//    Get Projects by projectId
    public Projects getProjectsById(Long projectId){
        return projectsRepository.findById(projectId).orElseThrow(() -> {
            throw new NoSuchElementException("Project not found for id:: " + projectId);
        });
    }
//    update projects retrived by id
    public Projects updateProjects(Long projectId, Projects projects){
        getProjectsById(projectId);
        return saveProject(projects);
    }

//    Delete Method using projectId
    public void deleteProject(Long projectId){
        projectsRepository.findById(projectId).ifPresentOrElse(projectsRepository::delete, () ->{
            throw new NoSuchElementException("not found");
        });

    }

}
