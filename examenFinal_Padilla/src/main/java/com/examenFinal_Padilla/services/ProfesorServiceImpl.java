/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenFinal_Padilla.services;

import com.examenFinal_Padilla.model.Profesor;
import com.examenFinal_Padilla.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tefip
 */
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements ProfesorService{
	@Autowired
	ProfesorRepository CicloRepository;
	@Override
	public CrudRepository<Profesor, Long> getDao() {
		return CicloRepository;
	}
}
