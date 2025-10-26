package com.example.Hospital.Management.service;

import com.example.Hospital.Management.models.Patient;
import org.hibernate.jdbc.Expectation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients(){
        try{
            System.out.println("into service layer");
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id){
        try{

        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());

        }
    }

    public Patient updatePatient(Long id){
        try{
          return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }


}
