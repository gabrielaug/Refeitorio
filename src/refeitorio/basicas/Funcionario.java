/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeitorio.basicas;

/**
 *
 * @author Gabriel Augusto
 */
public class Funcionario {

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getTel1() {
        return tel1;
    }

    public void setTel1(float tel1) {
        this.tel1 = tel1;
    }

    public float getTel2() {
        return tel2;
    }

    public void setTel2(float tel2) {
        this.tel2 = tel2;
    }

    public String getEscala() {
        return Escala;
    }

    public void setEscala(String Escala) {
        this.Escala = Escala;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
    
    

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    private String matricula;
    private String nome;
    private String setor;
    private float tel1;
    private float tel2;
    private String Escala;
    private Cartao cartao;
    private String situacao;
}
