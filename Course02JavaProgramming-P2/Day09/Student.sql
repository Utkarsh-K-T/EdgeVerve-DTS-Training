show databases;
use student;
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    gender CHAR(1) NOT NULL,
    course VARCHAR(100) NOT NULL
);
SELECT * FROM students;