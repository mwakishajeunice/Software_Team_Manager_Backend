package com.jeunice.softwareteammanager.Controllers;

import com.jeunice.softwareteammanager.Models.Admin;
import com.jeunice.softwareteammanager.Models.Admin;
import com.jeunice.softwareteammanager.Models.Tasks;
import com.jeunice.softwareteammanager.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController{
    
    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdmins(){
        return  new ResponseEntity<>(adminService.getAllAdmins(), HttpStatus.OK);
    }

    @GetMapping("/{adminId}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("adminId") Long adminId){
        return new ResponseEntity<>(adminService.getAdminById(adminId), HttpStatus.OK);
    }

    //    Method handler for adding new Admin
    @PostMapping("/NewAdmin")
    public ResponseEntity<Admin> addNewAdmin(@RequestBody Admin admin){
        return new ResponseEntity<>(adminService.saveAdmin(admin), HttpStatus.CREATED);
    }

    @PutMapping("/edit{adminId}")
    public  ResponseEntity updateAdmin(@PathVariable("adminId") long adminId, @RequestBody @Validated Admin admin){
        adminService.updateAdmin(adminId, admin);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{adminId}")
    public void deleteAdmin(@PathVariable("adminId") Long adminId){
        adminService.deleteAdmin(adminId);
    }
    
}
