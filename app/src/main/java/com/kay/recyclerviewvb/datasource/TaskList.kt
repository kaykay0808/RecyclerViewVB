package com.kay.recyclerviewvb.datasource

// this is the datasource which can be roomData or api.

object TaskList {
    val taskList = listOf<TaskModel>(
        TaskModel("Workout", timeStamp = "7:00"),
        TaskModel("Eat Breakfast", timeStamp = "8:00"),
        TaskModel("Attend a Meeting", timeStamp = "9:00"),
        TaskModel("Study", timeStamp = "12:00"),
        TaskModel("Eat Lunch", timeStamp = "13:00"),
        TaskModel("Do Something Random", timeStamp = "16:00"),
        TaskModel("Eat Dinner", timeStamp = "18:00"),
        TaskModel("Watch A Movie", timeStamp = "19:00"),
        TaskModel("Go To Bed", timeStamp = "22:00"),
    )
}
