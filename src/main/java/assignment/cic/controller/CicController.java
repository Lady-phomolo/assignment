/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.controller;

import assignment.cic.entities.Cic;
import assignment.cic.service.CicService;
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
@RequestMapping("/cic")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class CicController{
    
    @Autowired
    private CicService cicService ;
   
    
    @RequestMapping("/list")
    public List<Cic>cicList(){
        return cicService.cicList();
    }
    
    
    @RequestMapping(method=RequestMethod.POST,value="/add")
    public Cic addCic(@RequestBody Cic cic ){
        return cicService.addCic(cic);
    }
    
    @RequestMapping("/list/{id}")
    public Cic findOne(@PathVariable  Long id ){
        return cicService.findOne(id);
    }
}
