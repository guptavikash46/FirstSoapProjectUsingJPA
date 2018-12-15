package com.vikas.SoapJPA.Main;

import com.vikas.Service.AddStudent.AddStudentService;
import com.vikas.StudentModel.Student;
import com.vikasevolution.projectsoapjpa.GetStudentDetailsRequest;
import com.vikasevolution.projectsoapjpa.GetStudentDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class DbServiceEndpoint {

    @Autowired
 private AddStudentService addStudentService;

@PayloadRoot(namespace = "http://www.VikasEvolution.com/ProjectSoapJPA", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
public GetStudentDetailsResponse processDetails(@RequestPayload GetStudentDetailsRequest request){

   return addStudentService.addStudent(request);
}



}



