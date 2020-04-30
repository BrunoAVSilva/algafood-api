package com.example.algafoodapi.domain.repository;

import java.util.List;

import com.example.algafoodapi.domain.model.Restaurante;

public interface RestauranteRepository {

	public List<Restaurante> listar();
	public Restaurante buscar(Long id);
	public Restaurante salvar(Restaurante restaurante);
	public void remover(Restaurante restaurante);
}
