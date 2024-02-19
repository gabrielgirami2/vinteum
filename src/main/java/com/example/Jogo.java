package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }
    public Carta distribuirCartaParaJogador(Jogador jogador){

        if(jogador.parou()) return null;

        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;

    }

    public boolean acabou(){
        var osDoisPararam = jogador.parou() && computador.parou();
        var alguemEstourou = jogador.estourou() || computador.estourou();

        return osDoisPararam || alguemEstourou;
    }
    public String resultado(){
        var pontosSaoIguais = jogador.getPontos() == computador.getPontos();
        var jogadorTemMaisPontos = jogador.getPontos() == computador.getPontos();

        if( jogador.estourou() && computador.estourou() || pontosSaoIguais) return "Empatou";
        
        
        if(!jogador.estourou() && (computador.estourou() || jogadorTemMaisPontos)) return "Você Ganhou!";
            
        
        return "Você Perdeu!";

    }

}
