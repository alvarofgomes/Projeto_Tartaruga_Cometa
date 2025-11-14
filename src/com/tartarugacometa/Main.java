package com.tartarugacometa;

import com.tartarugacometa.model.*;
import com.tartarugacometa.controller.*;

public class Main {

	public static void main(String[] args) {

		ClienteController cc = new ClienteController();
		EnderecoController ec = new EnderecoController();
		ProdutoController pc = new ProdutoController();
		
		cc.cadastrarCliente();
		cc.exibirInfo();
		
		ec.exibirInfo();
		pc.exibirInfo();
		
	}

}