package Pais;

import java.util.LinkedList;
import java.util.List;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private List<Pais> listaPaises;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.listaPaises = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getPaises() {
        return listaPaises;
    }

    public void setPaises(List<Pais> paises) {
        this.listaPaises = paises;
    }
    public boolean equals(final Pais pais) {
        return this.getNome().equals(pais.getNome()) && this.getCapital().equals(pais.getCapital());
    }
    
    public void adicionarPais(Pais pais){
        if(!equals(pais)){
            listaPaises.add(pais);
        }
    }
    public void setPaisFronteira(List<Pais> paises) {
        this.listaPaises.clear();
        for (Pais pais : paises) {
            adicionarPais(pais);
        }
    }

    public List<Pais> getPaisFronteira() {
        return listaPaises;
    }

}
