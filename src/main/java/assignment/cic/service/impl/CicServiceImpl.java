/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.service.impl;

import assignment.cic.entities.Cic;
import assignment.cic.repository.CicRepository;
import assignment.cic.repository.EntitiesRepository;
import assignment.cic.service.CicService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phomolo
 */
@Service
public class CicServiceImpl implements CicService {

    @Autowired
    private CicRepository cicRepository;
    
     @Autowired
    private EntitiesRepository entitiesRepository;
    

    @Override
    public List<Cic> cicList() {
        List<Cic> cic = new ArrayList<>();
        cicRepository.findAll()
                .forEach(cic::add);

        return cic;
    }

    @Override
    public Cic addCic(Cic cic) {
        return cicRepository.save(cic);
    }

    @Override
    public Cic findOne(Long id) {
        return cicRepository.findById(id).get();
    }
}
