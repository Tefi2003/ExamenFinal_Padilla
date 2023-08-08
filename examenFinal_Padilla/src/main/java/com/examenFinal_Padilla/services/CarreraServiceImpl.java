/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenFinal_Padilla.services;

import com.examenFinal_Padilla.model.Carrera;
import com.examenFinal_Padilla.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author tefip
 */
@Service
public class CarreraServiceImpl extends GenericServiceImpl<Carrera, Long> implements CarreraService{
	@Autowired
	CarreraRepository CicloRepository;
	@Override
	public CrudRepository<Carrera, Long> getDao() {
		return CicloRepository;
	}
}
