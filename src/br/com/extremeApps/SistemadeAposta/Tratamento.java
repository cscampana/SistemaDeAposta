/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.extremeApps.SistemadeAposta;

/**
 *
 * @author SirExtreme
 */
public class Tratamento {

    private int valorAposta;
    private int numeroEscolhido;
    private int numeroCpu;
    private boolean ganhouOuPerdeu;
    private int valorGanho;

    public int getValorAposta() {
        return valorAposta;
    }
    
    public void setValorAposta(int valorAposta) {
        this.valorAposta = valorAposta;
    }

    public int getNumeroEscolhido() {
        return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }

    public int getNumeroCpu() {
        return numeroCpu;
    }

    public void setNumeroCpu(int numeroCpu) {
        this.numeroCpu = numeroCpu;
    }

    public boolean isGanhouOuPerdeu() {
        return ganhouOuPerdeu;
    }

    public void setGanhouOuPerdeu(boolean ganhouOuPerdeu) {
        this.ganhouOuPerdeu = ganhouOuPerdeu;
    }

    public int getValorGanho() {
        return valorGanho;
    }

    public void setValorGanho(int valorGanho) {
        this.valorGanho = valorGanho;
    }
    

}
