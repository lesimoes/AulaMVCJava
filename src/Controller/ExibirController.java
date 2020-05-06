
package Controller;

import DAO.LivroDAO;
import View.ExibirView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExibirController implements ActionListener {

    private ExibirView view;
    private LivroDAO livroDao;

    public ExibirController(ExibirView view){
        this.view = view;
    }
    
    public ExibirController(){

    }
    
    
    private void mostrarTela(){
        this.view.setVisible(true);
    }
    
    private void mostrar(){
        livroDao.imprimir();
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        System.out.println(arg0.getActionCommand());

//        this.mostrarTela();
        
        System.out.println("-----EXIBIR------");
        this.mostrar();
    }
    
}
