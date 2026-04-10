package com.taskFlow.task.repository;


import com.taskFlow.task.model.TaskModel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    private List<TaskModel> listaTask = new ArrayList<>();
    private int contadorId = 0;

    public List<TaskModel> obtenerTareas(){ // Llamo todas las tareas
        return listaTask;
    }

    public TaskModel buscarPorTarea(String nombreTarea){ // Busco las tareas por su nombre
        for (TaskModel t : listaTask){
            if (t.getNombreTarea() != null && t.getNombreTarea().equals(nombreTarea)) return t;
        }
        return null;
    }
    public TaskModel buscarPorId(int id){ // Busco las tareas por su ID
        for (TaskModel t : listaTask){
            if (t.getId() == id) return t;
        }
        return null;
    }

    public TaskModel guardarTarea(TaskModel task){ // Guardo las tareas
        contadorId++;
        task.setId(contadorId);
        listaTask.add(task);
        return task;
    }

    public TaskModel actualizarTarea(TaskModel task){ // Actualizo la tarea por su ID
        for (int i = 0; i < listaTask.size(); i++){
            if (listaTask.get(i).getId() == task.getId()){
                listaTask.set(i, task);
                return task;
            }
        }
        return null;
    }
   
    public boolean eliminarTarea(int id) {
        for (int i = 0; i < listaTask.size(); i++) {
            if (listaTask.get(i).getId() == id) {
                listaTask.remove(i);
                return true;
            }
        }
        return false;
    }

}
