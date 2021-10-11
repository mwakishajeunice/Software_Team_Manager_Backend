package com.jeunice.softwareteammanager.Controllers;

import com.jeunice.softwareteammanager.Models.Tasks;
import com.jeunice.softwareteammanager.Models.Tasks;
import com.jeunice.softwareteammanager.Services.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TasksController {

    @Autowired
    private TasksService tasksService;

    @GetMapping("/all")
    public ResponseEntity<List<Tasks>> getAllTasks(){
        return new ResponseEntity<>(tasksService.getAllTasks(), HttpStatus.OK);
    }

    @GetMapping("/{taskId")
    public ResponseEntity<Tasks> getTasksById(@PathVariable("taskId") Long taskId){
        return new ResponseEntity<>(tasksService.getTaskById(taskId), HttpStatus.OK);
    }

    @PostMapping("/NewProject")
    public ResponseEntity<Tasks> addNewProject(@RequestBody @Validated Tasks tasks){
        return new ResponseEntity<>(tasksService.saveTask(tasks), HttpStatus.CREATED);
    }

    @PutMapping("/edit{taskId}")
    public  ResponseEntity updateTasks(@PathVariable("taskId") long taskId, @RequestBody @Validated Tasks tasks){
        tasksService.updateTasks(taskId, tasks);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{taskId}")
    public void deleteTasks(@PathVariable("taskId") Long taskId){
        tasksService.deleteTask(taskId);
    }
    
}
