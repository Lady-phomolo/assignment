/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.service.impl;

import assignment.cic.entities.Entities;
import assignment.cic.repository.EntitiesRepository;
import assignment.cic.service.EntitiesService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phomolo
 */
@Service
public class EntitiesServiceImpl implements EntitiesService{

       @Autowired
    private EntitiesRepository entitiesRepository;
    
 
 
    @Override
    public List<Entities> entityList() {
     List<Entities> entities = new ArrayList<>();
         entitiesRepository.findAll()
         .forEach(entities::add);
         
         return entities;
    }

   

    @Override
    public Entities addEntity(Entities entity) {
       return entitiesRepository.save(entity);
    }

    @Override
    public Entities findOne(Long id) {
     return entitiesRepository.findById(id).get();
    }

   
  
}


