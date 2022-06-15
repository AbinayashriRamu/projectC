package com.chainsys.application.doctor;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorService {
	@Autowired
   private DoctorRepository repo;
//   @Bean
//   public void setRepo(DoctorRepository repo) {
//	   this.repo=repo;
//   }
   @GetMapping("/getDoctor")
   public Doctor getDoctor(int id) {
	   return repo.findById(id);
   }
}
