package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	

	@Query("SELECT f FROM Funcionario f WHERE f.nome LIKE CONCAT ('%', :nome, '%')")
	public List<Funcionario> findByNome (String nome);
	
	public List<Funcionario> findByIdade (int idade);
	
	public List<Funcionario> findByMatricula (String matricula);
	
}
