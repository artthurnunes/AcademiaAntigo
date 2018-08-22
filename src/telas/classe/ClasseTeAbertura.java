
package telas.classe;

import connBD.ClasseSelects;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import telas.TelaAltSenha;
import telas.TelaPrincipal;

public class ClasseTeAbertura {  
    
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   
    
    
    public void altSenha(){
        new TelaAltSenha(null,true).setVisible(true);
    }
    
    public int confSenha(){
        ClasseSelects select = new ClasseSelects();
        
        if(select.selectTruthPass(this.getUsuario(), this.getSenha())){
            new TelaPrincipal().setVisible(true);
            return (1);
        }else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha invalidos");
            return (0);
        }       
        
        
        /* ----VERIFICAÇÃO DE SENHA MANUAL SEM BANCO
        if(usuario.equals("abc") && senha.equals("123")){ //equals faz comparação literal do caracter
                TelaPrincipal frame = new TelaPrincipal(); 
                frame.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos !", "Erro", JOptionPane.ERROR_MESSAGE);
            } */       
    }

    public void cancelaFechaTela(){ //metodo fecha a tela atual e para o programa
        this.dispose();
        exit(0); //para parar o processo ao sair
    }
      
    
    
    
    
    
    
    
    //métodos sem uso criados para funcionamento
    private void dispose() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
