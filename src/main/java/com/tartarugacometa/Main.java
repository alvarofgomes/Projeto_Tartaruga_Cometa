package com.tartarugacometa;

import java.util.*;

import com.tartarugacometa.model.*;
import com.tartarugacometa.service.ClienteService;
import com.tartarugacometa.controller.*;
import com.conexaofactory.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		//quando roda pelo gradleTest ele dar erro de copilação por não ter teste do gradle
		//tive que chamar diretamente no main para rodar na aplicação
		ConnectionFactory c = new ConnectionFactory();
		
		ClienteController cc = new ClienteController();
		//EnderecoController ec = new EnderecoController();
		//ProdutoController pc = new ProdutoController();
		
		cc.cadastrarCliente();
		cc.exibirInfo();
		
		//pc.cadastrarDadosDoProduto();
		//pc.exibirInfo();
		
		//ec.cadastrarDadosDoEndereco();
		//ec.exibirInfo();
		
	}

}
//File -> New -> Maven Project -> escolhe um archetype (quickstart ou webapp) caminho para criar maven