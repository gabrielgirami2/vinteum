package com.example;

public class Computador extends Jogador{

    @Override
    public boolean parou() {
        if (this.getPontos() == 21|| this.getPontos() == 20 || this.getPontos() == 19) {
            return true;
        } else if (this.getPontos() == 18) {
            return false;
        }return false;
    }

}
