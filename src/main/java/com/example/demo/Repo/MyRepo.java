package com.example.demo.Repo;





import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Employee;



 public interface MyRepo extends JpaRepository<Employee, Long>
{

}
