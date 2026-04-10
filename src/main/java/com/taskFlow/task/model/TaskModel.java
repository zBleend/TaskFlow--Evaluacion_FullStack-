package com.taskFlow.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TaskModel {

    private int id;
    private String nombreTarea;
    private String descripcion;
    private boolean estadoDeTarea;
    private String prioridad;
    private String responsable;
    private int fechasAsociadas;

}
