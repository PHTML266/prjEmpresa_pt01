package com.PHTML266.PrjEmpresa.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PHTML266.PrjEmpresa.entities.Funcionario;
import com.PHTML266.PrjEmpresa.services.FuncionarioService;

@RestController
@RequestMapping("/employees")
public class FuncionarioControler {

	private final FuncionarioService funcionarioService;
	
	@Autowired
	public FuncionarioControler (FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	@GetMapping("/{id}")
	public Funcionario getFuncionario(@PathVariable Long funcodigo) {
		return funcionarioService.getFuncionarioById(funcodigo);
	}
	
	@GetMapping
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioService.getAllFuncionarios();
	}
	
	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable Long funcodigo) {
		funcionarioService.deleteFuncionario(funcodigo);
	}
	
}
