package com.tartarugacometa;

import java.util.*;

import com.tartarugacometa.model.*;
import com.tartarugacometa.controller.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		ClienteController cc = new ClienteController();
		EnderecoController ec = new EnderecoController();
		ProdutoController pc = new ProdutoController();
		
		cc.cadastrarCliente();
		cc.exibirInfo();
		
		pc.cadastrarDadosDoProduto();
		pc.exibirInfo();
		
		ec.cadastrarDadosDoEndereco();
		ec.exibirInfo();
		
	}

}