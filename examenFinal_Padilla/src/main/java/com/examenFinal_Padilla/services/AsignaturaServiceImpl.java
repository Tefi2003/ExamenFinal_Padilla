/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenFinal_Padilla.services;

import com.examenFinal_Padilla.model.Asignatura;
import com.examenFinal_Padilla.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author tefip
 */
@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura, Long> implements AsignaturaService{
	@Autowired
	AsignaturaRepository CicloRepository;
	@Override
	public CrudRepository<Asignatura, Long> getDao() {
		return CicloRepository;
	}
}
