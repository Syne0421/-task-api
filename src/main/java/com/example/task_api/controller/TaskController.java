package com.example.task_api.controller;

// Taskエンティティ（DBのテーブルに対応するクラス）を使用
import com.example.task_api.entity.Task;
// DB操作を行うRepository
import com.example.task_api.repository.TaskRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * タスクに関するAPIを提供するコントローラー
 * URL: /tasks に対するリクエストを処理する
 */
@RestController // このクラスはREST APIとして動作する（JSONを返す）
@RequestMapping("/tasks") // このクラスの共通URLパス
public class TaskController {

    // DB操作を行うためのRepository
    private final TaskRepository repository;

    /**
     * コンストラクタ
     * Springが自動でTaskRepositoryを注入してくれる（DI）
     */
    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    /**
     * タスク一覧取得API
     * GET /tasks
     *
     * DBに保存されている全タスクを取得して返す
     */
    @GetMapping
    public List<Task> getTasks() {
        return repository.findAll(); // 全件取得
    }

    /**
     * タスク作成API
     * POST /tasks
     *
     * リクエストボディのJSONをTaskに変換して保存する
     */
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        // 新規作成時の初期ステータスを設定
        task.setStatus("TODO");

        // DBに保存して、その結果を返す
        return repository.save(task);
    }
}