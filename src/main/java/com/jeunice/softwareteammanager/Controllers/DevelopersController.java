//package com.jeunice.softwareteammanager.Controllers;
//
//import com.jeunice.softwareteammanager.Models.Developers;
//import com.jeunice.softwareteammanager.Services.DevelopersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/developers")
//public class DevelopersController {
//
//    @Autowired
//    private DevelopersService developersService;
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Developers>> getAllDevelopers(){
//        return  new ResponseEntity<>(developersService.getAllDevelopers(), HttpStatus.OK);
//    }
//
//    @GetMapping("/api/{developerId}")
//    public ResponseEntity<Developers> getDeveloperById(@PathVariable("developerId") Long developerId){
//      return new ResponseEntity<>(developersService.getDevelopersById(developerId), HttpStatus.OK);
//    }
//
////    Method handler for adding new Developer
//    @PostMapping("/addNewDeveloper")
//    public ResponseEntity<Developers> addNewDeveloper(RequestBody Developers ){
//        return new ResponseEntity<>(developersService.saveDevelopers(develo), HttpStatus.CREATED);
//    }
//}
