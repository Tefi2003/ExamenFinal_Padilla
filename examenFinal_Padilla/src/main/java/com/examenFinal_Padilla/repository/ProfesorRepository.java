/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examenFinal_Padilla.repository;

import com.examenFinal_Padilla.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author tefip
 */
public interface ProfesorRepository extends MongoRepository<Profesor, Long>{
    
}
