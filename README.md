# SampleJDBC 🗄️

A beginner-friendly Java JDBC project demonstrating how to connect Java with MySQL and perform all CRUD database operations.

---
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## 📁 Project Structure

```
SampleJDBC/
├── .vscode/
│   └── settings.json          # VS Code Java configuration
├── bin/                       # Compiled class files
├── lib/
│   └── mysql-connector-j-9.7.0.jar  # MySQL JDBC Driver
├── src/com/codewithsai/
│   ├── App1.java              # JDBC Connection test
│   ├── InsertApp.java         # Insert data
│   ├── SelectApp.java         # Read/Select data
│   ├── UpdateApp.java         # Update data
│   └── DeleteApp.java         # Delete data
├── .gitignore
└── README.md
```

---

## 🛠️ Technologies Used

- Java JDK 21
- MySQL 8.0
- MySQL Connector/J 9.7.0 (JDBC Driver)
- VS Code + Extension Pack for Java

---

## ⚙️ Setup & Configuration

### Prerequisites
- Java JDK installed
- MySQL installed and running
- VS Code with **Extension Pack for Java**
- MySQL Connector/ JAR downloaded



###  Add JDBC JAR
Place `mysql-connector-j-9.7.0.jar` inside the `lib/` folder.

###  Configure VS Code
Make sure `.vscode/settings.json` contains:
```json
{
    "java.project.sourcePaths": ["src", "lib"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```

###  Setup MySQL Database
Run the following SQL in MySQL Workbench:
```sql
CREATE DATABASE JDBCLearning;

USE JDBCLearning;

CREATE TABLE Student (
    Id    INT          NOT NULL,
    Sname VARCHAR(50)  NOT NULL,
    Age   INT          NOT NULL,
    city  VARCHAR(50)  NOT NULL
);
```

### . Update Credentials
In each Java file, update the connection details:
```java
String url      = "jdbc:mysql://localhost:3306/JDBCLearning";
String user     = "root";
String password = "yourpassword";
```
---

## 🚀 CRUD Operations

### ✅ Connect to MySQL (`App1.java`)
```java
Connection con = DriverManager.getConnection(url, user, password);
System.out.println("Connected successfully!");
con.close();
```
---

### 1.Insert Data (`InsertApp.java`)

**Result in MySQL Workbench:**
| Id | Sname | Age | City      |
|----|-------|-----|-----------|
| 1  | sai   | 20  | Hyderabad |
| 2  | ram   | 20  | Hyderabad |
| 3  | kirsh | 19  | Hyderabad |
| 4  | Ravi  | 17  | Hyderabad |

---

### 2.Delete Data (`DeleteApp.java`)

**Result after Delete (Id=2 removed):**

| Id | Sname | Age | City      |
|----|-------|-----|-----------|
| 1  | sai   | 20  | Hyderabad |
| 3  | kirsh | 19  | Hyderabad |
| 4  | Ravi  | 17  | Hyderabad |

---

### 3.Update Data (`UpdateApp.java`)

Update studnet set id=2 WHERE id=3
Result after Update (SET id=2,WHERE id=3)

**Result in MySQL Workbench:**
---

| Id | Sname | Age | City      |
|----|-------|-----|-----------|
| 1  | sai   | 20  | Hyderabad |
| 2  | kirsh | 19  | Hyderabad |
| 4  | Ravi  | 17  | Hyderabad |

---

### 4. Select / Read Data (`SelectApp.java`)
```
**Console Output:**
```
Connected successfully!
1 sai 20 Hyderabad
2 kirsh 19 Hyderabad
4 Ravi 17 Hyderabad
```
```


### ✨ Key Features

- 🔌 **MySQL Connection** — Connects Java to MySQL database using JDBC Driver
- ➕ **Insert Data** — Add new records into the database from Java
- 🔍 **Select Data** — Read and display database records in the console
- ✏️ **Update Data** — Modify existing records using Java
- 🗑️ **Delete Data** — Remove records from the database using Java
- ✅ **Connection Validation** — Checks if operations succeed or fail
- 🔒 **Proper Resource Management** — Closes Statement and Connection after every operation
- 📦 **Organized Package Structure** — Code organized under `com.codewithsai` package


**codewithsai**
> Learning JDBC step by step! 🚀

