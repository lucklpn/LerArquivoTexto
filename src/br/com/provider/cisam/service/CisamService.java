package br.com.provider.cisam.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.provider.cisam.mapa.CamposModelo;
import br.com.provider.cisam.mapa.MapaCamposModeloCisam;
import br.com.provider.cisam.mapa.PosicaoCampo;
import br.com.provider.cisam.model.CisamModel;
import br.com.provider.cisam.util.Configuracao;

public class CisamService {
	
	private Map<String, PosicaoCampo> mapa;
	
	public CisamService() {
	}
	
	public List<CisamModel> obterTodos() throws IOException {
		List<CisamModel> retorno = new ArrayList<CisamModel>();
		
		retorno = lerArquivo();
		
		return retorno;
	}
	
	public File abrirArquivo() throws IOException {
		File arquivo = new File(Configuracao.getProp().getProperty("caminho.arquivo") + "\\azul.cartaome");
		
		return arquivo;
	}
	
	public List<CisamModel> lerArquivo() throws IOException {
		File arquivo = abrirArquivo();
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), Charset.forName("cp1252")));
		List<CisamModel> lista = new ArrayList<CisamModel>();
		
        String linha;
        while ((linha = in.readLine()) != null) {
        	lista.add(parseCampos(linha));
        }
        
        return lista;
	}

	private CisamModel parseCampos(String linha) {
		PosicaoCampo campo;
		CisamModel modelo = new CisamModel();

		mapa = new MapaCamposModeloCisam().mapaCamposCisam().getMapa();
		
		campo = (PosicaoCampo) mapa.get(CamposModelo.ORGAO);
        modelo.setOrgao(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NUMERO_EXERC);
        modelo.setNumeroExerc(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NURAMOP);
        modelo.setNuramop(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.TIPO_DOC);
        modelo.setTipoDoc(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NUMERO_APOLI);
        modelo.setNumeroApoli(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NUME_ENDOS);
        modelo.setNumeEndos(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NOME_PORTADOR);
        modelo.setNomePortador(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.COD_BANDEIRA);
        modelo.setCodBandeira(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NUMERO_CARTAO_MASCARADO);
        modelo.setNumerocartaoMascarado(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.MES_VALIDADE);
        modelo.setMesValidade(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.ROD_TOKEN);
        modelo.setRodToken(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.COD_OPERACAO);
        modelo.setCoDoperacao(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.COD_PAGAMENTO);
        modelo.setCodPagamento(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.NUMERO_COMPROVANTE);
        modelo.setNumeroComprovante(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.COD_AUTORIZACAO);
        modelo.setCodAutorizacao(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
		campo = (PosicaoCampo) mapa.get(CamposModelo.ID_PAGAMENTO);
        modelo.setIdPagamento(linha.substring(campo.getInicioCampo(), campo.getFimCampo()).trim());
        
		return modelo;
	}
}