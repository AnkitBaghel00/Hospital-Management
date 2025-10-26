package com.example.Hospital.Management.controller;

import com.example.Hospital.Management.models.Bill;
import com.example.Hospital.Management.models.Doctor;
import com.example.Hospital.Management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;


@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {


    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating Doctor");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching the all doctor");
        return doctorService.getAllDoctors();
    }


    @GetMapping("/{id}")
    public Bill getDoctorById(@PathVariable Long id) {
        System.out.println("Fetching Doctor by ID");
        return doctorService.getDoctorById(id);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id){
//        System.out.println("Records updated for Doctor number :"+id);
        doctorService.updateDoctor(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){
//        System.out.println("Records Doctor for Bill number :"+id);
        doctorService.deleteDoctor(id);
    }
}
