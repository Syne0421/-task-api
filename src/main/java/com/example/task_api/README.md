# Task API

タスク管理を行うREST APIです。

## 使用技術

| カテゴリ | 技術 |
|---|---|
| 言語 | Java 17 |
| フレームワーク | Spring Boot |
| DB | H2 Database |
| ORM | Spring Data JPA / Hibernate |
| ビルドツール | Maven |
| 開発環境 | VSCode |

## API仕様

| Method | URL | 内容 |
|---|---|---|
| GET | /tasks | タスク一覧取得 |
| POST | /tasks | タスク追加 |

## 実装内容

- Controller / Entity / Repository の3層構造
- JSONリクエスト・レスポンス
- HTTPメソッド（GET / POST）によるCRUD操作（一部）

## 起動方法

```bash
./mvnw spring-boot:run
```