package com.vikas.Service.AddStudent;

import com.vikasevolution.projectsoapjpa.GetStudentDetailsRequest;
import com.vikasevolution.projectsoapjpa.GetStudentDetailsResponse;

public interface AddStudentService {

    GetStudentDetailsResponse addStudent(GetStudentDetailsRequest request);
}
