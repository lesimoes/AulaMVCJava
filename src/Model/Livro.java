/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private int ano;
    private boolean jaLeu;
    
    public Livro(String titulo, String autor, String genero, int ano, boolean jaLeu){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAno(ano);
        this.setGenero(genero);
        this.setJaLeu(jaLeu);
    }

    
    public String toString(){
        return this.getTitulo() + " " + this.getAutor() + " " + this.getGenero() + " " + this.getAno(); 
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the jaLeu
     */
    public boolean isJaLeu() {
        return jaLeu;
    }

    /**
     * @param jaLeu the jaLeu to set
     */
    public void setJaLeu(boolean jaLeu) {
        this.jaLeu = jaLeu;
    }
}
