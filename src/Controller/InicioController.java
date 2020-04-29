/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CadastrarView;
import View.ExibirView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InicioController implements ActionListener {

    CadastrarView cadastrarView;
    ExibirView exibirView;

//    OPCIONAL
    public InicioController(CadastrarView cadastrarView, ExibirView exibirView){
        this.cadastrarView = cadastrarView;
        this.exibirView = exibirView;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        switch(arg0.getActionCommand()){
            case "Cadastrar": this.mostrarTelaCadastrar();
            break;
            case "Exibir": this.mostrarTelaExibir();
            break;
        }
    }
    
    private void mostrarTelaExibir(){
        this.exibirView.setVisible(true);
                
    }
    
    private void mostrarTelaCadastrar(){
        this.cadastrarView.setVisible(true);
    }
    
}
