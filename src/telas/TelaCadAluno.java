
package telas;

import connBD.ClasseConnectionBD;
import connBD.ClasseInserts;
import connBD.ClasseSelects;
import connBD.ClasseUpdates;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import telas.classe.ClasseCadAluno;
import telas.classe.ClasseCarregarPesquisa;


public class TelaCadAluno extends javax.swing.JFrame {
    //Instancias de Classes
    ClasseInserts insert = new ClasseInserts();
    ClasseSelects banco = new ClasseSelects();
    ClasseUpdates update = new ClasseUpdates();
    ClasseCadAluno aluno = new ClasseCadAluno();
    ClasseCarregarPesquisa load = new ClasseCarregarPesquisa();
    //public static int retornoJTable = 0;

    //método construtor sempre carregando os campos com os registros da classe ClasseCarregarPesquisa
    public TelaCadAluno() {
        initComponents();
        lblStatus.setText(load.getStatus());
        lblCodigo.setText(Integer.toString(load.getCodigo()));
        lblNome.setText(load.getNome());
        lblNasci.setText(load.getNascimento());
        combSexo.setSelectedIndex(load.getSexo());
        combEstadoCivil.setSelectedIndex(load.getEstadoCivil());
        lblProfi.setText(load.getProfissao());               
        lblCpf.setText(load.getCpf());                 
        lblRg.setText(load.getRg()); 
        combUfRg.setSelectedIndex(load.getRg_uf());
        lblTel.setText(load.getTelefone());          
        lblEnd.setText(load.getEndereco());                 
        lblNumCasa.setText(load.getNumeroCasa());             
        lblCompl.setText(load.getComplemento());               
        lblBairro.setText(load.getBairro());              
        lblCidade.setText(load.getCidade());              
        lblCep.setText(load.getCep());  
        combUfC.setSelectedIndex(load.getEndereco_uf());
        lblProf.setText(load.getProfessor());  
        combBebe.setSelectedIndex(load.getBebe());
        combFuma.setSelectedIndex(load.getFuma());
        combTreinou.setSelectedIndex(load.getTreinou());
        lblP1.setText(load.getPergunta1());                  
        lblP2.setText(load.getPergunta2());                  
        lblP3.setText(load.getPergunta3());       
        checkHipertrofia.setSelected(load.getHipertrofia());
        checkAero.setSelected(load.getAero());
        checkNatacao.setSelected(load.getNatacao());
        checkBox.setSelected(load.getBox());
        checkZumba.setSelected(load.getZumba());
        checkDanca.setSelected(load.getDanca());
        checkBale.setSelected(load.getBallet());
        checkFisio.setSelected(load.getFisio());
        checkCross.setSelected(load.getCross());
        checkIoga.setSelected(load.getIoga());
        checkTenis.setSelected(load.getTenis());
        checkBasquete.setSelected(load.getBasquete());
        checkFuncional.setSelected(load.getFuncional());
        checkIntenso.setSelected(load.getIntenso());
        checkVolei.setSelected(load.getVolei());
        checkBallet.setSelected(load.getBallet());       
    }
    
    //método para limpar os campos da tela
    public void limpaCamposTelaCadAluno(){
        lblNome.setText("");                
        lblNasci.setText("");               
        lblProfi.setText("");               
        lblCpf.setText("");                 
        lblRg.setText("");                  
        lblTel.setText("");                 
        lblCodigo.setText("");              
        lblStatus.setText("");              
        lblEnd.setText("");                 
        lblNumCasa.setText("");             
        lblCompl.setText("");               
        lblBairro.setText("");              
        lblCidade.setText("");              
        lblCep.setText("");                 
        lblProf.setText("");                
        lblP1.setText("");                  
        lblP2.setText("");                  
        lblP3.setText("");                  
        checkHipertrofia.setSelected(false);
        checkAero.setSelected(false);
        checkNatacao.setSelected(false);
        checkBox.setSelected(false);
        checkZumba.setSelected(false);
        checkDanca.setSelected(false);
        checkBale.setSelected(false);
        checkFisio.setSelected(false);
        checkCross.setSelected(false);
        checkIoga.setSelected(false);
        checkTenis.setSelected(false);
        checkBasquete.setSelected(false);
        checkFuncional.setSelected(false);
        checkIntenso.setSelected(false);
        checkVolei.setSelected(false);
        checkBallet.setSelected(false);       
    }
    
    //método para limpar os atributos da classe para quando a tela abrir novamente estar limpa pois o contrutor da tela seta de la 
    //toda vez que é aberto
    public void limpaCamposClassePesquisa(){
        load.setStatus("");
        load.setCodigo(0);
        load.setNome("");
        load.setNascimento("");
        load.setSexo(0);
        load.setEstadoCivil(0);
        load.setProfissao("");    
        load.setCpf("");
        load.setRg("");        
        load.setRg_uf(0);
        load.setTelefone("");        
        load.setEndereco("");
        load.setNumeroCasa("");
        load.setComplemento("");
        load.setBairro("");
        load.setCidade("");
        load.setCep("");
        load.setEndereco_uf(0);
        load.setProfessor("");
        load.setBebe(0);
        load.setFuma(0);
        load.setTreinou(0);
        load.setPergunta1("");
        load.setPergunta2("");
        load.setPergunta3("");
        load.setHipertrofia(false);
        load.setAero(false);
        load.setNatacao(false);
        load.setBox(false);
        load.setZumba(false);
        load.setDanca(false);
        load.setBale(false);
        load.setFisio(false);
        load.setCross(false);
        load.setIoga(false);
        load.setTenis(false);
        load.setBasquete(false);
        load.setFuncional(false);
        load.setIntenso(false);
        load.setVolei(false);
        load.setBallet(false);
    }
        
    //metodo select para pesquisa no banco atraves do nome.
    public void selectCadastroNome(String pesquisa) throws SQLException {
        
        Connection con = ClasseConnectionBD.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM tb_cadalunos where nome like '"+pesquisa+"%'";       
        
        ResultSet rs = stmt.executeQuery(sql);       
        
        while(rs.next()){ //while para pesquisa de select não sei o que ele faz 
            int status = rs.getInt("s_status");
                if(status == 1){
                    lblStatus.setText("ATIVO");
                }else{
                    lblStatus.setText("INATIVO");
                }
    
            lblCodigo.setText(Integer.toString(rs.getInt("cod_aluno")));
            lblNome.setText(rs.getString("nome"));
            lblNasci.setText(rs.getString("nascimento"));
            combSexo.setSelectedIndex(rs.getInt("sexo"));
            combEstadoCivil.setSelectedIndex(rs.getInt("estadoCivil"));
            lblProfi.setText(rs.getString("profissao"));               
            lblCpf.setText(rs.getString("cpf"));                 
            lblRg.setText(rs.getString("rg")); 
            combUfRg.setSelectedIndex(rs.getInt("rg_uf"));
            lblTel.setText(rs.getString("telefone"));          
            lblEnd.setText(rs.getString("endereco"));                 
            lblNumCasa.setText(rs.getString("numeroCasa"));             
            lblCompl.setText(rs.getString("complemento"));               
            lblBairro.setText(rs.getString("bairro"));              
            lblCidade.setText(rs.getString("cidade"));              
            lblCep.setText(rs.getString("cep"));  
            combUfC.setSelectedIndex(rs.getInt("endereco_uf"));
            lblProf.setText(rs.getString("professor"));  
            combBebe.setSelectedIndex(rs.getInt("bebe"));
            combFuma.setSelectedIndex(rs.getInt("fuma"));
            combTreinou.setSelectedIndex(rs.getInt("treinou"));
            lblP1.setText(rs.getString("pergunta1"));                  
            lblP2.setText(rs.getString("pergunta2"));                  
            lblP3.setText(rs.getString("pergunta3"));
            checkHipertrofia.setSelected(rs.getBoolean("checkHipertrofia"));
            checkAero.setSelected(rs.getBoolean("checkAero"));
            checkNatacao.setSelected(rs.getBoolean("checkNatacao"));
            checkBox.setSelected(rs.getBoolean("checkBox"));
            checkZumba.setSelected(rs.getBoolean("checkZumba"));
            checkDanca.setSelected(rs.getBoolean("checkDanca"));
            checkBale.setSelected(rs.getBoolean("checkBale"));
            checkFisio.setSelected(rs.getBoolean("checkFisio"));
            checkCross.setSelected(rs.getBoolean("checkCross"));
            checkIoga.setSelected(rs.getBoolean("checkIoga"));
            checkTenis.setSelected(rs.getBoolean("checkTenis"));
            checkBasquete.setSelected(rs.getBoolean("checkBasquete"));
            checkFuncional.setSelected(rs.getBoolean("checkFuncional"));
            checkIntenso.setSelected(rs.getBoolean("checkIntenso"));
            checkVolei.setSelected(rs.getBoolean("checkVolei"));
            checkBallet.setSelected(rs.getBoolean("checkBallet"));
        }   
    }
    
