package com.jeunice.softwareteammanager.Services;

import com.jeunice.softwareteammanager.Dao.AdminRepository;
import com.jeunice.softwareteammanager.Models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    //    This method basically returns a list of all admins to the controller
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    //    Save Method for admins
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    //    Get Admin by Id
    public Admin getAdminById(Long adminId) {
        return adminRepository.findById(adminId).orElseThrow(() -> {
            throw new NoSuchElementException("Admin not found for id:: " + adminId);
        });
    }

    //Update Admin by Id
    public Admin updateAdmin(Long adminId, Admin admin) {
        getAdminById(adminId);
        return saveAdmin(admin);
    }

    //Delete method using adminId
    public void deleteAdmin(Long adminId){
        adminRepository.findById(adminId).ifPresentOrElse(adminRepository::delete, () -> {
            throw new NoSuchElementException("not found");
        });
    }
//    public void deleteAdmin(long adminId) {
//        getAdminById(adminId);
//        adminRepository.deleteById(adminId);
//    }
}

