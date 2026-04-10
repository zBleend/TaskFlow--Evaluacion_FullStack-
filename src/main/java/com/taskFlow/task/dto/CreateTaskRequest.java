package com.taskFlow.task.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record CreateTaskRequest(

    @NotBlank(message = "No puedes dejar el nombre libre")
    String nombreTarea, 
    
    @NotBlank(message = "No puedes dejar la descripcion vacia")
    String descripcion,

    boolean estadoDeTarea,

    @NotBlank(message = "Tienes que asignar una prioridad a la tarea")
    String prioridad,

    @NotBlank(message = "Tienes que dejar a alguien responsable de la tarea")
    String responsable,

    @PositiveOrZero(message = "Tienes que dejar una fecha valida")
    int fechasAsociadas
){}
