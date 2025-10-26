package com.example.Hospital.Management.service;


import com.example.Hospital.Management.models.Bill;
import com.example.Hospital.Management.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills(){
        try{
            System.out.println("into service layer");
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id){
        try{

        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());

        }
    }

    public Patient updateBill(Long id){
        try{
            return null;
        }catch (Exception e){
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }
}
