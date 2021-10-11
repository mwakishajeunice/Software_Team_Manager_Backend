package com.jeunice.softwareteammanager.Controllers;

import com.jeunice.softwareteammanager.Models.Roles;
import com.jeunice.softwareteammanager.Services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    @GetMapping("/all")
    public ResponseEntity<List<Roles>> getAllRoles(){
        return  new ResponseEntity<>(rolesService.getAllRoles(), HttpStatus.OK);
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<Roles> getRoleById(@PathVariable("roleId") Long roleId){
        return new ResponseEntity<>(rolesService.getRolesById(roleId), HttpStatus.OK);
    }

    //    Method handler for adding new Role
    @PostMapping("/NewRole")
    public ResponseEntity<Roles> addNewRole(@RequestBody Roles roles){
        return new ResponseEntity<>(rolesService.saveRoles(roles), HttpStatus.CREATED);
    }

    @PutMapping("/edit/{roleId}")
    public  ResponseEntity updateRoles(@PathVariable("roleId") long roleId, @RequestBody @Validated Roles roles){
        rolesService.updateRoles(roleId, roles);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{roleId}")
    public void deleteRoles(@PathVariable("roleId") Long roleId){
        rolesService.deleteRoles(roleId);
    }
}
