package com.example.Hospital.Management.controller;


import com.example.Hospital.Management.models.Appointment;
import com.example.Hospital.Management.models.Patient;
import com.example.Hospital.Management.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {


    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println("Creating appointment");
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointments(){
        System.out.println("Fetching the all appointments");
        return appointmentService.getAllAppointments();
    }


    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Fetching Appointment by ID");
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
//        System.out.println("Records delete for Appointment number :"+id);
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){
//        System.out.println("Records updated for Appointment number :"+id);
        appointmentService.updateAppointment(id);
    }
}
