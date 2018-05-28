/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.controller;

import assignment.cic.entities.Entities;
import assignment.cic.service.EntitiesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author phomolo
 */


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class EntitiesController {
    
     
     @Autowired
    private EntitiesService entitiesService;
   
    
    @RequestMapping("/list")
    public List<Entities>entityList(){
        return entitiesService.entityList();
    }
    
    
    @RequestMapping(method=RequestMethod.POST,value="/add")
    public Entities addEntity(@RequestBody Entities entities ){
        return entitiesService.addEntity(entities);
    }
    
    @RequestMapping("/list/{id}")
    public Entities findOne(@PathVariable  Long id ){
        return entitiesService.findOne(id);
    }
}
