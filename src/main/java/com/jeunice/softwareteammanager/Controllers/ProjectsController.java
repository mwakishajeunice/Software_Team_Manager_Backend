package com.jeunice.softwareteammanager.Controllers;

import com.jeunice.softwareteammanager.Models.Projects;
import com.jeunice.softwareteammanager.Services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @GetMapping("/all")
    public ResponseEntity<List<Projects>> getAllProjects(){
        return new ResponseEntity<>(projectsService.getAllProjects(), HttpStatus.OK);
    }

    @GetMapping("/{projectId")
    public ResponseEntity<Projects> getProjectsById(@PathVariable("projectId") Long projectId){
        return new ResponseEntity<>(projectsService.getProjectsById(projectId), HttpStatus.OK);
    }

    @PostMapping("/NewProject")
    public ResponseEntity<Projects> addNewProject(@RequestBody @Validated Projects projects){
        return new ResponseEntity<>(projectsService.saveProject(projects), HttpStatus.CREATED);
    }

    @PutMapping("/edit{projectId}")
    public  ResponseEntity updateProject(@PathVariable("projectId") long projectId, @RequestBody @Validated Projects project){
        projectsService.updateProjects(projectId, project);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{projectId}")
    public void deleteProject(@PathVariable("projectId") Long projectId){
        projectsService.deleteProject(projectId);
    }

}
