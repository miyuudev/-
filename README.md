# 社員管理システム　（コンソールアプリ）
このプロジェクトは、Javaを使って作成された。社員管理システムです。コンソール上で社員の登録や一覧表示ができます！

## 機能
  -　社員を登録する

  -　社員一覧を表示する

  -　IDで社員を検索する

  -　社員を削除する

## 使用技術
  -　Java
  
  -　IntelliJ　IDEA

## 学んだ事
1. カプセル化　(Encapsulation)
   今回のEmployeeクラスでは、フィールド(id-name-salary)　をprivateに設定し、外部から直接アクセスできないようにしました。
   
その代わりに：
   
 ‐　getId()
   
 ‐　getName()
   
 ‐　getSalary()
   
のようなgetterメソッドを通して値を取得します。
2.　サービスレイヤー(Service Layer)
   EmployeeServiceは、ビジネスロジックを担当しています。
   
   例えば：
   
   ‐ addEmployee()
   
   ‐ findById()
   
   ‐ removeEmployee()

<img width="390" height="178" alt="image" src="https://github.com/user-attachments/assets/b9cb6902-cd94-4035-b38e-26f2090aacc7" />


   
