package DAO;

import Model.Livro;
import java.util.ArrayList;
import java.util.List;

public abstract class LivroDAO {
    private static List<Livro> listaLivros;
    
    
    public LivroDAO() {
        this.listaLivros = new ArrayList<>();
    }
    
    public static void iniciar (){
        listaLivros = new ArrayList<>();
    }
    
    public static void insert(Livro livro){
        listaLivros.add(livro);
    }
    
    public static List<Livro> getLivros(){
        return listaLivros;
    }
    
    public static void imprimir(){
        for (Livro livroLoop : listaLivros) {
            System.out.println(livroLoop.toString());
        }
    }
}
