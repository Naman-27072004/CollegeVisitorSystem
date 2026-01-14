# College Visitor Entry Management System

A Java-based desktop application developed to digitize and manage visitor entry and exit in a college campus.  
The system replaces the traditional manual visitor register with a secure, efficient, and database-driven solution.

---

## 📌 Project Overview

The **College Visitor Entry Management System** allows administrators to:

- Record visitor entry details
- Track visitor exit time
- View complete visitor history
- Generate a PDF-based visitor pass
- Improve campus security and record management

The application is built using **Core Java**, **Swing for GUI**, and **JDBC for database connectivity**.

---

## 🛠️ Technology Stack

| Layer                 | Technology                 |
| --------------------- | -------------------------- |
| Programming Language  | Java (JDK 8)               |
| GUI                   | Java Swing                 |
| Database              | MySQL                      |
| Database Connectivity | JDBC                       |
| Architecture          | Two-Tier Architecture      |
| File Handling         | Java I/O                   |
| Reporting             | PDF generation using iText |
| IDE                   | VS Code                    |

---

## 🧱 System Architecture

Java Swing GUI
|
JDBC
|
MySQL Database

---

## 📂 Project Structure

CollegeVisitorSystem/
├── src/
│ ├── ui/ → Swing UI screens
│ ├── dao/ → Database operations
│ ├── model/ → Entity classes
│ ├── util/ → Database connection
│ ├── report/ → PDF generation
│ └── main/ → Application entry point
├── lib/ → External JAR files
├── .vscode/ → VS Code configuration
└── README.md

---

## ⚙️ Features

- Admin login authentication  
- Visitor entry management  
- Visitor exit tracking  
- Visitor records displayed in tabular form  
- PDF visitor pass generation  
- Secure database access using PreparedStatement  

---

## 🗄️ Database Design

### Admin Table

```sql
CREATE TABLE admin (
    admin_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);

### Visitor Table
```

CREATE TABLE visitor (
    visitor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    mobile VARCHAR(15),
    purpose VARCHAR(100),
    host VARCHAR(100),
    entry_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    exit_time TIMESTAMP
);

## ▶️ How to Run the Project

### Prerequisites

- Java JDK 8 installed  
- MySQL Server running  
- VS Code with Java Extension Pack  

### Steps

1. Clone the repository

   ```bash
   git clone https://github.com/Naman-27072004/CollegeVisitorSystem.git

Open the project folder in VS Code  

Add MySQL JDBC and iText JARs inside the `lib/` folder  

Update database credentials in:  

src/util/DBConnection.java

Run the application:  

src/main/MainApp.java

---

## 🔐 Default Login Credentials

Username: admin
Password: admin123

---

## 📄 Output

- Visitor records stored in MySQL database  
- Visitor pass generated as `VisitorPass.pdf` in the project directory  

---

## 🎓 Academic Relevance

- Covers OOP concepts  
- Implements Exception Handling  
- Uses JDBC  
- Demonstrates GUI programming with Swing  
- Suitable for BCA / MCA Java Programming projects  

---

## 🚀 Future Enhancements

- QR code–based visitor passes  
- Host notification via email/SMS  
- Role-based access control  
- Web-based version  
- Analytics dashboard  

---

## 👨‍💻 Author

**Naman Gupta**  
Masters of Computer Applications (MCA)  
Java Programming Project  

---

## 📜 License

This project is licensed under the **MIT License**.
