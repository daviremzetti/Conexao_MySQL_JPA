
package cenaflix;

import java.time.LocalDate;

/**
 * Classe que representa filmes.
 * @author daviremzetti
 */

public class Filme {
    
    private int id;
    private String nome;
    private String categoria;
    private LocalDate lancamento;
    
    /**
     * Método construtor da classe Filme
     * @param nome - nome do filme
     * @param lancamento - data do lançamento do filme
     * @param categoria - categoria do filme (comédia, drama, ação, etc...)
     */
    public Filme(String nome, LocalDate lancamento, String categoria){
     
        this.nome = nome;
        this.categoria = categoria;
        this.lancamento = lancamento;
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

}
