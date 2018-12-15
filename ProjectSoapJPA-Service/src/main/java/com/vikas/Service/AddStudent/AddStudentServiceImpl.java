package com.vikas.Service.AddStudent;

import com.vikas.Repository.Student.StudentRepo;
import com.vikas.StudentModel.Student;
import com.vikasevolution.projectsoapjpa.GetStudentDetailsRequest;
import com.vikasevolution.projectsoapjpa.GetStudentDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddStudentServiceImpl implements AddStudentService {

    @Autowired
     private StudentRepo studentRepo;

    public GetStudentDetailsResponse addStudent(GetStudentDetailsRequest request) {
        GetStudentDetailsResponse response = new GetStudentDetailsResponse();
        Student student = new Student();
        student.setName(request.getName());
        student.setAge(request.getAge());
        response.setMessage("Saved One Record");
        studentRepo.save(student);
        return response;

    }
}
