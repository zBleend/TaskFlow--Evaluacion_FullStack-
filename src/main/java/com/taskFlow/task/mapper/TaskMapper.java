package com.taskFlow.task.mapper;

import com.taskFlow.task.dto.CreateTaskRequest;
import com.taskFlow.task.dto.UpdateTaskRequest;
import com.taskFlow.task.model.TaskModel;

import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskModel toModel(CreateTaskRequest request){
        return new TaskModel(
            0,
            request.nombreTarea(),
            request.descripcion(),
            request.estadoDeTarea(),
            request.prioridad(),
            request.responsable(),
            request.fechasAsociadas()
        );
    }
    public TaskModel toModel(int id, UpdateTaskRequest request){
        return new TaskModel(
            id,
            request.nombreTarea(),
            request.descripcion(),
            request.estadoDeTarea(),
            request.prioridad(),
            request.responsable(),
            request.fechasAsociadas()
        );
    }


}
