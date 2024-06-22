package com.student.model;

public class Student 
{
    private int id;
    private int totalMarks;
    private String name;
    private String course;

    public Student(int id, String name, String course, int totalMarks) 
    {
        this.id = id;
        this.name = name;
        this.course = course;
        this.totalMarks = totalMarks;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getTotalMarks() 
    {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) 
    {
        this.totalMarks = totalMarks;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCourse() 
    {
        return course;
    }

    public void setCourse(String course) 
    {
        this.course = course;
    }

    @Override
    public String toString() 
    {
        return "Student [id=" + id + ", totalMarks=" + totalMarks + ", name=" + name + ", course=" + course + "]";
    }
}
