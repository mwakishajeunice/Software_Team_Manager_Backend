package com.jeunice.softwareteammanager.Services;

import com.jeunice.softwareteammanager.Dao.TasksRepository;
import com.jeunice.softwareteammanager.Models.Tasks;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TasksService {

    private TasksRepository tasksRepository;

//    returns a list of all available tasks to the controller
    public List<Tasks> getAllTasks(){
        return tasksRepository.findAll();
    }

//    saves a task
    public Tasks saveTask(Tasks tasks){
        return tasksRepository.save(tasks);
    }

//    Get a Task by taskId
    public Tasks getTaskById(Long taskId){
        return tasksRepository.findById(taskId).orElseThrow(() -> {
            throw new NoSuchElementException("Task not found for id:: " +taskId);
        });
    }

//    Delete task using taskId
    public void deleteTask(Long taskId){

    }
}
