package br.com.provider.cisam;

import java.io.IOException;
import java.util.List;

import br.com.provider.cisam.model.CisamModel;
import br.com.provider.cisam.service.CisamService;

public class ArquivoCISAM {
	private CisamService cisamService;
	public ArquivoCISAM()
	{
		cisamService = new CisamService();
	}
	
	public List<CisamModel> lerArquivo() throws IOException {
		return cisamService.obterTodos();
	}
}