/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenFinal_Padilla.model;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author tefip
 */
@Getter
@Setter
@Document(collection = "asignatura")
@Data
public class Asignatura {
    
	@Id
	private Long  id_asignatura;
	 
	private String nombre;
	
	private int n_horas;
	
	private int n_horas_practicas;
	
	private int n_horas_autonomas;
        
        private List<Profesor> listProfesor;
	
}

