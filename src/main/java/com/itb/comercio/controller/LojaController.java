package com.itb.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produto")
public class LojaController {
	
	//Array com capacidade flexível
	
	
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		List<Produto> listaDeProdutos = new ArrayList<>();
		Produto p1 = new Produto();
		
		p1.setId(20l);
		p1.setName("maquina de lavar");
		p1.setDescreption("Maquina de lavar Brastemp 12l");
		p1.setCodeBar("AAJAJAJ");
		p1.setPreco(2100.00);
		
		Produto p2 = new Produto();
		p2.setId(10l);
		p2.setName("Torradeira");
		p2.setDescreption("Torradeira eletrolux");
		p2.setCodeBar("AJHGS");
		p2.setPreco(150.00);
		
		// Guardando os produtos no array
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		//Passando a lista de produtos para o front-end
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		
		return "produtos";
	}
}
