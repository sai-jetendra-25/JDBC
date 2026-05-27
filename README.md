# ☕ Java Database Practice

A hands-on repository covering database connectivity in Java using **JDBC** and **Hibernate ORM**.

---

## 📁 Project Structure

```
Java-DataBase-/
├── JDBC/               # Raw JDBC CRUD operations
└── Hibernate/          # Hibernate ORM CRUD operations
```

---

## 📌 JDBC

Direct database connectivity using Java's built-in `java.sql` package.

### Topics Covered
- JDBC Driver setup
- DriverManager & Connection
- PreparedStatement
- CRUD Operations (Create, Read, Update, Delete)

### Tech Stack
- Java 17
- MySQL
- MySQL Connector/J

---

## 📌 Hibernate

Object-Relational Mapping (ORM) using Hibernate framework.

### Topics Covered
- Hibernate Configuration (`hibernate.cfg.xml`)
- Entity Mapping (`@Entity`, `@Table`, `@Id`, `@Column`)
- SessionFactory & Session
- Transaction Management
- CRUD Operations using Hibernate

### Tech Stack
- Java 17
- Hibernate ORM 6.3.1
- MySQL
- Maven

---

## ⚙️ Setup Instructions

### Prerequisites
- Java 17+
- MySQL Server
- IntelliJ IDEA
- Maven

### Steps
1. Clone the repository
   ```bash
   git clone https://github.com/sai-jetendra-25/Java-DataBase-.git
   ```
2. Create the database in MySQL
   ```sql
   CREATE DATABASE hibernatedb;
   ```
3. Update `hibernate.cfg.xml` with your MySQL credentials
4. Run any class with a `main()` method

---

## 🗃️ Hibernate CRUD Classes

| Class | Operation |
|---|---|
| `Main.java` | Create (INSERT) |
| `FetchStudent.java` | Read (SELECT) |
| `UpdateStudent.java` | Update (UPDATE) |
| `DeleteStudent.java` | Delete (DELETE) |

---

## 👨‍💻 Author

**Sai Jetendra**  
[GitHub](https://github.com/sai-jetendra-25) • [LinkedIn](https://www.linkedin.com/in/sai-jetendra) • [LeetCode](https://leetcode.com/u/Saijetendra_25/)
