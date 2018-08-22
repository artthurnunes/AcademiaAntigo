
package telas.classe;

public class ClasseCadAluno {
    private String nome;
    private String dataNascimento;
    private int sexo;
    private int estadoCivil;
    private String profissao;
    private String cpf;
    private String rg;
    private int ufRg;
    private String telefone;
    private int codigoAluno;
    private boolean status;
    private String endereco;
    private String enderecoNumero;
    private String enderecoComplemento;
    private String bairro;
    private String cidade;
    private String cep;        
    private int enderecoUf;
    private String profResposavel;
    private int bebe;
    private int fuma;
    private int treinou;
    private String pergunta1;
    private String pergunta2;
    private String pergunta3;
    private boolean checkHipertrofia;
    private boolean checkAero;
    private boolean checkNatacao;
    private boolean checkBox;
    private boolean checkZumba;
    private boolean checkDanca;
    private boolean checkBale;
    private boolean checkFisio;
    private boolean checkCross;
    private boolean checkIoga;
    private boolean checkTenis;
    private boolean checkBasquete;
    private boolean checkFuncional;
    private boolean checkIntenso;
    private boolean checkVolei;
    private boolean checkBallet;

    public ClasseCadAluno() {
        this.checkHipertrofia = false;
    }

    //encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getufRg() {
        return ufRg;
    }

    public void setufRg(int ufRg) {
        this.ufRg = ufRg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getEnderecoUf() {
        return enderecoUf;
    }

    public void setEnderecoUf(int enderecoUf) {
        this.enderecoUf = enderecoUf;
    }

    public String getProfResposavel() {
        return profResposavel;
    }

    public void setProfResposavel(String profResposavel) {
        this.profResposavel = profResposavel;
    }

    public int getBebe() {
        return bebe;
    }

    public void setBebe(int bebe) {
        this.bebe = bebe;
    }

    public int getFuma() {
        return fuma;
    }

    public void setFuma(int fuma) {
        this.fuma = fuma;
    }

    public int getTreinou() {
        return treinou;
    }

    public void setTreinou(int treinou) {
        this.treinou = treinou;
    }

    public String getPergunta1() {
        return pergunta1;
    }

    public void setPergunta1(String pergunta1) {
        this.pergunta1 = pergunta1;
    }

    public String getPergunta2() {
        return pergunta2;
    }

    public void setPergunta2(String pergunta2) {
        this.pergunta2 = pergunta2;
    }

    public String getPergunta3() {
        return pergunta3;
    }

    public void setPergunta3(String pergunta3) {
        this.pergunta3 = pergunta3;
    }

    public boolean getCheckHipertrofia() {
        return checkHipertrofia;
    }

    public void setCheckHipertrofia(boolean checkHipertrofia) {
        this.checkHipertrofia = checkHipertrofia;
    }

    public boolean getCheckAero() {
        return checkAero;
    }

    public void setCheckAero(boolean checkAero) {
        this.checkAero = checkAero;
    }

    public boolean getCheckNatacao() {
        return checkNatacao;
    }

    public void setCheckNatacao(boolean checkNatacao) {
        this.checkNatacao = checkNatacao;
    }

    public boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    public boolean getCheckZumba() {
        return checkZumba;
    }

    public void setCheckZumba(boolean checkZumba) {
        this.checkZumba = checkZumba;
    }

    public boolean getCheckDanca() {
        return checkDanca;
    }

    public void setCheckDanca(boolean checkDanca) {
        this.checkDanca = checkDanca;
    }

    public boolean getCheckBale() {
        return checkBale;
    }

    public void setCheckBale(boolean checkBale) {
        this.checkBale = checkBale;
    }

    public boolean getCheckFisio() {
        return checkFisio;
    }

    public void setCheckFisio(boolean checkFisio) {
        this.checkFisio = checkFisio;
    }

    public boolean getCheckCross() {
        return checkCross;
    }

    public void setCheckCross(boolean checkCross) {
        this.checkCross = checkCross;
    }

    public boolean getCheckIoga() {
        return checkIoga;
    }

    public void setCheckIoga(boolean checkIoga) {
        this.checkIoga = checkIoga;
    }

    public boolean getCheckTenis() {
        return checkTenis;
    }

    public void setCheckTenis(boolean checkTenis) {
        this.checkTenis = checkTenis;
    }

    public boolean getCheckBasquete() {
        return checkBasquete;
    }

    public void setCheckBasquete(boolean checkBasquete) {
        this.checkBasquete = checkBasquete;
    }

    public boolean getCheckFuncional() {
        return checkFuncional;
    }

    public void setCheckFuncional(boolean checkFuncional) {
        this.checkFuncional = checkFuncional;
    }

    public boolean getCheckIntenso() {
        return checkIntenso;
    }

    public void setCheckIntenso(boolean checkIntenso) {
        this.checkIntenso = checkIntenso;
    }

    public boolean getCheckVolei() {
        return checkVolei;
    }

    public void setCheckVolei(boolean checkVolei) {
        this.checkVolei = checkVolei;
    }

    public boolean getCheckBallet() {
        return checkBallet;
    }

    public void setCheckBallet(boolean checkBallet) {
        this.checkBallet = checkBallet;
    }
    
    
    
}
