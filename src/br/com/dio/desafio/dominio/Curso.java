package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    // private String titulo;
    // private String descricao;
    private int cargaHoraria;
    
    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "\n\nCurso [\ntitulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String detalhesCalculoXP() {
        return String.format("XP Curso %s (%s x %s horas) = %s", getTitulo(), getXpPadrao(), getCargaHoraria(), calcularXP());
    }
    
    public double getXpPadrao(){
        return XP_PADRAO;
    }

}
