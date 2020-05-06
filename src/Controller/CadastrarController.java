
package Controller;

import DAO.LivroDAO;
import Model.Livro;
import View.CadastrarView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class CadastrarController implements ActionListener {

    
    private JTextField textTitulo;
    private JTextField textAutor;
    private JComboBox checkGenero;
    private JComboBox checkAno;
    private JCheckBox checkLeu;
    private JButton btnCadastrar;
    private LivroDAO livroDao;
    private LivroDAO outroLivroDao;
    
    public CadastrarController(
            JTextField textTitulo,
            JTextField textAutor,
            JComboBox checkGenero,
            JComboBox checkAno,
            JCheckBox checkLeu,
            JButton btnCadastrar
    ){
        this.textTitulo = textTitulo;
        this.textAutor = textAutor;
        this.checkGenero = checkGenero;
        this.checkAno = checkAno;
        this.checkLeu = checkLeu;
        
        this.popularComboAno();
        this.popularComboGenero();
        
    }
    
    
    private void popularComboAno() {
        
        this.checkAno.removeAll();
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        for (int anoLoop = anoAtual ; anoLoop >= 1980 ; anoLoop --) {
            this.checkAno.addItem(anoLoop);
        }
    }
    
    private void popularComboGenero() {
        String[] generos = new String[] { "Terror", "Comedia", "Drama" };
        for (String generoLoop : generos) {
            this.checkGenero.addItem(generoLoop);
        }
    }
    
    private void criarNovoLivro(){
        Livro livro = new Livro(
                this.textTitulo.getText(),
                this.textAutor.getText(),
                this.checkGenero.getSelectedItem().toString(),
                Integer.parseInt(this.checkAno .getSelectedItem().toString()),
                this.checkLeu.isSelected()
        );
        
        
        livroDao.insert(livro);
        
        System.out.println("-----CADASTRAR------");
        outroLivroDao.imprimir();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        System.out.println(arg0.getActionCommand());
        this.criarNovoLivro();
    }
    
}
