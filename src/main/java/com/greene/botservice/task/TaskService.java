package com.greene.botservice.task;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(long id) {
        return repository.findById(id)
                .orElseThrow(TaskNotFoundException::new);
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }

    public void deleteTaskById(long id) {
        repository.deleteById(id);
    }
}
