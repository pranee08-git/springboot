package com.example.demo;



import org.springframework.stereotype.Service;




@Service
public class StudentService 
{
    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }

    public Student saveStudent(Student student)
    {
        return studentRepo.save(student);
    }
    public Student get(int Id)
    {
        return studentRepo.findById(Id).orElse(null);
    }

}
