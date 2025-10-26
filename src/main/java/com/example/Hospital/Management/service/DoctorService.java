package com.example.Hospital.Management.service;


import com.example.Hospital.Management.models.Bill;
import com.example.Hospital.Management.models.Doctor;
import com.example.Hospital.Management.models.Patient;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors(){
        try{
            System.out.println("into service layer");
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Bill getDoctorById(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id){
        try{

        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());

        }
    }

    public Patient updateDoctor(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }
}
