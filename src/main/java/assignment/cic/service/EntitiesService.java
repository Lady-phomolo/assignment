/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.service;

import assignment.cic.entities.Entities;
import java.util.List;

/**
 *
 * @author phomolo
 */
public interface EntitiesService {

    List<Entities> entityList();

    Entities findOne(Long id);

    Entities addEntity(Entities entity);

  ;
}
