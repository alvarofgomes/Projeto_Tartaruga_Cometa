package com.tartarugacometa;

import com.tartarugacometa.model.*;
import com.tartarugacometa.controller.*;

public class Main {

	public static void main(String[] args) {

		ExibirInformacoesClientesController eic = new ExibirInformacoesClientesController();
		ExibirInformacoesEnderecoController  eie = new ExibirInformacoesEnderecoController();
		ExibirInformacoesProdutosController eip = new ExibirInformacoesProdutosController();
		
		eic.exibirInfo();
		eie.exibirInfo();
		eip.exibirInfo();
		
	}

}