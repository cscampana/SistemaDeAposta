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
public class Calculo {

    public Calculo(Tratamento t) {
        this.t = t;
    }

    Tratamento t;
    int numeroCpu;

    public void calculaNumeroCpu() {
        int numeroReferencia = 100;
         numeroCpu = (int) (numeroReferencia * Math.random());
        t.setNumeroCpu(numeroCpu);
    }

    public void resultado() {
        int valorAposta = t.getValorAposta();
        int numeroApostado = t.getNumeroEscolhido();
         numeroCpu = t.getNumeroCpu();

        if (numeroApostado == numeroCpu) {
            t.setValorGanho(valorAposta * 2);
            t.setGanhouOuPerdeu(true);
        } else if (numeroApostado == 14) {
            t.setNumeroCpu(14);
            t.setValorGanho(valorAposta * 6);
            t.setGanhouOuPerdeu(true);
        } else {
            t.setValorGanho(0);
            t.setGanhouOuPerdeu(false);
        }

    }
}
