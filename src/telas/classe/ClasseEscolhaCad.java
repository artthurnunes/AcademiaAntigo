
package telas.classe;

import telas.TelaCadAdm;
import telas.TelaCadAluno;
import telas.TelaCadProfessor;

public class ClasseEscolhaCad {
    
    public void botaoEscolha(){
        TelaCadAluno frame = new TelaCadAluno(); 
        frame.setVisible(true);
    }
    
    public void botaoEscolha(int n){
        TelaCadProfessor frame = new TelaCadProfessor(); 
        frame.setVisible(true);
    }
    
    public void botaoEscolha(String n){
        TelaCadAdm frame = new TelaCadAdm(); 
        frame.setVisible(true);
    }

    
}