    //metodo select para pesquisa no banco atraves do codigo.
    public void selectCadastroCodigo(int codigo) throws SQLException {
        
        Connection con = ClasseConnectionBD.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM tb_cadalunos where cod_aluno = "+codigo+"";    
        
        ResultSet rs = stmt.executeQuery(sql);       
        
        while(rs.next()){ //while para pesquisa de select não sei o que ele faz 
            int status = rs.getInt("s_status");
                if(status == 1){
                    lblStatus.setText("ATIVO");
                }else{
                    lblStatus.setText("INATIVO");
                }
    
            lblCodigo.setText(Integer.toString(rs.getInt("cod_aluno")));
            lblNome.setText(rs.getString("nome"));
            lblNasci.setText(rs.getString("nascimento"));
            combSexo.setSelectedIndex(rs.getInt("sexo"));
            combEstadoCivil.setSelectedIndex(rs.getInt("estadoCivil"));
            lblProfi.setText(rs.getString("profissao"));               
            lblCpf.setText(rs.getString("cpf"));                 
            lblRg.setText(rs.getString("rg")); 
            combUfRg.setSelectedIndex(rs.getInt("rg_uf"));
            lblTel.setText(rs.getString("telefone"));          
            lblEnd.setText(rs.getString("endereco"));                 
            lblNumCasa.setText(rs.getString("numeroCasa"));             
            lblCompl.setText(rs.getString("complemento"));               
            lblBairro.setText(rs.getString("bairro"));              
            lblCidade.setText(rs.getString("cidade"));              
            lblCep.setText(rs.getString("cep"));  
            combUfC.setSelectedIndex(rs.getInt("endereco_uf"));
            lblProf.setText(rs.getString("professor"));  
            combBebe.setSelectedIndex(rs.getInt("bebe"));
            combFuma.setSelectedIndex(rs.getInt("fuma"));
            combTreinou.setSelectedIndex(rs.getInt("treinou"));
            lblP1.setText(rs.getString("pergunta1"));                  
            lblP2.setText(rs.getString("pergunta2"));                  
            lblP3.setText(rs.getString("pergunta3"));
            checkHipertrofia.setSelected(rs.getBoolean("checkHipertrofia"));
            checkAero.setSelected(rs.getBoolean("checkAero"));
            checkNatacao.setSelected(rs.getBoolean("checkNatacao"));
            checkBox.setSelected(rs.getBoolean("checkBox"));
            checkZumba.setSelected(rs.getBoolean("checkZumba"));
            checkDanca.setSelected(rs.getBoolean("checkDanca"));
            checkBale.setSelected(rs.getBoolean("checkBale"));
            checkFisio.setSelected(rs.getBoolean("checkFisio"));
            checkCross.setSelected(rs.getBoolean("checkCross"));
            checkIoga.setSelected(rs.getBoolean("checkIoga"));
            checkTenis.setSelected(rs.getBoolean("checkTenis"));
            checkBasquete.setSelected(rs.getBoolean("checkBasquete"));
            checkFuncional.setSelected(rs.getBoolean("checkFuncional"));
            checkIntenso.setSelected(rs.getBoolean("checkIntenso"));
            checkVolei.setSelected(rs.getBoolean("checkVolei"));
            checkBallet.setSelected(rs.getBoolean("checkBallet"));
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        paletas = new javax.swing.JTabbedPane();
        painelDados = new javax.swing.JPanel();
        txtNome = new javax.swing.JLabel();
        lblNome = new javax.swing.JTextField();
        txtNasci = new javax.swing.JLabel();
        lblNasci = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        combSexo = new javax.swing.JComboBox<>();
        txtCivil = new javax.swing.JLabel();
        combEstadoCivil = new javax.swing.JComboBox<>();
        txtProfi = new javax.swing.JLabel();
        lblProfi = new javax.swing.JTextField();
        txtCpf = new javax.swing.JLabel();
        lblCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JLabel();
        lblRg = new javax.swing.JTextField();
        txtUf = new javax.swing.JLabel();
        combUfRg = new javax.swing.JComboBox<>();
        txtTel = new javax.swing.JLabel();
        lblTel = new javax.swing.JTextField();
        txtEnd = new javax.swing.JLabel();
        lblEnd = new javax.swing.JTextField();
        txtNum = new javax.swing.JLabel();
        lblNumCasa = new javax.swing.JTextField();
        txtCompl = new javax.swing.JLabel();
        lblCompl = new javax.swing.JTextField();
        txtBairro = new javax.swing.JLabel();
        lblBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JLabel();
        lblCidade = new javax.swing.JTextField();
        txtCep = new javax.swing.JLabel();
        lblCep = new javax.swing.JTextField();
        txtUfC = new javax.swing.JLabel();
        combUfC = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        txtProf = new javax.swing.JLabel();
        lblProf = new javax.swing.JTextField();
        txtQuestionario = new javax.swing.JLabel();
        txtBebe = new javax.swing.JLabel();
        combBebe = new javax.swing.JComboBox<>();
        txtFuma = new javax.swing.JLabel();
        combFuma = new javax.swing.JComboBox<>();
        txtTreinou = new javax.swing.JLabel();
        combTreinou = new javax.swing.JComboBox<>();
        txtP1 = new javax.swing.JLabel();
        lblP1 = new javax.swing.JTextField();
        txtP2 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JTextField();
        txtP3 = new javax.swing.JLabel();
        lblP3 = new javax.swing.JTextField();
        txtMod = new javax.swing.JLabel();
        painelModalidades = new javax.swing.JPanel();
        checkHipertrofia = new javax.swing.JCheckBox();
        checkAero = new javax.swing.JCheckBox();
        checkNatacao = new javax.swing.JCheckBox();
        checkBox = new javax.swing.JCheckBox();
        checkZumba = new javax.swing.JCheckBox();
        checkDanca = new javax.swing.JCheckBox();
        checkBale = new javax.swing.JCheckBox();
        checkFisio = new javax.swing.JCheckBox();
        checkCross = new javax.swing.JCheckBox();
        checkIoga = new javax.swing.JCheckBox();
        checkTenis = new javax.swing.JCheckBox();
        checkBasquete = new javax.swing.JCheckBox();
        checkFuncional = new javax.swing.JCheckBox();
        checkIntenso = new javax.swing.JCheckBox();
        checkVolei = new javax.swing.JCheckBox();
        checkBallet = new javax.swing.JCheckBox();
        lblFoto = new javax.swing.JPanel();
        txtFoto = new javax.swing.JLabel();
        painelPerimetria = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtAbdomem = new javax.swing.JLabel();
        lblAbdomem = new javax.swing.JTextField();
        txtAnteBracoE = new javax.swing.JLabel();
        lblAnteBracoE = new javax.swing.JTextField();
        txtAnteBracoD = new javax.swing.JLabel();
        lblAnteBracoD = new javax.swing.JTextField();
        txtBracoEsqRelaxado = new javax.swing.JLabel();
        lblBracoEsqRelaxado = new javax.swing.JTextField();
        txtBracoEsqContraido = new javax.swing.JLabel();
        lblBracoEsqContraido = new javax.swing.JTextField();
        txtBracoDirContraido = new javax.swing.JLabel();
        lblBracoDirContraido = new javax.swing.JTextField();
        txtBracoDirRelaxado = new javax.swing.JLabel();
        lblBracoDirRelaxado = new javax.swing.JTextField();
        txtCintura = new javax.swing.JLabel();
        lblCintura = new javax.swing.JTextField();
        txtCinturaEscapular = new javax.swing.JLabel();
        lblCinturaEscapular = new javax.swing.JTextField();
        txtCoxaEsq = new javax.swing.JLabel();
        lblCoxaEsq = new javax.swing.JTextField();
        txtCoxaDir = new javax.swing.JLabel();
        lblCoxaDir = new javax.swing.JTextField();
        txtOmbro = new javax.swing.JLabel();
        lblOmbro = new javax.swing.JTextField();
        txtPanturrilhaEsq = new javax.swing.JLabel();
        lblPanturrilhaEsq = new javax.swing.JTextField();
        txtPanturrilhaDir = new javax.swing.JLabel();
        lblPanturrilhaDir = new javax.swing.JTextField();
        txtQuadril = new javax.swing.JLabel();
        lblQuadril = new javax.swing.JTextField();
        txtPescoco = new javax.swing.JLabel();
        lblPescoco = new javax.swing.JTextField();
        txtPeso = new javax.swing.JLabel();
        lblPeso = new javax.swing.JTextField();
        txtPeso1 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JLabel();
        lblAltura = new javax.swing.JTextField();
        txtAltura1 = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblObservacoes = new javax.swing.JTextArea();
        txt = new javax.swing.JLabel();
        painelTreino = new javax.swing.JPanel();
        txtNomeAlunoTreino = new javax.swing.JLabel();
        lblNomeAlunoTreino = new javax.swing.JLabel();
        lblNomeProfessorTreino = new javax.swing.JLabel();
        txtNomeProfTreino = new javax.swing.JLabel();
        txtDataInicioTreino = new javax.swing.JLabel();
        lblDataInicioTreino = new javax.swing.JTextField();
        txtDataTermTreino = new javax.swing.JLabel();
        lblDataTermTreino = new javax.swing.JTextField();
        painelPreTreino = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        boxEsteira = new javax.swing.JCheckBox();
        lblEsteira = new javax.swing.JTextField();
        combEsteira = new javax.swing.JComboBox<>();
        boxBike = new javax.swing.JCheckBox();
        lblBike = new javax.swing.JTextField();
        combBike = new javax.swing.JComboBox<>();
        boxAbdomen = new javax.swing.JCheckBox();
        lblAbdomen = new javax.swing.JTextField();
        combAbdomen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        abaTreinoA = new javax.swing.JPanel();
        painelPeito = new javax.swing.JPanel();
        boxSupinoReto = new javax.swing.JCheckBox();
        boxSupinoInclinado = new javax.swing.JCheckBox();
        boxCanadense = new javax.swing.JCheckBox();
        boxPeck = new javax.swing.JCheckBox();
        boxCrucifixo = new javax.swing.JCheckBox();
        boxFlexao = new javax.swing.JCheckBox();
        painelCostas = new javax.swing.JPanel();
        boxPuCostas = new javax.swing.JCheckBox();
        boxPuFrente = new javax.swing.JCheckBox();
        boxPuFrenteI = new javax.swing.JCheckBox();
        boxRemadaB = new javax.swing.JCheckBox();
        boxRemadaUni = new javax.swing.JCheckBox();
        boxVoador = new javax.swing.JCheckBox();
        painelOmbro = new javax.swing.JPanel();
        boxEleLateral = new javax.swing.JCheckBox();
        boxEleFrontal = new javax.swing.JCheckBox();
        boxRotacaoI = new javax.swing.JCheckBox();
        boxRotacaoE = new javax.swing.JCheckBox();
        boxDesComBarra = new javax.swing.JCheckBox();
        boxCrossI = new javax.swing.JCheckBox();
        BoxRemAlta = new javax.swing.JCheckBox();
        boxEncOmbro = new javax.swing.JCheckBox();
        painelBiceps = new javax.swing.JPanel();
        boxRoscaD = new javax.swing.JCheckBox();
        boxScoty = new javax.swing.JCheckBox();
        boxMartelo = new javax.swing.JCheckBox();
        boxRoscaI = new javax.swing.JCheckBox();
        box21 = new javax.swing.JCheckBox();
        boxRoscaA = new javax.swing.JCheckBox();
        BoscaRoscaC = new javax.swing.JCheckBox();
        painelTriceps = new javax.swing.JPanel();
        boxTesta = new javax.swing.JCheckBox();
        boxPulley = new javax.swing.JCheckBox();
        boxCrossV = new javax.swing.JCheckBox();
        boxCrossBarraR = new javax.swing.JCheckBox();
        boxFundos = new javax.swing.JCheckBox();
        boxTriSupinado = new javax.swing.JCheckBox();
        boxExtTriceps = new javax.swing.JCheckBox();
        painelQuadriceps = new javax.swing.JPanel();
        boxAga = new javax.swing.JCheckBox();
        boxAgaF = new javax.swing.JCheckBox();
        boxAgaH = new javax.swing.JCheckBox();
        boxPrensa = new javax.swing.JCheckBox();
        boxAfundoQ = new javax.swing.JCheckBox();
        boxAfuncoB = new javax.swing.JCheckBox();
        boxExtensora = new javax.swing.JCheckBox();
        painelGluteo = new javax.swing.JPanel();
        boxElevQuadril = new javax.swing.JCheckBox();
        boxAgaHalter = new javax.swing.JCheckBox();
        boxKick = new javax.swing.JCheckBox();
        boxAbdPerna = new javax.swing.JCheckBox();
        boxAfundoG = new javax.swing.JCheckBox();
        boxAgaLivre = new javax.swing.JCheckBox();
        boxAgaSumo = new javax.swing.JCheckBox();
        boxStiff = new javax.swing.JCheckBox();
        painelPanturrilha = new javax.swing.JPanel();
        boxEmPe = new javax.swing.JCheckBox();
        boxPantLeg = new javax.swing.JCheckBox();
        boxEmPeU = new javax.swing.JCheckBox();
        boxPanSentado = new javax.swing.JCheckBox();
        boxPanBarra = new javax.swing.JCheckBox();
        boxDonkey = new javax.swing.JCheckBox();
        boxPanSalto = new javax.swing.JCheckBox();
        boxPanUni = new javax.swing.JCheckBox();
        abaTreinoB = new javax.swing.JPanel();
        painelPeito1 = new javax.swing.JPanel();
        boxSupinoReto1 = new javax.swing.JCheckBox();
        boxSupinoInclinado1 = new javax.swing.JCheckBox();
        boxCanadense1 = new javax.swing.JCheckBox();
        boxPeck1 = new javax.swing.JCheckBox();
        boxCrucifixo1 = new javax.swing.JCheckBox();
        boxFlexao1 = new javax.swing.JCheckBox();
        painelCostas1 = new javax.swing.JPanel();
        boxPuCostas1 = new javax.swing.JCheckBox();
        boxPuFrente1 = new javax.swing.JCheckBox();
        boxPuFrenteI1 = new javax.swing.JCheckBox();
        boxRemadaB1 = new javax.swing.JCheckBox();
        boxRemadaUni1 = new javax.swing.JCheckBox();
        boxVoador1 = new javax.swing.JCheckBox();
        painelOmbro1 = new javax.swing.JPanel();
        boxEleLateral1 = new javax.swing.JCheckBox();
        boxEleFrontal1 = new javax.swing.JCheckBox();
        boxRotacaoI1 = new javax.swing.JCheckBox();
        boxRotacaoE1 = new javax.swing.JCheckBox();
        boxDesComBarra1 = new javax.swing.JCheckBox();
        boxCrossI1 = new javax.swing.JCheckBox();
        BoxRemAlta1 = new javax.swing.JCheckBox();
        boxEncOmbro1 = new javax.swing.JCheckBox();
        painelBiceps1 = new javax.swing.JPanel();
        boxRoscaD1 = new javax.swing.JCheckBox();
        boxScoty1 = new javax.swing.JCheckBox();
        boxMartelo1 = new javax.swing.JCheckBox();
        boxRoscaI1 = new javax.swing.JCheckBox();
        box22 = new javax.swing.JCheckBox();
        boxRoscaA1 = new javax.swing.JCheckBox();
        BoscaRoscaC1 = new javax.swing.JCheckBox();
        painelTriceps1 = new javax.swing.JPanel();
        boxTesta1 = new javax.swing.JCheckBox();
        boxPulley1 = new javax.swing.JCheckBox();
        boxCrossV1 = new javax.swing.JCheckBox();
        boxCrossBarraR1 = new javax.swing.JCheckBox();
        boxFundos1 = new javax.swing.JCheckBox();
        boxTriSupinado1 = new javax.swing.JCheckBox();
        boxExtTriceps1 = new javax.swing.JCheckBox();
        painelQuadriceps1 = new javax.swing.JPanel();
        boxAga1 = new javax.swing.JCheckBox();
        boxAgaF1 = new javax.swing.JCheckBox();
        boxAgaH1 = new javax.swing.JCheckBox();
        boxPrensa1 = new javax.swing.JCheckBox();
        boxAfundoQ1 = new javax.swing.JCheckBox();
        boxAfuncoB1 = new javax.swing.JCheckBox();
        boxExtensora1 = new javax.swing.JCheckBox();
        painelGluteo1 = new javax.swing.JPanel();
        boxElevQuadril1 = new javax.swing.JCheckBox();
        boxAgaHalter1 = new javax.swing.JCheckBox();
        boxKick1 = new javax.swing.JCheckBox();
        boxAbdPerna1 = new javax.swing.JCheckBox();
        boxAfundoG1 = new javax.swing.JCheckBox();
        boxAgaLivre1 = new javax.swing.JCheckBox();
        boxAgaSumo1 = new javax.swing.JCheckBox();
        boxStiff1 = new javax.swing.JCheckBox();
        painelPanturrilha1 = new javax.swing.JPanel();
        boxEmPe1 = new javax.swing.JCheckBox();
        boxPantLeg1 = new javax.swing.JCheckBox();
        boxEmPeU1 = new javax.swing.JCheckBox();
        boxPanSentado1 = new javax.swing.JCheckBox();
        boxPanBarra1 = new javax.swing.JCheckBox();
        boxDonkey1 = new javax.swing.JCheckBox();
        boxPanSalto1 = new javax.swing.JCheckBox();
        boxPanUni1 = new javax.swing.JCheckBox();
        abaTreinoC = new javax.swing.JPanel();
        painelPeito2 = new javax.swing.JPanel();
        boxSupinoReto2 = new javax.swing.JCheckBox();
        boxSupinoInclinado2 = new javax.swing.JCheckBox();
        boxCanadense2 = new javax.swing.JCheckBox();
        boxPeck2 = new javax.swing.JCheckBox();
        boxCrucifixo2 = new javax.swing.JCheckBox();
        boxFlexao2 = new javax.swing.JCheckBox();
        painelCostas2 = new javax.swing.JPanel();
        boxPuCostas2 = new javax.swing.JCheckBox();
        boxPuFrente2 = new javax.swing.JCheckBox();
        boxPuFrenteI2 = new javax.swing.JCheckBox();
        boxRemadaB2 = new javax.swing.JCheckBox();
        boxRemadaUni2 = new javax.swing.JCheckBox();
        boxVoador2 = new javax.swing.JCheckBox();
        painelOmbro2 = new javax.swing.JPanel();
        boxEleLateral2 = new javax.swing.JCheckBox();
        boxEleFrontal2 = new javax.swing.JCheckBox();
        boxRotacaoI2 = new javax.swing.JCheckBox();
        boxRotacaoE2 = new javax.swing.JCheckBox();
        boxDesComBarra2 = new javax.swing.JCheckBox();
        boxCrossI2 = new javax.swing.JCheckBox();
        BoxRemAlta2 = new javax.swing.JCheckBox();
        boxEncOmbro2 = new javax.swing.JCheckBox();
        painelBiceps2 = new javax.swing.JPanel();
        boxRoscaD2 = new javax.swing.JCheckBox();
        boxScoty2 = new javax.swing.JCheckBox();
        boxMartelo2 = new javax.swing.JCheckBox();
        boxRoscaI2 = new javax.swing.JCheckBox();
        box23 = new javax.swing.JCheckBox();
        boxRoscaA2 = new javax.swing.JCheckBox();
        BoscaRoscaC2 = new javax.swing.JCheckBox();
        painelTriceps2 = new javax.swing.JPanel();
        boxTesta2 = new javax.swing.JCheckBox();
        boxPulley2 = new javax.swing.JCheckBox();
        boxCrossV2 = new javax.swing.JCheckBox();
        boxCrossBarraR2 = new javax.swing.JCheckBox();
        boxFundos2 = new javax.swing.JCheckBox();
        boxTriSupinado2 = new javax.swing.JCheckBox();
        boxExtTriceps2 = new javax.swing.JCheckBox();
        painelQuadriceps2 = new javax.swing.JPanel();
        boxAga2 = new javax.swing.JCheckBox();
        boxAgaF2 = new javax.swing.JCheckBox();
        boxAgaH2 = new javax.swing.JCheckBox();
        boxPrensa2 = new javax.swing.JCheckBox();
        boxAfundoQ2 = new javax.swing.JCheckBox();
        boxAfuncoB2 = new javax.swing.JCheckBox();
        boxExtensora2 = new javax.swing.JCheckBox();
        painelGluteo2 = new javax.swing.JPanel();
        boxElevQuadril2 = new javax.swing.JCheckBox();
        boxAgaHalter2 = new javax.swing.JCheckBox();
        boxKick2 = new javax.swing.JCheckBox();
        boxAbdPerna2 = new javax.swing.JCheckBox();
        boxAfundoG2 = new javax.swing.JCheckBox();
        boxAgaLivre2 = new javax.swing.JCheckBox();
        boxAgaSumo2 = new javax.swing.JCheckBox();
        boxStiff2 = new javax.swing.JCheckBox();
        painelPanturrilha2 = new javax.swing.JPanel();
        boxEmPe2 = new javax.swing.JCheckBox();
        boxPantLeg2 = new javax.swing.JCheckBox();
        boxEmPeU2 = new javax.swing.JCheckBox();
        boxPanSentado2 = new javax.swing.JCheckBox();
        boxPanBarra2 = new javax.swing.JCheckBox();
        boxDonkey2 = new javax.swing.JCheckBox();
        boxPanSalto2 = new javax.swing.JCheckBox();
        boxPanUni2 = new javax.swing.JCheckBox();
        painelPosTreino = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        boxEsteiraP = new javax.swing.JCheckBox();
        boxBikeP = new javax.swing.JCheckBox();
        boxAbdomenP = new javax.swing.JCheckBox();
        lblBikeP = new javax.swing.JTextField();
        lblEsteiraP = new javax.swing.JTextField();
        lblAbdomenP = new javax.swing.JTextField();
        combEsteiraP = new javax.swing.JComboBox<>();
        combBikeP = new javax.swing.JComboBox<>();
        compAbdomenP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro/Alteração/Exclusão alunos");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPesquisa.setText("PESQUISAR");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar2.setText("CANCELAR");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(595, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisa)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar2)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        paletas.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtNome.setText("Nome:");

        lblNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNomeActionPerformed(evt);
            }
        });

        txtNasci.setText("Data nasc:");

        lblNasci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNasciActionPerformed(evt);
            }
        });

        txtCodigo.setText("Código :");

        lblCodigo.setText("CÓD");

        lblStatus.setText("ATIVO ??");

        txtStatus.setText("Status :");

        txtSexo.setText("Sexo:");

        combSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        txtCivil.setText("Estado civil:");

        combEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorsiado" }));

        txtProfi.setText("Profissão:");

        txtCpf.setText("CPF:");

        txtRg.setText("RG:");

        txtUf.setText("UF - RG:");

        combUfRg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AF", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "SC", "SE", "SP", "TO" }));

        txtTel.setText("Telefone:");

        txtEnd.setText("Endereço:");

        txtNum.setText("Número:");

        txtCompl.setText("Complemento:");

        txtBairro.setText("Bairro:");

        txtCidade.setText("Cidade:");

        txtCep.setText("CEP:");

        txtUfC.setText("UF:");

        combUfC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AF", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "SC", "SE", "SP", "TO" }));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtProf.setText("Professor Responsável:");

        txtQuestionario.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtQuestionario.setText("Questionário");

        txtBebe.setText("Bebe:");

        combBebe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtFuma.setText("Fuma:");

        combFuma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtTreinou.setText("Já treinou ?");

        combTreinou.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtP1.setText("Como conheceu a academia ?");

        txtP2.setText("Gosta de treinar ou é por saúde ?");

        txtP3.setText("Quanto tempo ?");

        txtMod.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtMod.setText("Modalidade desejada");

        checkHipertrofia.setText("Hipertrofia");

        checkAero.setText("Aeróbico");

        checkNatacao.setText("Natação");

        checkBox.setText("Box");

        checkZumba.setText("Zumba");

        checkDanca.setText("Dança");

        checkBale.setText("Ballet");

        checkFisio.setText("Fisio");

        checkCross.setText("Cross Fit");

        checkIoga.setText("Ioga");

        checkTenis.setText("Tênis");

        checkBasquete.setText("Basquete");

        checkFuncional.setText("Treinamento funcional");

        checkIntenso.setText("Treinamento intervalado de alta intensidade");

        checkVolei.setText("Volei");

        checkBallet.setText("Ballet Fitness");

        javax.swing.GroupLayout painelModalidadesLayout = new javax.swing.GroupLayout(painelModalidades);
        painelModalidades.setLayout(painelModalidadesLayout);
        painelModalidadesLayout.setHorizontalGroup(
            painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModalidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkHipertrofia)
                    .addComponent(checkAero)
                    .addComponent(checkNatacao)
                    .addComponent(checkBox))
                .addGap(18, 18, 18)
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFisio)
                    .addComponent(checkBale)
                    .addComponent(checkDanca)
                    .addComponent(checkZumba))
                .addGap(18, 18, 18)
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkCross)
                    .addComponent(checkIoga)
                    .addComponent(checkTenis)
                    .addComponent(checkBasquete))
                .addGap(18, 18, 18)
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBallet)
                    .addComponent(checkVolei)
                    .addComponent(checkIntenso)
                    .addComponent(checkFuncional))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        painelModalidadesLayout.setVerticalGroup(
            painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModalidadesLayout.createSequentialGroup()
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModalidadesLayout.createSequentialGroup()
                        .addComponent(checkHipertrofia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkAero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkNatacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBox))
                    .addGroup(painelModalidadesLayout.createSequentialGroup()
                        .addComponent(checkZumba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkDanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkFisio))
                    .addGroup(painelModalidadesLayout.createSequentialGroup()
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkCross)
                            .addComponent(checkFuncional))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkIoga)
                            .addComponent(checkIntenso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkTenis)
                            .addComponent(checkVolei))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBasquete)
                            .addComponent(checkBallet))))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProf, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtFuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combFuma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblP2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTreinou)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combTreinou, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblP3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtBebe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combBebe, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtQuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txtP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblP1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelModalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProf)
                    .addComponent(lblProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuestionario)
                    .addComponent(txtMod))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBebe)
                            .addComponent(combBebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP1)
                            .addComponent(lblP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFuma)
                            .addComponent(combFuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP2)
                            .addComponent(lblP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTreinou)
                            .addComponent(combTreinou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP3)
                            .addComponent(lblP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(painelModalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFoto.setText("FOTO");

        javax.swing.GroupLayout lblFotoLayout = new javax.swing.GroupLayout(lblFoto);
        lblFoto.setLayout(lblFotoLayout);
        lblFotoLayout.setHorizontalGroup(
            lblFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblFotoLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(txtFoto)
                .addGap(85, 85, 85))
        );
        lblFotoLayout.setVerticalGroup(
            lblFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblFotoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(txtFoto)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(txtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNasci)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(txtBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUfC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combUfC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosLayout.createSequentialGroup()
                                    .addComponent(txtEnd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCompl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCompl))
                                .addGroup(painelDadosLayout.createSequentialGroup()
                                    .addComponent(txtProfi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblProfi, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combUfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(txtCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome)
                            .addComponent(txtNasci)
                            .addComponent(lblNasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo)
                            .addComponent(combSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCivil)
                            .addComponent(combEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProfi)
                            .addComponent(lblProfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg)
                            .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUf)
                            .addComponent(combUfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel)
                            .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnd)
                            .addComponent(lblEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum)
                            .addComponent(lblNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompl)
                            .addComponent(lblCompl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBairro)
                            .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade)
                            .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep)
                            .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUfC)
                            .addComponent(combUfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStatus)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        paletas.addTab("Dados cadastrais", painelDados);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAbdomem.setText("Abdomem:");

        lblAbdomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAbdomemActionPerformed(evt);
            }
        });

        txtAnteBracoE.setText("Antebraço Esq:");

        lblAnteBracoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAnteBracoEActionPerformed(evt);
            }
        });

        txtAnteBracoD.setText("Antebraço Dir:");

        lblAnteBracoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAnteBracoDActionPerformed(evt);
            }
        });

        txtBracoEsqRelaxado.setText("Braço Esq Relaxado:");

        lblBracoEsqRelaxado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBracoEsqRelaxadoActionPerformed(evt);
            }
        });

        txtBracoEsqContraido.setText("Braço Esq Contraido:");

        lblBracoEsqContraido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBracoEsqContraidoActionPerformed(evt);
            }
        });

        txtBracoDirContraido.setText("Braço Dir Contraido:");

        lblBracoDirContraido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBracoDirContraidoActionPerformed(evt);
            }
        });

        txtBracoDirRelaxado.setText("Braço Dir Relaxado:");

        lblBracoDirRelaxado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBracoDirRelaxadoActionPerformed(evt);
            }
        });

        txtCintura.setText("Cintura:");

        lblCintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCinturaActionPerformed(evt);
            }
        });

        txtCinturaEscapular.setText("Cintura Escapular: ");

        lblCinturaEscapular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCinturaEscapularActionPerformed(evt);
            }
        });

        txtCoxaEsq.setText("Coxa Esq:");

        lblCoxaEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCoxaEsqActionPerformed(evt);
            }
        });

        txtCoxaDir.setText("Coxa Dir:");

        lblCoxaDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCoxaDirActionPerformed(evt);
            }
        });

        txtOmbro.setText("Ombro:");

        lblOmbro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblOmbroActionPerformed(evt);
            }
        });

        txtPanturrilhaEsq.setText("Panturrilha Esq:");

        lblPanturrilhaEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPanturrilhaEsqActionPerformed(evt);
            }
        });

        txtPanturrilhaDir.setText("Panturrilha Dir:");

        lblPanturrilhaDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPanturrilhaDirActionPerformed(evt);
            }
        });

        txtQuadril.setText("Quadril:");

        lblQuadril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblQuadrilActionPerformed(evt);
            }
        });

        txtPescoco.setText("Pescoço:");

        lblPescoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPescocoActionPerformed(evt);
            }
        });

        txtPeso.setText("Peso:");

        lblPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPesoActionPerformed(evt);
            }
        });

        txtPeso1.setText("Kg");

        txtAltura.setText("Altura:");

        lblAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAlturaActionPerformed(evt);
            }
        });

        txtAltura1.setText("Metros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtAbdomem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAbdomem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnteBracoE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnteBracoE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnteBracoD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnteBracoD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBracoEsqRelaxado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBracoEsqRelaxado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBracoEsqContraido)
                                .addGap(2, 2, 2)
                                .addComponent(lblBracoEsqContraido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBracoDirRelaxado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBracoDirRelaxado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBracoDirContraido)
                                .addGap(2, 2, 2)
                                .addComponent(lblBracoDirContraido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCintura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCinturaEscapular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCinturaEscapular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCoxaEsq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCoxaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCoxaDir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCoxaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOmbro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPanturrilhaEsq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPanturrilhaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPanturrilhaDir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPanturrilhaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuadril)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPescoco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPescoco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(txtPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbdomem)
                    .addComponent(lblAbdomem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnteBracoE)
                    .addComponent(lblAnteBracoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnteBracoD)
                    .addComponent(lblAnteBracoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBracoEsqRelaxado)
                    .addComponent(lblBracoEsqRelaxado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBracoEsqContraido)
                    .addComponent(lblBracoEsqContraido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBracoDirRelaxado)
                    .addComponent(lblBracoDirRelaxado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBracoDirContraido)
                    .addComponent(lblBracoDirContraido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCintura)
                    .addComponent(lblCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCinturaEscapular)
                    .addComponent(lblCinturaEscapular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOmbro)
                    .addComponent(lblOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPanturrilhaEsq)
                    .addComponent(lblPanturrilhaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPanturrilhaDir)
                    .addComponent(lblPanturrilhaDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuadril)
                    .addComponent(lblQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPescoco)
                    .addComponent(lblPescoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoxaEsq)
                    .addComponent(lblCoxaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoxaDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoxaDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso)
                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso1)
                    .addComponent(txtAltura)
                    .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura1))
                .addContainerGap())
        );

        txtObservacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtObservacoes.setText("OBSERVAÇÕES");

        lblObservacoes.setColumns(20);
        lblObservacoes.setRows(5);
        jScrollPane1.setViewportView(lblObservacoes);

        txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt.setText("Medidas em centímetros");

        javax.swing.GroupLayout painelPerimetriaLayout = new javax.swing.GroupLayout(painelPerimetria);
        painelPerimetria.setLayout(painelPerimetriaLayout);
        painelPerimetriaLayout.setHorizontalGroup(
            painelPerimetriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPerimetriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPerimetriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacoes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        painelPerimetriaLayout.setVerticalGroup(
            painelPerimetriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPerimetriaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(txtObservacoes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        paletas.addTab("Mapeamento corporal", painelPerimetria);

        txtNomeAlunoTreino.setText("Nome:");

        lblNomeAlunoTreino.setText("NOME DO ALUNO");

        lblNomeProfessorTreino.setText("NOME DO PROFESSOR");

        txtNomeProfTreino.setText("Professor:");

        txtDataInicioTreino.setText("Data início treino:");

        txtDataTermTreino.setText("Data término treino:");

        painelPreTreino.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Exercício/Tempo");

        boxEsteira.setText("Esteira");
        boxEsteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEsteiraActionPerformed(evt);
            }
        });

        combEsteira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas" }));

        boxBike.setText("Bicicleta");

        combBike.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas" }));

        boxAbdomen.setText("Abdomem");

        combAbdomen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas", "Repetições" }));

        javax.swing.GroupLayout painelPreTreinoLayout = new javax.swing.GroupLayout(painelPreTreino);
        painelPreTreino.setLayout(painelPreTreinoLayout);
        painelPreTreinoLayout.setHorizontalGroup(
            painelPreTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPreTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPreTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(painelPreTreinoLayout.createSequentialGroup()
                        .addComponent(boxEsteira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxBike)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBike, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combBike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxAbdomen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPreTreinoLayout.setVerticalGroup(
            painelPreTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPreTreinoLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPreTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEsteira)
                    .addComponent(lblEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combEsteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxBike)
                    .addComponent(lblBike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combBike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAbdomen)
                    .addComponent(lblAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pré treino");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Pós treino");

        painelPeito.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto.setText("Supino Reto");

        boxSupinoInclinado.setText("Supino Inclinado");

        boxCanadense.setText("Supino Declinado");

        boxPeck.setText("Peck Deck");

        boxCrucifixo.setText("Crucifixo");

        boxFlexao.setText("Flexão");

        javax.swing.GroupLayout painelPeitoLayout = new javax.swing.GroupLayout(painelPeito);
        painelPeito.setLayout(painelPeitoLayout);
        painelPeitoLayout.setHorizontalGroup(
            painelPeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeitoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto)
                    .addComponent(boxSupinoInclinado)
                    .addComponent(boxCanadense)
                    .addComponent(boxPeck)
                    .addComponent(boxCrucifixo)
                    .addComponent(boxFlexao)))
        );
        painelPeitoLayout.setVerticalGroup(
            painelPeitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas.setText("Puxada Costas");

        boxPuFrente.setText("Puxada Frente");

        boxPuFrenteI.setText("Puxada Frente Inv");

        boxRemadaB.setText("Remada Baixa");
        boxRemadaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaBActionPerformed(evt);
            }
        });

        boxRemadaUni.setText("Remada Unilateral");

        boxVoador.setText("Voador");

        javax.swing.GroupLayout painelCostasLayout = new javax.swing.GroupLayout(painelCostas);
        painelCostas.setLayout(painelCostasLayout);
        painelCostasLayout.setHorizontalGroup(
            painelCostasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas)
                    .addComponent(boxPuFrente)
                    .addComponent(boxPuFrenteI)
                    .addComponent(boxRemadaB)
                    .addComponent(boxRemadaUni)
                    .addComponent(boxVoador))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostasLayout.setVerticalGroup(
            painelCostasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral.setText("Elevação Lat");

        boxEleFrontal.setText("Elevação Front");

        boxRotacaoI.setText("Rotação Interna");

        boxRotacaoE.setText("Rotação Externa");

        boxDesComBarra.setText("Desenv. c/ Barra");

        boxCrossI.setText("Cross Invertido");

        BoxRemAlta.setText("Remada Alta");

        boxEncOmbro.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbroLayout = new javax.swing.GroupLayout(painelOmbro);
        painelOmbro.setLayout(painelOmbroLayout);
        painelOmbroLayout.setHorizontalGroup(
            painelOmbroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral)
                    .addComponent(boxEleFrontal)
                    .addComponent(boxRotacaoI)
                    .addComponent(boxRotacaoE)
                    .addComponent(boxDesComBarra)
                    .addComponent(boxCrossI)
                    .addComponent(BoxRemAlta)
                    .addComponent(boxEncOmbro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbroLayout.setVerticalGroup(
            painelOmbroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD.setText("Rosca Direta");

        boxScoty.setText("Banco Scoty");

        boxMartelo.setText("Martelinho");

        boxRoscaI.setText("Rosca Indireta");

        box21.setText("Rosca 21");

        boxRoscaA.setText("Rosca Alternada");

        BoscaRoscaC.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBicepsLayout = new javax.swing.GroupLayout(painelBiceps);
        painelBiceps.setLayout(painelBicepsLayout);
        painelBicepsLayout.setHorizontalGroup(
            painelBicepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBicepsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBicepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD)
                    .addComponent(boxScoty)
                    .addComponent(boxMartelo)
                    .addComponent(boxRoscaI)
                    .addComponent(box21)
                    .addComponent(boxRoscaA)
                    .addComponent(BoscaRoscaC))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBicepsLayout.setVerticalGroup(
            painelBicepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBicepsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta.setText("Testa");

        boxPulley.setText("Pulley");

        boxCrossV.setText("Cross Barra V");
        boxCrossV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossVActionPerformed(evt);
            }
        });

        boxCrossBarraR.setText("Cross Barra Reta");

        boxFundos.setText("Fundos em Máquina");

        boxTriSupinado.setText("Supino Pega Junta");

        boxExtTriceps.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTricepsLayout = new javax.swing.GroupLayout(painelTriceps);
        painelTriceps.setLayout(painelTricepsLayout);
        painelTricepsLayout.setHorizontalGroup(
            painelTricepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTricepsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTricepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV)
                    .addComponent(boxTesta)
                    .addComponent(boxPulley)
                    .addComponent(boxCrossBarraR)
                    .addComponent(boxFundos)
                    .addComponent(boxTriSupinado)
                    .addComponent(boxExtTriceps))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTricepsLayout.setVerticalGroup(
            painelTricepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTricepsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga.setText("Agachamento");

        boxAgaF.setText("Agachamento Front");

        boxAgaH.setText("Agachamento Hack");

        boxPrensa.setText("Prensa 90º");

        boxAfundoQ.setText("Afundo");

        boxAfuncoB.setText("Afundo c/ Barra");

        boxExtensora.setText("Extensora");

        javax.swing.GroupLayout painelQuadricepsLayout = new javax.swing.GroupLayout(painelQuadriceps);
        painelQuadriceps.setLayout(painelQuadricepsLayout);
        painelQuadricepsLayout.setHorizontalGroup(
            painelQuadricepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadricepsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadricepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga)
                    .addComponent(boxAgaF)
                    .addComponent(boxAgaH)
                    .addComponent(boxPrensa)
                    .addComponent(boxAfundoQ)
                    .addComponent(boxAfuncoB)
                    .addComponent(boxExtensora))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadricepsLayout.setVerticalGroup(
            painelQuadricepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadricepsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril.setText("Ele. Quadril");

        boxAgaHalter.setText("Aga. c/ Halter");

        boxKick.setText("Kickbacks");

        boxAbdPerna.setText("Abd. de Perna");

        boxAfundoG.setText("Afundo");

        boxAgaLivre.setText("Aga. Livre");

        boxAgaSumo.setText("Aga. Sumo");

        boxStiff.setText("Stiff");

        javax.swing.GroupLayout painelGluteoLayout = new javax.swing.GroupLayout(painelGluteo);
        painelGluteo.setLayout(painelGluteoLayout);
        painelGluteoLayout.setHorizontalGroup(
            painelGluteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril)
                    .addComponent(boxAgaHalter)
                    .addComponent(boxKick)
                    .addComponent(boxAbdPerna)
                    .addComponent(boxAfundoG)
                    .addComponent(boxAgaLivre)
                    .addComponent(boxAgaSumo)
                    .addComponent(boxStiff))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteoLayout.setVerticalGroup(
            painelGluteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe.setText("Em pé");

        boxPantLeg.setText("Leg Press");

        boxEmPeU.setText("Em pé Uni");

        boxPanSentado.setText("Ele. Sentado");

        boxPanBarra.setText("C/ Barra");

        boxDonkey.setText("Ele. Donkey");

        boxPanSalto.setText("C/ Salto");

        boxPanUni.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilhaLayout = new javax.swing.GroupLayout(painelPanturrilha);
        painelPanturrilha.setLayout(painelPanturrilhaLayout);
        painelPanturrilhaLayout.setHorizontalGroup(
            painelPanturrilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe)
                    .addComponent(boxPantLeg)
                    .addComponent(boxEmPeU)
                    .addComponent(boxPanSentado)
                    .addComponent(boxPanBarra)
                    .addComponent(boxDonkey)
                    .addComponent(boxPanSalto)
                    .addComponent(boxPanUni))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilhaLayout.setVerticalGroup(
            painelPanturrilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaTreinoALayout = new javax.swing.GroupLayout(abaTreinoA);
        abaTreinoA.setLayout(abaTreinoALayout);
        abaTreinoALayout.setHorizontalGroup(
            abaTreinoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTreinoALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaTreinoALayout.setVerticalGroup(
            abaTreinoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaTreinoALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaTreinoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino A", abaTreinoA);

        painelPeito1.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto1.setText("Supino Reto");

        boxSupinoInclinado1.setText("Supino Inclinado");

        boxCanadense1.setText("Supino Declinado");

        boxPeck1.setText("Peck Deck");

        boxCrucifixo1.setText("Crucifixo");

        boxFlexao1.setText("Flexão");

        javax.swing.GroupLayout painelPeito1Layout = new javax.swing.GroupLayout(painelPeito1);
        painelPeito1.setLayout(painelPeito1Layout);
        painelPeito1Layout.setHorizontalGroup(
            painelPeito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto1)
                    .addComponent(boxSupinoInclinado1)
                    .addComponent(boxCanadense1)
                    .addComponent(boxPeck1)
                    .addComponent(boxCrucifixo1)
                    .addComponent(boxFlexao1)))
        );
        painelPeito1Layout.setVerticalGroup(
            painelPeito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas1.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas1.setText("Puxada Costas");

        boxPuFrente1.setText("Puxada Frente");

        boxPuFrenteI1.setText("Puxada Frente Inv");

        boxRemadaB1.setText("Remada Baixa");
        boxRemadaB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB1ActionPerformed(evt);
            }
        });

        boxRemadaUni1.setText("Remada Unilateral");

        boxVoador1.setText("Voador");

        javax.swing.GroupLayout painelCostas1Layout = new javax.swing.GroupLayout(painelCostas1);
        painelCostas1.setLayout(painelCostas1Layout);
        painelCostas1Layout.setHorizontalGroup(
            painelCostas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas1)
                    .addComponent(boxPuFrente1)
                    .addComponent(boxPuFrenteI1)
                    .addComponent(boxRemadaB1)
                    .addComponent(boxRemadaUni1)
                    .addComponent(boxVoador1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas1Layout.setVerticalGroup(
            painelCostas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral1.setText("Elevação Lat");

        boxEleFrontal1.setText("Elevação Front");

        boxRotacaoI1.setText("Rotação Interna");

        boxRotacaoE1.setText("Rotação Externa");

        boxDesComBarra1.setText("Desenv. c/ Barra");

        boxCrossI1.setText("Cross Invertido");

        BoxRemAlta1.setText("Remada Alta");

        boxEncOmbro1.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro1Layout = new javax.swing.GroupLayout(painelOmbro1);
        painelOmbro1.setLayout(painelOmbro1Layout);
        painelOmbro1Layout.setHorizontalGroup(
            painelOmbro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral1)
                    .addComponent(boxEleFrontal1)
                    .addComponent(boxRotacaoI1)
                    .addComponent(boxRotacaoE1)
                    .addComponent(boxDesComBarra1)
                    .addComponent(boxCrossI1)
                    .addComponent(BoxRemAlta1)
                    .addComponent(boxEncOmbro1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro1Layout.setVerticalGroup(
            painelOmbro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD1.setText("Rosca Direta");

        boxScoty1.setText("Banco Scoty");

        boxMartelo1.setText("Martelinho");

        boxRoscaI1.setText("Rosca Indireta");

        box22.setText("Rosca 21");

        boxRoscaA1.setText("Rosca Alternada");

        BoscaRoscaC1.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps1Layout = new javax.swing.GroupLayout(painelBiceps1);
        painelBiceps1.setLayout(painelBiceps1Layout);
        painelBiceps1Layout.setHorizontalGroup(
            painelBiceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD1)
                    .addComponent(boxScoty1)
                    .addComponent(boxMartelo1)
                    .addComponent(boxRoscaI1)
                    .addComponent(box22)
                    .addComponent(boxRoscaA1)
                    .addComponent(BoscaRoscaC1))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps1Layout.setVerticalGroup(
            painelBiceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta1.setText("Testa");

        boxPulley1.setText("Pulley");

        boxCrossV1.setText("Cross Barra V");
        boxCrossV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV1ActionPerformed(evt);
            }
        });

        boxCrossBarraR1.setText("Cross Barra Reta");

        boxFundos1.setText("Fundos em Máquina");

        boxTriSupinado1.setText("Supino Pega Junta");

        boxExtTriceps1.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps1Layout = new javax.swing.GroupLayout(painelTriceps1);
        painelTriceps1.setLayout(painelTriceps1Layout);
        painelTriceps1Layout.setHorizontalGroup(
            painelTriceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV1)
                    .addComponent(boxTesta1)
                    .addComponent(boxPulley1)
                    .addComponent(boxCrossBarraR1)
                    .addComponent(boxFundos1)
                    .addComponent(boxTriSupinado1)
                    .addComponent(boxExtTriceps1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps1Layout.setVerticalGroup(
            painelTriceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps1.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga1.setText("Agachamento");

        boxAgaF1.setText("Agachamento Front");

        boxAgaH1.setText("Agachamento Hack");

        boxPrensa1.setText("Prensa 90º");

        boxAfundoQ1.setText("Afundo");

        boxAfuncoB1.setText("Afundo c/ Barra");

        boxExtensora1.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps1Layout = new javax.swing.GroupLayout(painelQuadriceps1);
        painelQuadriceps1.setLayout(painelQuadriceps1Layout);
        painelQuadriceps1Layout.setHorizontalGroup(
            painelQuadriceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga1)
                    .addComponent(boxAgaF1)
                    .addComponent(boxAgaH1)
                    .addComponent(boxPrensa1)
                    .addComponent(boxAfundoQ1)
                    .addComponent(boxAfuncoB1)
                    .addComponent(boxExtensora1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps1Layout.setVerticalGroup(
            painelQuadriceps1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril1.setText("Ele. Quadril");

        boxAgaHalter1.setText("Aga. c/ Halter");

        boxKick1.setText("Kickbacks");

        boxAbdPerna1.setText("Abd. de Perna");

        boxAfundoG1.setText("Afundo");

        boxAgaLivre1.setText("Aga. Livre");

        boxAgaSumo1.setText("Aga. Sumo");

        boxStiff1.setText("Stiff");

        javax.swing.GroupLayout painelGluteo1Layout = new javax.swing.GroupLayout(painelGluteo1);
        painelGluteo1.setLayout(painelGluteo1Layout);
        painelGluteo1Layout.setHorizontalGroup(
            painelGluteo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril1)
                    .addComponent(boxAgaHalter1)
                    .addComponent(boxKick1)
                    .addComponent(boxAbdPerna1)
                    .addComponent(boxAfundoG1)
                    .addComponent(boxAgaLivre1)
                    .addComponent(boxAgaSumo1)
                    .addComponent(boxStiff1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo1Layout.setVerticalGroup(
            painelGluteo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha1.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe1.setText("Em pé");

        boxPantLeg1.setText("Leg Press");

        boxEmPeU1.setText("Em pé Uni");

        boxPanSentado1.setText("Ele. Sentado");

        boxPanBarra1.setText("C/ Barra");

        boxDonkey1.setText("Ele. Donkey");

        boxPanSalto1.setText("C/ Salto");

        boxPanUni1.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha1Layout = new javax.swing.GroupLayout(painelPanturrilha1);
        painelPanturrilha1.setLayout(painelPanturrilha1Layout);
        painelPanturrilha1Layout.setHorizontalGroup(
            painelPanturrilha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe1)
                    .addComponent(boxPantLeg1)
                    .addComponent(boxEmPeU1)
                    .addComponent(boxPanSentado1)
                    .addComponent(boxPanBarra1)
                    .addComponent(boxDonkey1)
                    .addComponent(boxPanSalto1)
                    .addComponent(boxPanUni1))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha1Layout.setVerticalGroup(
            painelPanturrilha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni1)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaTreinoBLayout = new javax.swing.GroupLayout(abaTreinoB);
        abaTreinoB.setLayout(abaTreinoBLayout);
        abaTreinoBLayout.setHorizontalGroup(
            abaTreinoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTreinoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaTreinoBLayout.setVerticalGroup(
            abaTreinoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaTreinoBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaTreinoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino B", abaTreinoB);

        painelPeito2.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto2.setText("Supino Reto");

        boxSupinoInclinado2.setText("Supino Inclinado");

        boxCanadense2.setText("Supino Declinado");

        boxPeck2.setText("Peck Deck");

        boxCrucifixo2.setText("Crucifixo");

        boxFlexao2.setText("Flexão");

        javax.swing.GroupLayout painelPeito2Layout = new javax.swing.GroupLayout(painelPeito2);
        painelPeito2.setLayout(painelPeito2Layout);
        painelPeito2Layout.setHorizontalGroup(
            painelPeito2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto2)
                    .addComponent(boxSupinoInclinado2)
                    .addComponent(boxCanadense2)
                    .addComponent(boxPeck2)
                    .addComponent(boxCrucifixo2)
                    .addComponent(boxFlexao2)))
        );
        painelPeito2Layout.setVerticalGroup(
            painelPeito2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas2.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas2.setText("Puxada Costas");

        boxPuFrente2.setText("Puxada Frente");

        boxPuFrenteI2.setText("Puxada Frente Inv");

        boxRemadaB2.setText("Remada Baixa");
        boxRemadaB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB2ActionPerformed(evt);
            }
        });

        boxRemadaUni2.setText("Remada Unilateral");

        boxVoador2.setText("Voador");

        javax.swing.GroupLayout painelCostas2Layout = new javax.swing.GroupLayout(painelCostas2);
        painelCostas2.setLayout(painelCostas2Layout);
        painelCostas2Layout.setHorizontalGroup(
            painelCostas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas2)
                    .addComponent(boxPuFrente2)
                    .addComponent(boxPuFrenteI2)
                    .addComponent(boxRemadaB2)
                    .addComponent(boxRemadaUni2)
                    .addComponent(boxVoador2))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas2Layout.setVerticalGroup(
            painelCostas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral2.setText("Elevação Lat");

        boxEleFrontal2.setText("Elevação Front");

        boxRotacaoI2.setText("Rotação Interna");

        boxRotacaoE2.setText("Rotação Externa");

        boxDesComBarra2.setText("Desenv. c/ Barra");

        boxCrossI2.setText("Cross Invertido");

        BoxRemAlta2.setText("Remada Alta");

        boxEncOmbro2.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro2Layout = new javax.swing.GroupLayout(painelOmbro2);
        painelOmbro2.setLayout(painelOmbro2Layout);
        painelOmbro2Layout.setHorizontalGroup(
            painelOmbro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral2)
                    .addComponent(boxEleFrontal2)
                    .addComponent(boxRotacaoI2)
                    .addComponent(boxRotacaoE2)
                    .addComponent(boxDesComBarra2)
                    .addComponent(boxCrossI2)
                    .addComponent(BoxRemAlta2)
                    .addComponent(boxEncOmbro2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro2Layout.setVerticalGroup(
            painelOmbro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD2.setText("Rosca Direta");

        boxScoty2.setText("Banco Scoty");

        boxMartelo2.setText("Martelinho");

        boxRoscaI2.setText("Rosca Indireta");

        box23.setText("Rosca 21");

        boxRoscaA2.setText("Rosca Alternada");

        BoscaRoscaC2.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps2Layout = new javax.swing.GroupLayout(painelBiceps2);
        painelBiceps2.setLayout(painelBiceps2Layout);
        painelBiceps2Layout.setHorizontalGroup(
            painelBiceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD2)
                    .addComponent(boxScoty2)
                    .addComponent(boxMartelo2)
                    .addComponent(boxRoscaI2)
                    .addComponent(box23)
                    .addComponent(boxRoscaA2)
                    .addComponent(BoscaRoscaC2))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps2Layout.setVerticalGroup(
            painelBiceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta2.setText("Testa");

        boxPulley2.setText("Pulley");

        boxCrossV2.setText("Cross Barra V");
        boxCrossV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV2ActionPerformed(evt);
            }
        });

        boxCrossBarraR2.setText("Cross Barra Reta");

        boxFundos2.setText("Fundos em Máquina");

        boxTriSupinado2.setText("Supino Pega Junta");

        boxExtTriceps2.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps2Layout = new javax.swing.GroupLayout(painelTriceps2);
        painelTriceps2.setLayout(painelTriceps2Layout);
        painelTriceps2Layout.setHorizontalGroup(
            painelTriceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV2)
                    .addComponent(boxTesta2)
                    .addComponent(boxPulley2)
                    .addComponent(boxCrossBarraR2)
                    .addComponent(boxFundos2)
                    .addComponent(boxTriSupinado2)
                    .addComponent(boxExtTriceps2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps2Layout.setVerticalGroup(
            painelTriceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps2.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga2.setText("Agachamento");

        boxAgaF2.setText("Agachamento Front");

        boxAgaH2.setText("Agachamento Hack");

        boxPrensa2.setText("Prensa 90º");

        boxAfundoQ2.setText("Afundo");

        boxAfuncoB2.setText("Afundo c/ Barra");

        boxExtensora2.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps2Layout = new javax.swing.GroupLayout(painelQuadriceps2);
        painelQuadriceps2.setLayout(painelQuadriceps2Layout);
        painelQuadriceps2Layout.setHorizontalGroup(
            painelQuadriceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga2)
                    .addComponent(boxAgaF2)
                    .addComponent(boxAgaH2)
                    .addComponent(boxPrensa2)
                    .addComponent(boxAfundoQ2)
                    .addComponent(boxAfuncoB2)
                    .addComponent(boxExtensora2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps2Layout.setVerticalGroup(
            painelQuadriceps2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo2.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril2.setText("Ele. Quadril");

        boxAgaHalter2.setText("Aga. c/ Halter");

        boxKick2.setText("Kickbacks");

        boxAbdPerna2.setText("Abd. de Perna");

        boxAfundoG2.setText("Afundo");

        boxAgaLivre2.setText("Aga. Livre");

        boxAgaSumo2.setText("Aga. Sumo");

        boxStiff2.setText("Stiff");

        javax.swing.GroupLayout painelGluteo2Layout = new javax.swing.GroupLayout(painelGluteo2);
        painelGluteo2.setLayout(painelGluteo2Layout);
        painelGluteo2Layout.setHorizontalGroup(
            painelGluteo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril2)
                    .addComponent(boxAgaHalter2)
                    .addComponent(boxKick2)
                    .addComponent(boxAbdPerna2)
                    .addComponent(boxAfundoG2)
                    .addComponent(boxAgaLivre2)
                    .addComponent(boxAgaSumo2)
                    .addComponent(boxStiff2))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo2Layout.setVerticalGroup(
            painelGluteo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha2.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe2.setText("Em pé");

        boxPantLeg2.setText("Leg Press");

        boxEmPeU2.setText("Em pé Uni");

        boxPanSentado2.setText("Ele. Sentado");

        boxPanBarra2.setText("C/ Barra");

        boxDonkey2.setText("Ele. Donkey");

        boxPanSalto2.setText("C/ Salto");

        boxPanUni2.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha2Layout = new javax.swing.GroupLayout(painelPanturrilha2);
        painelPanturrilha2.setLayout(painelPanturrilha2Layout);
        painelPanturrilha2Layout.setHorizontalGroup(
            painelPanturrilha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe2)
                    .addComponent(boxPantLeg2)
                    .addComponent(boxEmPeU2)
                    .addComponent(boxPanSentado2)
                    .addComponent(boxPanBarra2)
                    .addComponent(boxDonkey2)
                    .addComponent(boxPanSalto2)
                    .addComponent(boxPanUni2))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha2Layout.setVerticalGroup(
            painelPanturrilha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni2)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abaTreinoCLayout = new javax.swing.GroupLayout(abaTreinoC);
        abaTreinoC.setLayout(abaTreinoCLayout);
        abaTreinoCLayout.setHorizontalGroup(
            abaTreinoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaTreinoCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaTreinoCLayout.setVerticalGroup(
            abaTreinoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaTreinoCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaTreinoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino C", abaTreinoC);

        painelPosTreino.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Exercício/Treino");

        boxEsteiraP.setText("Esteira");
        boxEsteiraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEsteiraPActionPerformed(evt);
            }
        });

        boxBikeP.setText("Bicicleta");

        boxAbdomenP.setText("Abdomem");

        combEsteiraP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas" }));

        combBikeP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas" }));

        compAbdomenP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas", "Repetições" }));

        javax.swing.GroupLayout painelPosTreinoLayout = new javax.swing.GroupLayout(painelPosTreino);
        painelPosTreino.setLayout(painelPosTreinoLayout);
        painelPosTreinoLayout.setHorizontalGroup(
            painelPosTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPosTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPosTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPosTreinoLayout.createSequentialGroup()
                        .addComponent(boxEsteiraP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEsteiraP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(combEsteiraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxBikeP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBikeP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combBikeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxAbdomenP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPosTreinoLayout.setVerticalGroup(
            painelPosTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPosTreinoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPosTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEsteiraP)
                    .addComponent(lblEsteiraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combEsteiraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxBikeP)
                    .addComponent(lblBikeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combBikeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAbdomenP)
                    .addComponent(lblAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelTreinoLayout = new javax.swing.GroupLayout(painelTreino);
        painelTreino.setLayout(painelTreinoLayout);
        painelTreinoLayout.setHorizontalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addComponent(txtNomeAlunoTreino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeAlunoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNomeProfTreino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeProfessorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(487, 487, 487))
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addComponent(painelPreTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelTreinoLayout.createSequentialGroup()
                                        .addComponent(txtDataInicioTreino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDataInicioTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelTreinoLayout.createSequentialGroup()
                                        .addComponent(txtDataTermTreino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDataTermTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(painelPosTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        painelTreinoLayout.setVerticalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAlunoTreino)
                    .addComponent(lblNomeAlunoTreino)
                    .addComponent(txtDataInicioTreino)
                    .addComponent(lblDataInicioTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeProfTreino)
                    .addComponent(lblNomeProfessorTreino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataTermTreino)
                    .addComponent(lblDataTermTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPreTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        paletas.addTab("Treino aluno", painelTreino);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paletas)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limpaCamposTelaCadAluno();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Carrega todos os campos da tela para a classe.
        
        aluno.setNome(lblNome.getText());
        aluno.setDataNascimento(lblNasci.getText());
        aluno.setSexo(combSexo.getSelectedIndex());
        aluno.setEstadoCivil(combEstadoCivil.getSelectedIndex());
        aluno.setProfissao(lblProfi.getText());
        aluno.setCpf(lblCpf.getText());
        aluno.setRg(lblRg.getText());
        aluno.setufRg(combUfRg.getSelectedIndex());
        aluno.setTelefone(lblTel.getText());
        aluno.setEndereco(lblEnd.getText());
        aluno.setEnderecoNumero(lblNumCasa.getText());
        aluno.setEnderecoComplemento(lblCompl.getText());
        aluno.setBairro(lblBairro.getText());
        aluno.setCidade(lblCidade.getText());
        aluno.setCep(lblCep.getText());
        aluno.setEnderecoUf(combUfC.getSelectedIndex());
        aluno.setProfResposavel(lblProf.getText());
        aluno.setBebe(combBebe.getSelectedIndex());
        aluno.setFuma(combFuma.getSelectedIndex());
        aluno.setTreinou(combTreinou.getSelectedIndex());
        aluno.setPergunta1(lblP1.getText());
        aluno.setPergunta2(lblP2.getText());
        aluno.setPergunta3(lblP3.getText()); 
        aluno.setCheckHipertrofia(checkHipertrofia.isSelected());
        aluno.setCheckAero(checkAero.isSelected());
        aluno.setCheckNatacao(checkNatacao.isSelected());
        aluno.setCheckBox(checkBox.isSelected());
        aluno.setCheckZumba(checkZumba.isSelected());
        aluno.setCheckDanca(checkDanca.isSelected());
        aluno.setCheckBale(checkBale.isSelected());
        aluno.setCheckFisio(checkFisio.isSelected());
        aluno.setCheckCross(checkCross.isSelected());
        aluno.setCheckIoga(checkIoga.isSelected());
        aluno.setCheckTenis(checkTenis.isSelected());
        aluno.setCheckBasquete(checkBasquete.isSelected());
        aluno.setCheckFuncional(checkFuncional.isSelected());
        aluno.setCheckIntenso(checkIntenso.isSelected());
        aluno.setCheckVolei(checkVolei.isSelected());
        aluno.setCheckBallet(checkBallet.isSelected());
        
        //chama o metodo para inserir os dados no BD com os registros carregados no objeto aluno
        insert.insertCadAluno(aluno);
       
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void boxEsteiraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraPActionPerformed

    private void boxEsteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraActionPerformed

    private void lblCoxaEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCoxaEsqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCoxaEsqActionPerformed

    private void lblPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPesoActionPerformed

    private void lblPescocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPescocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPescocoActionPerformed

    private void lblQuadrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblQuadrilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblQuadrilActionPerformed

    private void lblPanturrilhaDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPanturrilhaDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPanturrilhaDirActionPerformed

    private void lblPanturrilhaEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPanturrilhaEsqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPanturrilhaEsqActionPerformed

    private void lblOmbroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblOmbroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOmbroActionPerformed

    private void lblCoxaDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCoxaDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCoxaDirActionPerformed

    private void lblAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAlturaActionPerformed

    private void lblCinturaEscapularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCinturaEscapularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCinturaEscapularActionPerformed

    private void lblCinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCinturaActionPerformed

    private void lblBracoDirRelaxadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBracoDirRelaxadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBracoDirRelaxadoActionPerformed

    private void lblBracoDirContraidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBracoDirContraidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBracoDirContraidoActionPerformed

    private void lblBracoEsqContraidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBracoEsqContraidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBracoEsqContraidoActionPerformed

    private void lblBracoEsqRelaxadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBracoEsqRelaxadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBracoEsqRelaxadoActionPerformed

    private void lblAnteBracoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnteBracoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnteBracoDActionPerformed

    private void lblAnteBracoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnteBracoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnteBracoEActionPerformed

    private void lblAbdomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAbdomemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAbdomemActionPerformed

    private void lblNasciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNasciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNasciActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        int retorno = JOptionPane.showConfirmDialog(null, "Deseja realmente sair ?");
        if(retorno == 0){
            this.limpaCamposClassePesquisa();
            this.dispose(); 
        }
        else{
            //não faz nada
        }
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void boxCrossVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossVActionPerformed

    private void boxRemadaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaBActionPerformed

    private void boxRemadaB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB1ActionPerformed

    private void boxCrossV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV1ActionPerformed

    private void boxRemadaB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB2ActionPerformed

    private void boxCrossV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV2ActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        new TelaAjudaEscolhaAluno(lblNome.getText()).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void lblNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        /*O botão excluir não exclui os dados, somente inativa o aluno
        para ter os registros armazenados
        */        
        String cod_alunoS = lblCodigo.getText();
        
        //se o campo código estiver vazio ele não faz nada
        if("CÓD".equals(cod_alunoS) || "".equals(cod_alunoS)){
            JOptionPane.showMessageDialog(null, "Não existe nenhum aluno selecionado.");
        }else{
            int cod_aluno = Integer.parseInt(cod_alunoS);
            int retorno = JOptionPane.showConfirmDialog(null, "O aluno será inativado. Tem certeza que deseja desativa-lo ?");
                if(retorno == 0){
                    update.updateStatus(cod_aluno);
                    this.dispose();
                }else{
                    //não faz nada
                }
        }       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        /*O botão alterar altera os dados. Ele faz a busca no banco 
        através do código do aluno.
        */        
        String cod_alunoS = lblCodigo.getText();
        
        if("CÓD".equals(cod_alunoS) || "".equals(cod_alunoS)){
            JOptionPane.showMessageDialog(null, "Não existe nenhum aluno selecionado.");
        }else{
            int cod_aluno = Integer.parseInt(cod_alunoS);              
        
            aluno.setNome(lblNome.getText());
            aluno.setDataNascimento(lblNasci.getText());
            aluno.setSexo(combSexo.getSelectedIndex());
            aluno.setEstadoCivil(combEstadoCivil.getSelectedIndex());
            aluno.setProfissao(lblProfi.getText());
            aluno.setCpf(lblCpf.getText());
            aluno.setRg(lblRg.getText());
            aluno.setufRg(combUfRg.getSelectedIndex());
            aluno.setTelefone(lblTel.getText());
            aluno.setEndereco(lblEnd.getText());
            aluno.setEnderecoNumero(lblNumCasa.getText());
            aluno.setEnderecoComplemento(lblCompl.getText());
            aluno.setBairro(lblBairro.getText());
            aluno.setCidade(lblCidade.getText());
            aluno.setCep(lblCep.getText());
            aluno.setEnderecoUf(combUfC.getSelectedIndex());
            aluno.setProfResposavel(lblProf.getText());
            aluno.setBebe(combBebe.getSelectedIndex());
            aluno.setFuma(combFuma.getSelectedIndex());
            aluno.setTreinou(combTreinou.getSelectedIndex());
            aluno.setPergunta1(lblP1.getText());
            aluno.setPergunta2(lblP2.getText());
            aluno.setPergunta3(lblP3.getText()); 
            aluno.setCheckHipertrofia(checkHipertrofia.isSelected());
            aluno.setCheckAero(checkAero.isSelected());
            aluno.setCheckNatacao(checkNatacao.isSelected());
            aluno.setCheckBox(checkBox.isSelected());
            aluno.setCheckZumba(checkZumba.isSelected());
            aluno.setCheckDanca(checkDanca.isSelected());
            aluno.setCheckBale(checkBale.isSelected());
            aluno.setCheckFisio(checkFisio.isSelected());
            aluno.setCheckCross(checkCross.isSelected());
            aluno.setCheckIoga(checkIoga.isSelected());
            aluno.setCheckTenis(checkTenis.isSelected());
            aluno.setCheckBasquete(checkBasquete.isSelected());
            aluno.setCheckFuncional(checkFuncional.isSelected());
            aluno.setCheckIntenso(checkIntenso.isSelected());
            aluno.setCheckVolei(checkVolei.isSelected());
            aluno.setCheckBallet(checkBallet.isSelected());
        
            int retorno = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar as altrações ?");
                if(retorno == 0){
                    update.updateCadastro(aluno,cod_aluno); 
                }else{
                    //não faz nada
                }              
        }    
        
    }//GEN-LAST:event_btnAlterarActionPerformed

     
    
/*-------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*--------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
/*----------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadAluno().setVisible(true);
            }
        });
    }--------------------------------*/


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoscaRoscaC;
    private javax.swing.JCheckBox BoscaRoscaC1;
    private javax.swing.JCheckBox BoscaRoscaC2;
    private javax.swing.JCheckBox BoxRemAlta;
    private javax.swing.JCheckBox BoxRemAlta1;
    private javax.swing.JCheckBox BoxRemAlta2;
    private javax.swing.JPanel abaTreinoA;
    private javax.swing.JPanel abaTreinoB;
    private javax.swing.JPanel abaTreinoC;
    private javax.swing.JCheckBox box21;
    private javax.swing.JCheckBox box22;
    private javax.swing.JCheckBox box23;
    private javax.swing.JCheckBox boxAbdPerna;
    private javax.swing.JCheckBox boxAbdPerna1;
    private javax.swing.JCheckBox boxAbdPerna2;
    private javax.swing.JCheckBox boxAbdomen;
    private javax.swing.JCheckBox boxAbdomenP;
    private javax.swing.JCheckBox boxAfuncoB;
    private javax.swing.JCheckBox boxAfuncoB1;
    private javax.swing.JCheckBox boxAfuncoB2;
    private javax.swing.JCheckBox boxAfundoG;
    private javax.swing.JCheckBox boxAfundoG1;
    private javax.swing.JCheckBox boxAfundoG2;
    private javax.swing.JCheckBox boxAfundoQ;
    private javax.swing.JCheckBox boxAfundoQ1;
    private javax.swing.JCheckBox boxAfundoQ2;
    private javax.swing.JCheckBox boxAga;
    private javax.swing.JCheckBox boxAga1;
    private javax.swing.JCheckBox boxAga2;
    private javax.swing.JCheckBox boxAgaF;
    private javax.swing.JCheckBox boxAgaF1;
    private javax.swing.JCheckBox boxAgaF2;
    private javax.swing.JCheckBox boxAgaH;
    private javax.swing.JCheckBox boxAgaH1;
    private javax.swing.JCheckBox boxAgaH2;
    private javax.swing.JCheckBox boxAgaHalter;
    private javax.swing.JCheckBox boxAgaHalter1;
    private javax.swing.JCheckBox boxAgaHalter2;
    private javax.swing.JCheckBox boxAgaLivre;
    private javax.swing.JCheckBox boxAgaLivre1;
    private javax.swing.JCheckBox boxAgaLivre2;
    private javax.swing.JCheckBox boxAgaSumo;
    private javax.swing.JCheckBox boxAgaSumo1;
    private javax.swing.JCheckBox boxAgaSumo2;
    private javax.swing.JCheckBox boxBike;
    private javax.swing.JCheckBox boxBikeP;
    private javax.swing.JCheckBox boxCanadense;
    private javax.swing.JCheckBox boxCanadense1;
    private javax.swing.JCheckBox boxCanadense2;
    private javax.swing.JCheckBox boxCrossBarraR;
    private javax.swing.JCheckBox boxCrossBarraR1;
    private javax.swing.JCheckBox boxCrossBarraR2;
    private javax.swing.JCheckBox boxCrossI;
    private javax.swing.JCheckBox boxCrossI1;
    private javax.swing.JCheckBox boxCrossI2;
    private javax.swing.JCheckBox boxCrossV;
    private javax.swing.JCheckBox boxCrossV1;
    private javax.swing.JCheckBox boxCrossV2;
    private javax.swing.JCheckBox boxCrucifixo;
    private javax.swing.JCheckBox boxCrucifixo1;
    private javax.swing.JCheckBox boxCrucifixo2;
    private javax.swing.JCheckBox boxDesComBarra;
    private javax.swing.JCheckBox boxDesComBarra1;
    private javax.swing.JCheckBox boxDesComBarra2;
    private javax.swing.JCheckBox boxDonkey;
    private javax.swing.JCheckBox boxDonkey1;
    private javax.swing.JCheckBox boxDonkey2;
    private javax.swing.JCheckBox boxEleFrontal;
    private javax.swing.JCheckBox boxEleFrontal1;
    private javax.swing.JCheckBox boxEleFrontal2;
    private javax.swing.JCheckBox boxEleLateral;
    private javax.swing.JCheckBox boxEleLateral1;
    private javax.swing.JCheckBox boxEleLateral2;
    private javax.swing.JCheckBox boxElevQuadril;
    private javax.swing.JCheckBox boxElevQuadril1;
    private javax.swing.JCheckBox boxElevQuadril2;
    private javax.swing.JCheckBox boxEmPe;
    private javax.swing.JCheckBox boxEmPe1;
    private javax.swing.JCheckBox boxEmPe2;
    private javax.swing.JCheckBox boxEmPeU;
    private javax.swing.JCheckBox boxEmPeU1;
    private javax.swing.JCheckBox boxEmPeU2;
    private javax.swing.JCheckBox boxEncOmbro;
    private javax.swing.JCheckBox boxEncOmbro1;
    private javax.swing.JCheckBox boxEncOmbro2;
    private javax.swing.JCheckBox boxEsteira;
    private javax.swing.JCheckBox boxEsteiraP;
    private javax.swing.JCheckBox boxExtTriceps;
    private javax.swing.JCheckBox boxExtTriceps1;
    private javax.swing.JCheckBox boxExtTriceps2;
    private javax.swing.JCheckBox boxExtensora;
    private javax.swing.JCheckBox boxExtensora1;
    private javax.swing.JCheckBox boxExtensora2;
    private javax.swing.JCheckBox boxFlexao;
    private javax.swing.JCheckBox boxFlexao1;
    private javax.swing.JCheckBox boxFlexao2;
    private javax.swing.JCheckBox boxFundos;
    private javax.swing.JCheckBox boxFundos1;
    private javax.swing.JCheckBox boxFundos2;
    private javax.swing.JCheckBox boxKick;
    private javax.swing.JCheckBox boxKick1;
    private javax.swing.JCheckBox boxKick2;
    private javax.swing.JCheckBox boxMartelo;
    private javax.swing.JCheckBox boxMartelo1;
    private javax.swing.JCheckBox boxMartelo2;
    private javax.swing.JCheckBox boxPanBarra;
    private javax.swing.JCheckBox boxPanBarra1;
    private javax.swing.JCheckBox boxPanBarra2;
    private javax.swing.JCheckBox boxPanSalto;
    private javax.swing.JCheckBox boxPanSalto1;
    private javax.swing.JCheckBox boxPanSalto2;
    private javax.swing.JCheckBox boxPanSentado;
    private javax.swing.JCheckBox boxPanSentado1;
    private javax.swing.JCheckBox boxPanSentado2;
    private javax.swing.JCheckBox boxPanUni;
    private javax.swing.JCheckBox boxPanUni1;
    private javax.swing.JCheckBox boxPanUni2;
    private javax.swing.JCheckBox boxPantLeg;
    private javax.swing.JCheckBox boxPantLeg1;
    private javax.swing.JCheckBox boxPantLeg2;
    private javax.swing.JCheckBox boxPeck;
    private javax.swing.JCheckBox boxPeck1;
    private javax.swing.JCheckBox boxPeck2;
    private javax.swing.JCheckBox boxPrensa;
    private javax.swing.JCheckBox boxPrensa1;
    private javax.swing.JCheckBox boxPrensa2;
    private javax.swing.JCheckBox boxPuCostas;
    private javax.swing.JCheckBox boxPuCostas1;
    private javax.swing.JCheckBox boxPuCostas2;
    private javax.swing.JCheckBox boxPuFrente;
    private javax.swing.JCheckBox boxPuFrente1;
    private javax.swing.JCheckBox boxPuFrente2;
    private javax.swing.JCheckBox boxPuFrenteI;
    private javax.swing.JCheckBox boxPuFrenteI1;
    private javax.swing.JCheckBox boxPuFrenteI2;
    private javax.swing.JCheckBox boxPulley;
    private javax.swing.JCheckBox boxPulley1;
    private javax.swing.JCheckBox boxPulley2;
    private javax.swing.JCheckBox boxRemadaB;
    private javax.swing.JCheckBox boxRemadaB1;
    private javax.swing.JCheckBox boxRemadaB2;
    private javax.swing.JCheckBox boxRemadaUni;
    private javax.swing.JCheckBox boxRemadaUni1;
    private javax.swing.JCheckBox boxRemadaUni2;
    private javax.swing.JCheckBox boxRoscaA;
    private javax.swing.JCheckBox boxRoscaA1;
    private javax.swing.JCheckBox boxRoscaA2;
    private javax.swing.JCheckBox boxRoscaD;
    private javax.swing.JCheckBox boxRoscaD1;
    private javax.swing.JCheckBox boxRoscaD2;
    private javax.swing.JCheckBox boxRoscaI;
    private javax.swing.JCheckBox boxRoscaI1;
    private javax.swing.JCheckBox boxRoscaI2;
    private javax.swing.JCheckBox boxRotacaoE;
    private javax.swing.JCheckBox boxRotacaoE1;
    private javax.swing.JCheckBox boxRotacaoE2;
    private javax.swing.JCheckBox boxRotacaoI;
    private javax.swing.JCheckBox boxRotacaoI1;
    private javax.swing.JCheckBox boxRotacaoI2;
    private javax.swing.JCheckBox boxScoty;
    private javax.swing.JCheckBox boxScoty1;
    private javax.swing.JCheckBox boxScoty2;
    private javax.swing.JCheckBox boxStiff;
    private javax.swing.JCheckBox boxStiff1;
    private javax.swing.JCheckBox boxStiff2;
    private javax.swing.JCheckBox boxSupinoInclinado;
    private javax.swing.JCheckBox boxSupinoInclinado1;
    private javax.swing.JCheckBox boxSupinoInclinado2;
    private javax.swing.JCheckBox boxSupinoReto;
    private javax.swing.JCheckBox boxSupinoReto1;
    private javax.swing.JCheckBox boxSupinoReto2;
    private javax.swing.JCheckBox boxTesta;
    private javax.swing.JCheckBox boxTesta1;
    private javax.swing.JCheckBox boxTesta2;
    private javax.swing.JCheckBox boxTriSupinado;
    private javax.swing.JCheckBox boxTriSupinado1;
    private javax.swing.JCheckBox boxTriSupinado2;
    private javax.swing.JCheckBox boxVoador;
    private javax.swing.JCheckBox boxVoador1;
    private javax.swing.JCheckBox boxVoador2;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkAero;
    private javax.swing.JCheckBox checkBale;
    private javax.swing.JCheckBox checkBallet;
    private javax.swing.JCheckBox checkBasquete;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JCheckBox checkCross;
    private javax.swing.JCheckBox checkDanca;
    private javax.swing.JCheckBox checkFisio;
    private javax.swing.JCheckBox checkFuncional;
    private javax.swing.JCheckBox checkHipertrofia;
    private javax.swing.JCheckBox checkIntenso;
    private javax.swing.JCheckBox checkIoga;
    private javax.swing.JCheckBox checkNatacao;
    private javax.swing.JCheckBox checkTenis;
    private javax.swing.JCheckBox checkVolei;
    private javax.swing.JCheckBox checkZumba;
    private javax.swing.JComboBox<String> combAbdomen;
    private javax.swing.JComboBox<String> combBebe;
    private javax.swing.JComboBox<String> combBike;
    private javax.swing.JComboBox<String> combBikeP;
    private javax.swing.JComboBox<String> combEstadoCivil;
    private javax.swing.JComboBox<String> combEsteira;
    private javax.swing.JComboBox<String> combEsteiraP;
    private javax.swing.JComboBox<String> combFuma;
    private javax.swing.JComboBox<String> combSexo;
    private javax.swing.JComboBox<String> combTreinou;
    private javax.swing.JComboBox<String> combUfC;
    private javax.swing.JComboBox<String> combUfRg;
    private javax.swing.JComboBox<String> compAbdomenP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField lblAbdomem;
    private javax.swing.JTextField lblAbdomen;
    private javax.swing.JTextField lblAbdomenP;
    private javax.swing.JTextField lblAltura;
    private javax.swing.JTextField lblAnteBracoD;
    private javax.swing.JTextField lblAnteBracoE;
    private javax.swing.JTextField lblBairro;
    private javax.swing.JTextField lblBike;
    private javax.swing.JTextField lblBikeP;
    private javax.swing.JTextField lblBracoDirContraido;
    private javax.swing.JTextField lblBracoDirRelaxado;
    private javax.swing.JTextField lblBracoEsqContraido;
    private javax.swing.JTextField lblBracoEsqRelaxado;
    private javax.swing.JTextField lblCep;
    private javax.swing.JTextField lblCidade;
    private javax.swing.JTextField lblCintura;
    private javax.swing.JTextField lblCinturaEscapular;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField lblCompl;
    private javax.swing.JTextField lblCoxaDir;
    private javax.swing.JTextField lblCoxaEsq;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JTextField lblDataInicioTreino;
    private javax.swing.JTextField lblDataTermTreino;
    private javax.swing.JTextField lblEnd;
    private javax.swing.JTextField lblEsteira;
    private javax.swing.JTextField lblEsteiraP;
    private javax.swing.JPanel lblFoto;
    private javax.swing.JTextField lblNasci;
    private javax.swing.JTextField lblNome;
    private javax.swing.JLabel lblNomeAlunoTreino;
    private javax.swing.JLabel lblNomeProfessorTreino;
    private javax.swing.JTextField lblNumCasa;
    private javax.swing.JTextArea lblObservacoes;
    private javax.swing.JTextField lblOmbro;
    private javax.swing.JTextField lblP1;
    private javax.swing.JTextField lblP2;
    private javax.swing.JTextField lblP3;
    private javax.swing.JTextField lblPanturrilhaDir;
    private javax.swing.JTextField lblPanturrilhaEsq;
    private javax.swing.JTextField lblPescoco;
    private javax.swing.JTextField lblPeso;
    private javax.swing.JTextField lblProf;
    private javax.swing.JTextField lblProfi;
    private javax.swing.JTextField lblQuadril;
    private javax.swing.JTextField lblRg;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField lblTel;
    private javax.swing.JPanel painelBiceps;
    private javax.swing.JPanel painelBiceps1;
    private javax.swing.JPanel painelBiceps2;
    private javax.swing.JPanel painelCostas;
    private javax.swing.JPanel painelCostas1;
    private javax.swing.JPanel painelCostas2;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelGluteo;
    private javax.swing.JPanel painelGluteo1;
    private javax.swing.JPanel painelGluteo2;
    private javax.swing.JPanel painelModalidades;
    private javax.swing.JPanel painelOmbro;
    private javax.swing.JPanel painelOmbro1;
    private javax.swing.JPanel painelOmbro2;
    private javax.swing.JPanel painelPanturrilha;
    private javax.swing.JPanel painelPanturrilha1;
    private javax.swing.JPanel painelPanturrilha2;
    private javax.swing.JPanel painelPeito;
    private javax.swing.JPanel painelPeito1;
    private javax.swing.JPanel painelPeito2;
    private javax.swing.JPanel painelPerimetria;
    private javax.swing.JPanel painelPosTreino;
    private javax.swing.JPanel painelPreTreino;
    private javax.swing.JPanel painelQuadriceps;
    private javax.swing.JPanel painelQuadriceps1;
    private javax.swing.JPanel painelQuadriceps2;
    private javax.swing.JPanel painelTreino;
    private javax.swing.JPanel painelTriceps;
    private javax.swing.JPanel painelTriceps1;
    private javax.swing.JPanel painelTriceps2;
    private javax.swing.JTabbedPane paletas;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txtAbdomem;
    private javax.swing.JLabel txtAltura;
    private javax.swing.JLabel txtAltura1;
    private javax.swing.JLabel txtAnteBracoD;
    private javax.swing.JLabel txtAnteBracoE;
    private javax.swing.JLabel txtBairro;
    private javax.swing.JLabel txtBebe;
    private javax.swing.JLabel txtBracoDirContraido;
    private javax.swing.JLabel txtBracoDirRelaxado;
    private javax.swing.JLabel txtBracoEsqContraido;
    private javax.swing.JLabel txtBracoEsqRelaxado;
    private javax.swing.JLabel txtCep;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtCintura;
    private javax.swing.JLabel txtCinturaEscapular;
    private javax.swing.JLabel txtCivil;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtCompl;
    private javax.swing.JLabel txtCoxaDir;
    private javax.swing.JLabel txtCoxaEsq;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtDataInicioTreino;
    private javax.swing.JLabel txtDataTermTreino;
    private javax.swing.JLabel txtEnd;
    private javax.swing.JLabel txtFoto;
    private javax.swing.JLabel txtFuma;
    private javax.swing.JLabel txtMod;
    private javax.swing.JLabel txtNasci;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNomeAlunoTreino;
    private javax.swing.JLabel txtNomeProfTreino;
    private javax.swing.JLabel txtNum;
    private javax.swing.JLabel txtObservacoes;
    private javax.swing.JLabel txtOmbro;
    private javax.swing.JLabel txtP1;
    private javax.swing.JLabel txtP2;
    private javax.swing.JLabel txtP3;
    private javax.swing.JLabel txtPanturrilhaDir;
    private javax.swing.JLabel txtPanturrilhaEsq;
    private javax.swing.JLabel txtPescoco;
    private javax.swing.JLabel txtPeso;
    private javax.swing.JLabel txtPeso1;
    private javax.swing.JLabel txtProf;
    private javax.swing.JLabel txtProfi;
    private javax.swing.JLabel txtQuadril;
    private javax.swing.JLabel txtQuestionario;
    private javax.swing.JLabel txtRg;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtTel;
    private javax.swing.JLabel txtTreinou;
    private javax.swing.JLabel txtUf;
    private javax.swing.JLabel txtUfC;
    // End of variables declaration//GEN-END:variables
}


