package com.jeunice.softwareteammanager.Services;

import com.jeunice.softwareteammanager.Dao.RolesRepository;
import com.jeunice.softwareteammanager.Models.Roles;
import com.jeunice.softwareteammanager.Models.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    //    This method basically returns a list of all roles to the controller
    public List<Roles> getAllRoles(){
        return rolesRepository.findAll();
    }

    //    Save Method for roles
    public  Roles saveRoles(Roles roles){
        return rolesRepository.save(roles);
    }

    //    Get Roles by Id
    public Roles getRolesById(Long roleId){
        return rolesRepository.findById(roleId).orElseThrow(() -> {
            throw new NoSuchElementException("Role not found for id:: " + roleId);
        });
    }

    //Update Roles by Id
    public Roles updateRoles(Long roleId, Roles role){
        role.setRoleId(getRolesById(roleId).getRoleId());
        return saveRoles(role);
    }

    //Delete method using roleId
    public void deleteRoles(Long roleId){
        rolesRepository.findById(roleId).ifPresentOrElse(rolesRepository::delete, () -> {
            throw new NoSuchElementException("not found");
        });
    }
}
