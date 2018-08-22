
package telas.classe;

import telas.TelaCadVisitante;
import telas.TelaEquipamentos;
import telas.TelaEscolhaCad;
import telas.TelaTreinos;

public class ClasseTePrincipal {
    
    public void botaoCadastro(){
        TelaEscolhaCad frame = new TelaEscolhaCad(); 
        frame.setVisible(true);
    }
    
    public void botaoCadastro(String n){
        TelaCadVisitante frame = new TelaCadVisitante();
        frame.setVisible(true);
    }
    
    public void botaoEquip(){
        TelaEquipamentos frame = new TelaEquipamentos();
        frame.setVisible(true);
    }
    
    public void botaoTreinos(){
        TelaTreinos frame = new TelaTreinos();
        frame.setVisible(true);
    }
    
}
