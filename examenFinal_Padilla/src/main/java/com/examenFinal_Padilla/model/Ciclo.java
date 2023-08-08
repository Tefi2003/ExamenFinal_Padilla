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
@Document(collection = "ciclo")
@Data
public class Ciclo {
    
    @Id
	private Long  id_ciclo;
	 
	private String nombre;
	
	private String descripcion;
	
}