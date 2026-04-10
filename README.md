Evaluacion 1 de Fullstack

Basicamente una API dedicada a la asignacion de tareas
Uno puede colocar un nombre a la tarea (Tambien se asigna por ID)
Y tambien le puede poner una descripcion con el nombre del asignado a la tarea
Ademas el estado de la tarea es un Boolean donde se asigna si la tarea finalizó o aun está en marcha.
Tiene para asignale una fecha y darle una prioridad

Tiene ademas varios metodos para utilizar esta API

- POST para crear tareas.
- PUT (/{id}) para modificar tareas.
- GET para llamar todas las tareas.
- GET (/{id}) para llamar la tarea por ID.
- GET (/tarea-especifica/{nombreTarea}) para llamar la tarea por nombre.
- DELETE (/{id}) para eliminar la tarea.
