package com.algaworks.algafood.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{

	public List<Restaurante> queryByTaxaFreteBetween(BigDecimal taxaIncial, BigDecimal taxaFinal);
	
	@Query("from Restaurante where nome like %:nome% and cozinha.id = :id")
	public List<Restaurante> conssultarPorNome(String nome, @Param("id") Long cozinha);
	
	public List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinhaId);
	
	public Optional<Restaurante> findFirstByNomeContaining(String nome);
	
	public List<Restaurante> findTop2ByNomeContaining(String nome);
}
