
package Controller;

import View.ExibirView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExibirController implements ActionListener {

    private ExibirView view;

    public ExibirController(ExibirView view){
        this.view = view;
    }
    
    
    private void mostrarTela(){
        this.view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        System.out.println(arg0.getActionCommand());

        this.mostrarTela();
    
    }
    
}
