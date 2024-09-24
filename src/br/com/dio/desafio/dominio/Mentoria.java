package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
   
    @Override
    public String toString() {
        return "\nMentoria [\ntitulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String detalhesCalculoXP() {
        return String.format("XP Mentoria %s (%s + 20 xp) = %s", getTitulo(), getXpPadrao(), calcularXP());
    }

    public double getXpPadrao(){
        return XP_PADRAO;
    }
    
}
