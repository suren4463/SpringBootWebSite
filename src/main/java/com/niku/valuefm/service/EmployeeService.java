package com.niku.valuefm.service;

import com.niku.valuefm.domain.Employee;
import com.niku.valuefm.domain.EmployeeModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sun.misc.Request;

import java.util.List;

@Service
public class EmployeeService {
    private static final String EMPLOYEES = "/emplyees";
    private static final String SLASH = "/";

    @Value("${vfm.service.url}")
    private String employeeServiceUrl;// most important shows where we connect to services

    private final RestTemplate restTemplate= new RestTemplate();

    public List<Employee> getAllGuest(){
        String url= employeeServiceUrl + EMPLOYEES;
        HttpEntity<String> request = new HttpEntity<>(null,null);
        return this.restTemplate.exchange(url, HttpMethod.GET, request, new ParameterizedTypeReference<List<Employee>>(){}).getBody();

    }
    public Employee addEmployee(EmployeeModel model){
        String url = employeeServiceUrl+EMPLOYEES;
        HttpEntity<EmployeeModel> request = new HttpEntity<>(model,null);
        return this.restTemplate.exchange(url,HttpMethod.POST,request,Employee.class).getBody();

    }
    public Employee getEmployee(Long id){
        String url = employeeServiceUrl+EMPLOYEES+SLASH+id;
        HttpEntity<String> request = new HttpEntity<>(null,null);
        return this.restTemplate.exchange(url, HttpMethod.GET, request, Employee.class).getBody();


    }

    public Employee updateEmployee(Long id, EmployeeModel model){
        System.out.println(model);
        String url = employeeServiceUrl+EMPLOYEES+SLASH+id;
        HttpEntity<EmployeeModel> request = new HttpEntity<>(model,null);
        return this.restTemplate.exchange(url,HttpMethod.PUT,request,Employee.class).getBody();

    }

}

