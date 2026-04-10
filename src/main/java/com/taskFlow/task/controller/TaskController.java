package com.taskFlow.task.controller;

import com.taskFlow.task.dto.CreateTaskRequest;
import com.taskFlow.task.dto.UpdateTaskRequest;
import com.taskFlow.task.model.TaskModel;
import com.taskFlow.task.service.TaskService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/tareas")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<TaskModel> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TaskModel getById(@PathVariable int id){
        return service.getById(id);
    }

    @GetMapping("/tarea-especifica/{nombreTarea}")
    public TaskModel getByNombreTarea(@PathVariable String nombreTarea){
        return service.getByNombreTarea(nombreTarea);
    }

    @PostMapping
    public TaskModel create(@Valid @RequestBody CreateTaskRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public TaskModel update(@PathVariable int id, @Valid @RequestBody UpdateTaskRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }

}
