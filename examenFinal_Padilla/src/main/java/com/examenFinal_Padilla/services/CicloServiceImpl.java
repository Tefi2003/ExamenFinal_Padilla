/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenFinal_Padilla.services;

import com.examenFinal_Padilla.model.Ciclo;
import com.examenFinal_Padilla.repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author tefip
 */
@Service
public class CicloServiceImpl extends GenericServiceImpl<Ciclo, Long> implements CicloService{
	@Autowired
	CicloRepository CicloRepository;
	@Override
	public CrudRepository<Ciclo, Long> getDao() {
		return CicloRepository;
	}

}
