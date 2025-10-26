package com.example.Hospital.Management.controller;


import com.example.Hospital.Management.models.Appointment;
import com.example.Hospital.Management.models.Bill;
import com.example.Hospital.Management.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/bills")
public class BillController {


    @Autowired
    private BillService billService;
    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating bill");
        return billService.createBill(bill);
    }

    @GetMapping
    public List<Bill> getAllBills(){
        System.out.println("Fetching the all Bill");
        return billService.getAllBills();
    }


    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Fetching Bill by ID");
        return billService.getBillById(id);
    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id){
//        System.out.println("Records updated for Bill number :"+id);
        billService.updateBill(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){
//        System.out.println("Records delete for Bill number :"+id);
        billService.deleteBill(id);
    }


}
