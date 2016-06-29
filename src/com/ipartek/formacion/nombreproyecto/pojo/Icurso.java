package com.ipartek.formacion.nombreproyecto.pojo;

import java.util.ArrayList;

public interface Icurso {

	/**
	 * retorna un listado con todos los cursos
	 * @return
	 */
	public ArrayList<Object> getCursos();
	
	/**
	 * A�ade a la lista un unevo Curso
	 * @param curso
	 * @return
	 */
	public boolean asignarCurso(Object curso);
	
	/**
	 * Eliminar de la lista un curso
	 * @param curso
	 * @return
	 */
	public boolean desAsignarCurso(Object curso);
	
	
}
