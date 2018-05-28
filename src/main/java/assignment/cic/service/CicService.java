/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.cic.service;

import assignment.cic.entities.Cic;
import java.util.List;

/**
 *
 * @author phomolo
 */

public interface CicService {
    
   List<Cic> cicList();

    Cic findOne(Long id);

    Cic addCic(Cic Cic);
}
