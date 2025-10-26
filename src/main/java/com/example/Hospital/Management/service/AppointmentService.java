package com.example.Hospital.Management.service;


import com.example.Hospital.Management.models.Appointment;
import com.example.Hospital.Management.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments(){
        try{
            System.out.println("into service layer");
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id){
        try{

        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());

        }
    }

    public Patient updateAppointment(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }
}
