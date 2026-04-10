package com.taskFlow.task.service;

import com.taskFlow.task.dto.CreateTaskRequest;
import com.taskFlow.task.dto.UpdateTaskRequest;
import com.taskFlow.task.model.TaskModel;
import com.taskFlow.task.mapper.*;
import com.taskFlow.task.repository.TaskRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    @Autowired
    private TaskMapper mapper;

    public List<TaskModel> getAll(){
        return repository.obtenerTareas();
    }

    public TaskModel getById(int id){
        return repository.buscarPorId(id);
    }

    public TaskModel getByNombreTarea(String nombreTarea){
        return repository.buscarPorTarea(nombreTarea);
    }

    public TaskModel create(CreateTaskRequest request){
        TaskModel task = mapper.toModel(request);
        return repository.guardarTarea(task);
    }

    public TaskModel update(int id, UpdateTaskRequest request){
        TaskModel task = mapper.toModel(id, request);
        return repository.actualizarTarea(task);
    }

    public String delete(int id){
        boolean eliminado = repository.eliminarTarea(id);
        return eliminado ? "Tarea eliminada" : "Tarea no encontrada";
    }
}
