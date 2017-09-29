package br.com.provider.cisam.mapa;

import java.util.HashMap;
import java.util.Map;

import br.com.provider.cisam.model.CisamModel;

/**
 *
 * @author Luciano Nascimento
 * @version 1.0.0
 */
public class MapaCamposModeloCisam {

    private Map<String, PosicaoCampo> mapa;

    public MapaCamposModeloCisam() {
        mapa = new HashMap<>();
    }
    
    public MapaCamposModeloCisam mapaCamposCisam() {
    	mapa.put(CamposModelo.ORGAO, new PosicaoCampo(1, 2));
    	mapa.put(CamposModelo.NUMERO_EXERC, new PosicaoCampo(2, 4));
    	mapa.put(CamposModelo.NURAMOP, new PosicaoCampo(4, 6));
    	mapa.put(CamposModelo.TIPO_DOC, new PosicaoCampo(6, 8));
    	mapa.put(CamposModelo.NUMERO_APOLI, new PosicaoCampo(8, 14));
    	mapa.put(CamposModelo.NUME_ENDOS, new PosicaoCampo(14, 17));
    	mapa.put(CamposModelo.NOME_PORTADOR, new PosicaoCampo(17, 67));
    	mapa.put(CamposModelo.COD_BANDEIRA, new PosicaoCampo(67, 68));
    	mapa.put(CamposModelo.NUMERO_CARTAO_MASCARADO, new PosicaoCampo(68, 78));
    	mapa.put(CamposModelo.MES_VALIDADE, new PosicaoCampo(78, 84));
    	mapa.put(CamposModelo.ROD_TOKEN, new PosicaoCampo(84, 120));
    	mapa.put(CamposModelo.COD_OPERACAO, new PosicaoCampo(120, 156));
    	mapa.put(CamposModelo.COD_PAGAMENTO, new PosicaoCampo(156, 182));
    	mapa.put(CamposModelo.NUMERO_COMPROVANTE, new PosicaoCampo(182, 202));
    	mapa.put(CamposModelo.COD_AUTORIZACAO, new PosicaoCampo(202, 502));
    	mapa.put(CamposModelo.ID_PAGAMENTO, new PosicaoCampo(502, 513));

        return this;
    }
    
    public Map<String, PosicaoCampo> getMapa() {
        return mapa;
    }

    public void setMapa(Map<String, PosicaoCampo> mapa) {
        this.mapa = mapa;
    }
}
