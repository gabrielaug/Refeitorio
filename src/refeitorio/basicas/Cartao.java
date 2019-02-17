/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeitorio.basicas;

import java.util.Date;

/**
 *
 * @author Gabriel Augusto
 */
public class Cartao {

    public float getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(float codBarra) {
        this.codBarra = codBarra;
    }

    public int getDiasAcesso() {
        return diasAcesso;
    }

    public void setDiasAcesso(int diasAcesso) {
        this.diasAcesso = diasAcesso;
    }

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }
    
    
    private float codBarra;
    private int diasAcesso;
    private Date dtInicial;
    private Date dtFinal;
    
}
