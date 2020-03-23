package com.lfy.mvcdemo.service;

import com.lfy.mvcdemo.bean.Task;

import java.util.List;

public interface TaskService {
    boolean addTask(Task task);

    boolean updateTask(Task task);

    boolean deleteTask(Task task);

    Task searchTaskById(int taskId);

    List<Task> searchAll();
}
