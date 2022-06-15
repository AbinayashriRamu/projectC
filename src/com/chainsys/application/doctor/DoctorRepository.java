package com.chainsys.application.doctor;
import org.springframework.data.repository.CrudRepository;
public interface DoctorRepository extends CrudRepository<Doctor,Integer> //only the abstrace are available in interfaces
{
Doctor findById(int id);
}
