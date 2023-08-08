/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenFinal_Padilla.services;

import com.examenFinal_Padilla.model.Periodo;
import com.examenFinal_Padilla.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author tefip
 */
@Service
public class PeriodoServiceImpl extends GenericServiceImpl<Periodo, Long> implements PeriodoService{
	@Autowired
	PeriodoRepository CicloRepository;
	@Override
	public CrudRepository<Periodo, Long> getDao() {
		return CicloRepository;
	}
}
