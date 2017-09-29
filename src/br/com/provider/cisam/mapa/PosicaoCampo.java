package br.com.provider.cisam.mapa;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 */
public class PosicaoCampo {

    private int inicioCampo;
    private int fimCampo;

    public PosicaoCampo(int inicioCampo, int fimCampo) {
        this.inicioCampo = inicioCampo;
        this.fimCampo = fimCampo;
    }

    public int getInicioCampo() {
        return inicioCampo;
    }

    public void setInicioCampo(int inicioCampo) {
        this.inicioCampo = inicioCampo;
    }

    public int getFimCampo() {
        return fimCampo;
    }

    public void setFimCampo(int fimCampo) {
        this.fimCampo = fimCampo;
    }
}
