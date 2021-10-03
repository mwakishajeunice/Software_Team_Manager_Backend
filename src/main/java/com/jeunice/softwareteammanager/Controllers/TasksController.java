package com.jeunice.softwareteammanager.Controllers;

import com.jeunice.softwareteammanager.Models.Tasks;
import com.jeunice.softwareteammanager.Services.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private TasksService tasksService;

//    A method handler to display a list of all the tasks in index.html(home-page)
    @GetMapping("/all")
    public ResponseEntity<List<Tasks>> getAllTasks(){
        return new ResponseEntity<>(tasksService.getAllTasks(), HttpStatus.OK);
    }
}
