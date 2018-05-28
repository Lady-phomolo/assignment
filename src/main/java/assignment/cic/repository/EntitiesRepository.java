/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.repository;

import assignment.cic.entities.Entities;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author phomolo
 */
public interface EntitiesRepository extends CrudRepository<Entities , Long> {
    
}
