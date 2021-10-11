package com.jeunice.softwareteammanager.Controllers;

import com.jeunice.softwareteammanager.Models.Developers;
import com.jeunice.softwareteammanager.Services.DevelopersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
public class DevelopersController {

    @Autowired
    private DevelopersService developersService;

    @GetMapping("/all")
    public ResponseEntity<List<Developers>> getAllDevelopers(){
        return  new ResponseEntity<>(developersService.getAllDevelopers(), HttpStatus.OK);
    }

    @GetMapping("/{developerId}")
    public ResponseEntity<Developers> getDeveloperById(@PathVariable("developerId") Long developerId){
      return new ResponseEntity<>(developersService.getDevelopersById(developerId), HttpStatus.OK);
    }

//    Method handler for adding new Developer
    @PostMapping("/NewDeveloper")
    public ResponseEntity<Developers> addNewDeveloper(@RequestBody Developers developers){
        return new ResponseEntity<>(developersService.saveDevelopers(developers), HttpStatus.CREATED);
    }

    @PutMapping("/edit{developerId}")
    public  ResponseEntity updateDevelopers(@PathVariable("developerId") long developerId, @RequestBody @Validated Developers developers){
        developersService.updateDevelopers(developerId, developers);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{developerId}")
    public void deleteDeveloper(@PathVariable("developerId") Long developerId){
        developersService.deleteDeveloper(developerId);
    }


}
