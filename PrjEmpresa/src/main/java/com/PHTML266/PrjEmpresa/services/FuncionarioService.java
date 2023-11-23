package com.PHTML266.PrjEmpresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PHTML266.PrjEmpresa.entities.Funcionario;
import com.PHTML266.PrjEmpresa.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;
	
	@Autowired
	public FuncionarioService (FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario getFuncionarioById(Long funcodigo) {
		return funcionarioRepository.findById(funcodigo).orElse(null);
	}
	
	public void deleteFuncionario(Long funcodigo) {
		funcionarioRepository.deleteById(funcodigo);
	}
	
}
