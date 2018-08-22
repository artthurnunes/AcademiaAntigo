package telas.classe;

import telas.TelaNovaSenha;

public class ClasseAltSenha {
    
    private String usuario;
    private String senhaAntiga;
    private String novaSenha;
    private String novaSenhaVer;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenhaAntiga() {
        return senhaAntiga;
    }

    public void setSenhaAntiga(String senhaAntiga) {
        this.senhaAntiga = senhaAntiga;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }

    public String getNovaSenhaVer() {
        return novaSenhaVer;
    }

    public void setNovaSenhaVer(String novaSenhaVer) {
        this.novaSenhaVer = novaSenhaVer;
    }
    
    
    
    public void novaSenha(){
       new TelaNovaSenha(null,true).setVisible(true); 
      //new TelaNovaSenhaApagar().setVisible(true);
    } 
}
