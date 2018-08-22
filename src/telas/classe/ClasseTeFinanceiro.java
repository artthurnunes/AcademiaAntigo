
package telas.classe;

import javax.swing.JOptionPane;

public class ClasseTeFinanceiro {
    
    public void licencaFree(){
        JOptionPane.showMessageDialog(null, "Seu software não está licenciado para este item \n Veja mais versões em nosso site www.alrsystem.com", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mensagemSobre(){
        JOptionPane.showMessageDialog(null, "<html>Software criado por ALRSYSTEM <br><B>www.alrsystem.com</B>"
                                          + "<BR>Versão 1.0 FREE</html>", "SOBRE A ALR SYSTEM", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
