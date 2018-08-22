
package telas;

import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TelaCadVisitante extends javax.swing.JFrame {
    

    public TelaCadVisitante() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH); //para programa abrir em tela inteira

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        lblSexo = new javax.swing.JComboBox<>();
        txtCivil = new javax.swing.JLabel();
        lblCivil = new javax.swing.JComboBox<>();
        txtProfi = new javax.swing.JLabel();
        lblProfi = new javax.swing.JTextField();
        txtCpf = new javax.swing.JLabel();
        lblCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JLabel();
        lblRg = new javax.swing.JTextField();
        txtUf = new javax.swing.JLabel();
        lblUfRg = new javax.swing.JComboBox<>();
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
        lblUfC = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        txtProf = new javax.swing.JLabel();
        lblProf = new javax.swing.JTextField();
        txtQuestionario = new javax.swing.JLabel();
        txtBebe = new javax.swing.JLabel();
        lblBebe = new javax.swing.JComboBox<>();
        txtFuma = new javax.swing.JLabel();
        lblFuma = new javax.swing.JComboBox<>();
        txtTreinou = new javax.swing.JLabel();
        lblTreinou = new javax.swing.JComboBox<>();
        txtP1 = new javax.swing.JLabel();
        lblP1 = new javax.swing.JTextField();
        txtP2 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JTextField();
        txtP3 = new javax.swing.JLabel();
        lblP3 = new javax.swing.JTextField();
        txtMod = new javax.swing.JLabel();
        painelModalidades = new javax.swing.JPanel();
        lblHip = new javax.swing.JCheckBox();
        lblAero = new javax.swing.JCheckBox();
        lblNat = new javax.swing.JCheckBox();
        lblBox = new javax.swing.JCheckBox();
        lblZumba = new javax.swing.JCheckBox();
        lblDanca = new javax.swing.JCheckBox();
        lblBale = new javax.swing.JCheckBox();
        lblFisio = new javax.swing.JCheckBox();
        lblCross = new javax.swing.JCheckBox();
        lblIoga = new javax.swing.JCheckBox();
        lblTenis = new javax.swing.JCheckBox();
        lblBasq = new javax.swing.JCheckBox();
        lblTf = new javax.swing.JCheckBox();
        lblTi = new javax.swing.JCheckBox();
        lblVolei = new javax.swing.JCheckBox();
        lblBfit = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelDadosProfissionais = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel53 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        painelPerimetria = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtAbdomem = new javax.swing.JLabel();
        lblAbdomem = new javax.swing.JTextField();
        txtAnteBraco = new javax.swing.JLabel();
        lblAnteBraco = new javax.swing.JTextField();
        txtAnteBraco1 = new javax.swing.JLabel();
        lblAnteBraco1 = new javax.swing.JTextField();
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
        lblAltura = new javax.swing.JTextField();
        txtCoxaDir = new javax.swing.JLabel();
        lblCoxadir = new javax.swing.JTextField();
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
        lblCoxaEsq = new javax.swing.JTextField();
        txtAltura1 = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblObservacoes = new javax.swing.JTextArea();
        txt = new javax.swing.JLabel();
        painelTreino = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeTreino = new javax.swing.JLabel();
        lblNomeProfessorTreino = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        painelPeito6 = new javax.swing.JPanel();
        boxSupinoReto6 = new javax.swing.JCheckBox();
        boxSupinoInclinado6 = new javax.swing.JCheckBox();
        boxCanadense6 = new javax.swing.JCheckBox();
        boxPeck6 = new javax.swing.JCheckBox();
        boxCrucifixo6 = new javax.swing.JCheckBox();
        boxFlexao6 = new javax.swing.JCheckBox();
        painelCostas6 = new javax.swing.JPanel();
        boxPuCostas6 = new javax.swing.JCheckBox();
        boxPuFrente6 = new javax.swing.JCheckBox();
        boxPuFrenteI6 = new javax.swing.JCheckBox();
        boxRemadaB6 = new javax.swing.JCheckBox();
        boxRemadaUni6 = new javax.swing.JCheckBox();
        boxVoador6 = new javax.swing.JCheckBox();
        painelOmbro6 = new javax.swing.JPanel();
        boxEleLateral6 = new javax.swing.JCheckBox();
        boxEleFrontal6 = new javax.swing.JCheckBox();
        boxRotacaoI6 = new javax.swing.JCheckBox();
        boxRotacaoE6 = new javax.swing.JCheckBox();
        boxDesComBarra6 = new javax.swing.JCheckBox();
        boxCrossI6 = new javax.swing.JCheckBox();
        BoxRemAlta6 = new javax.swing.JCheckBox();
        boxEncOmbro6 = new javax.swing.JCheckBox();
        painelBiceps6 = new javax.swing.JPanel();
        boxRoscaD6 = new javax.swing.JCheckBox();
        boxScoty6 = new javax.swing.JCheckBox();
        boxMartelo6 = new javax.swing.JCheckBox();
        boxRoscaI6 = new javax.swing.JCheckBox();
        box27 = new javax.swing.JCheckBox();
        boxRoscaA6 = new javax.swing.JCheckBox();
        BoscaRoscaC6 = new javax.swing.JCheckBox();
        painelTriceps6 = new javax.swing.JPanel();
        boxTesta6 = new javax.swing.JCheckBox();
        boxPulley6 = new javax.swing.JCheckBox();
        boxCrossV6 = new javax.swing.JCheckBox();
        boxCrossBarraR6 = new javax.swing.JCheckBox();
        boxFundos6 = new javax.swing.JCheckBox();
        boxTriSupinado6 = new javax.swing.JCheckBox();
        boxExtTriceps6 = new javax.swing.JCheckBox();
        painelQuadriceps6 = new javax.swing.JPanel();
        boxAga6 = new javax.swing.JCheckBox();
        boxAgaF6 = new javax.swing.JCheckBox();
        boxAgaH6 = new javax.swing.JCheckBox();
        boxPrensa6 = new javax.swing.JCheckBox();
        boxAfundoQ6 = new javax.swing.JCheckBox();
        boxAfuncoB6 = new javax.swing.JCheckBox();
        boxExtensora6 = new javax.swing.JCheckBox();
        painelGluteo6 = new javax.swing.JPanel();
        boxElevQuadril6 = new javax.swing.JCheckBox();
        boxAgaHalter6 = new javax.swing.JCheckBox();
        boxKick6 = new javax.swing.JCheckBox();
        boxAbdPerna6 = new javax.swing.JCheckBox();
        boxAfundoG6 = new javax.swing.JCheckBox();
        boxAgaLivre6 = new javax.swing.JCheckBox();
        boxAgaSumo6 = new javax.swing.JCheckBox();
        boxStiff6 = new javax.swing.JCheckBox();
        painelPanturrilha6 = new javax.swing.JPanel();
        boxEmPe6 = new javax.swing.JCheckBox();
        boxPantLeg6 = new javax.swing.JCheckBox();
        boxEmPeU6 = new javax.swing.JCheckBox();
        boxPanSentado6 = new javax.swing.JCheckBox();
        boxPanBarra6 = new javax.swing.JCheckBox();
        boxDonkey6 = new javax.swing.JCheckBox();
        boxPanSalto6 = new javax.swing.JCheckBox();
        boxPanUni6 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        painelPeito5 = new javax.swing.JPanel();
        boxSupinoReto5 = new javax.swing.JCheckBox();
        boxSupinoInclinado5 = new javax.swing.JCheckBox();
        boxCanadense5 = new javax.swing.JCheckBox();
        boxPeck5 = new javax.swing.JCheckBox();
        boxCrucifixo5 = new javax.swing.JCheckBox();
        boxFlexao5 = new javax.swing.JCheckBox();
        painelCostas5 = new javax.swing.JPanel();
        boxPuCostas5 = new javax.swing.JCheckBox();
        boxPuFrente5 = new javax.swing.JCheckBox();
        boxPuFrenteI5 = new javax.swing.JCheckBox();
        boxRemadaB5 = new javax.swing.JCheckBox();
        boxRemadaUni5 = new javax.swing.JCheckBox();
        boxVoador5 = new javax.swing.JCheckBox();
        painelOmbro5 = new javax.swing.JPanel();
        boxEleLateral5 = new javax.swing.JCheckBox();
        boxEleFrontal5 = new javax.swing.JCheckBox();
        boxRotacaoI5 = new javax.swing.JCheckBox();
        boxRotacaoE5 = new javax.swing.JCheckBox();
        boxDesComBarra5 = new javax.swing.JCheckBox();
        boxCrossI5 = new javax.swing.JCheckBox();
        BoxRemAlta5 = new javax.swing.JCheckBox();
        boxEncOmbro5 = new javax.swing.JCheckBox();
        painelBiceps5 = new javax.swing.JPanel();
        boxRoscaD5 = new javax.swing.JCheckBox();
        boxScoty5 = new javax.swing.JCheckBox();
        boxMartelo5 = new javax.swing.JCheckBox();
        boxRoscaI5 = new javax.swing.JCheckBox();
        box26 = new javax.swing.JCheckBox();
        boxRoscaA5 = new javax.swing.JCheckBox();
        BoscaRoscaC5 = new javax.swing.JCheckBox();
        painelTriceps5 = new javax.swing.JPanel();
        boxTesta5 = new javax.swing.JCheckBox();
        boxPulley5 = new javax.swing.JCheckBox();
        boxCrossV5 = new javax.swing.JCheckBox();
        boxCrossBarraR5 = new javax.swing.JCheckBox();
        boxFundos5 = new javax.swing.JCheckBox();
        boxTriSupinado5 = new javax.swing.JCheckBox();
        boxExtTriceps5 = new javax.swing.JCheckBox();
        painelQuadriceps5 = new javax.swing.JPanel();
        boxAga5 = new javax.swing.JCheckBox();
        boxAgaF5 = new javax.swing.JCheckBox();
        boxAgaH5 = new javax.swing.JCheckBox();
        boxPrensa5 = new javax.swing.JCheckBox();
        boxAfundoQ5 = new javax.swing.JCheckBox();
        boxAfuncoB5 = new javax.swing.JCheckBox();
        boxExtensora5 = new javax.swing.JCheckBox();
        painelGluteo5 = new javax.swing.JPanel();
        boxElevQuadril5 = new javax.swing.JCheckBox();
        boxAgaHalter5 = new javax.swing.JCheckBox();
        boxKick5 = new javax.swing.JCheckBox();
        boxAbdPerna5 = new javax.swing.JCheckBox();
        boxAfundoG5 = new javax.swing.JCheckBox();
        boxAgaLivre5 = new javax.swing.JCheckBox();
        boxAgaSumo5 = new javax.swing.JCheckBox();
        boxStiff5 = new javax.swing.JCheckBox();
        painelPanturrilha5 = new javax.swing.JPanel();
        boxEmPe5 = new javax.swing.JCheckBox();
        boxPantLeg5 = new javax.swing.JCheckBox();
        boxEmPeU5 = new javax.swing.JCheckBox();
        boxPanSentado5 = new javax.swing.JCheckBox();
        boxPanBarra5 = new javax.swing.JCheckBox();
        boxDonkey5 = new javax.swing.JCheckBox();
        boxPanSalto5 = new javax.swing.JCheckBox();
        boxPanUni5 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        painelPeito4 = new javax.swing.JPanel();
        boxSupinoReto4 = new javax.swing.JCheckBox();
        boxSupinoInclinado4 = new javax.swing.JCheckBox();
        boxCanadense4 = new javax.swing.JCheckBox();
        boxPeck4 = new javax.swing.JCheckBox();
        boxCrucifixo4 = new javax.swing.JCheckBox();
        boxFlexao4 = new javax.swing.JCheckBox();
        painelCostas4 = new javax.swing.JPanel();
        boxPuCostas4 = new javax.swing.JCheckBox();
        boxPuFrente4 = new javax.swing.JCheckBox();
        boxPuFrenteI4 = new javax.swing.JCheckBox();
        boxRemadaB4 = new javax.swing.JCheckBox();
        boxRemadaUni4 = new javax.swing.JCheckBox();
        boxVoador4 = new javax.swing.JCheckBox();
        painelOmbro4 = new javax.swing.JPanel();
        boxEleLateral4 = new javax.swing.JCheckBox();
        boxEleFrontal4 = new javax.swing.JCheckBox();
        boxRotacaoI4 = new javax.swing.JCheckBox();
        boxRotacaoE4 = new javax.swing.JCheckBox();
        boxDesComBarra4 = new javax.swing.JCheckBox();
        boxCrossI4 = new javax.swing.JCheckBox();
        BoxRemAlta4 = new javax.swing.JCheckBox();
        boxEncOmbro4 = new javax.swing.JCheckBox();
        painelBiceps4 = new javax.swing.JPanel();
        boxRoscaD4 = new javax.swing.JCheckBox();
        boxScoty4 = new javax.swing.JCheckBox();
        boxMartelo4 = new javax.swing.JCheckBox();
        boxRoscaI4 = new javax.swing.JCheckBox();
        box25 = new javax.swing.JCheckBox();
        boxRoscaA4 = new javax.swing.JCheckBox();
        BoscaRoscaC4 = new javax.swing.JCheckBox();
        painelTriceps4 = new javax.swing.JPanel();
        boxTesta4 = new javax.swing.JCheckBox();
        boxPulley4 = new javax.swing.JCheckBox();
        boxCrossV4 = new javax.swing.JCheckBox();
        boxCrossBarraR4 = new javax.swing.JCheckBox();
        boxFundos4 = new javax.swing.JCheckBox();
        boxTriSupinado4 = new javax.swing.JCheckBox();
        boxExtTriceps4 = new javax.swing.JCheckBox();
        painelQuadriceps4 = new javax.swing.JPanel();
        boxAga4 = new javax.swing.JCheckBox();
        boxAgaF4 = new javax.swing.JCheckBox();
        boxAgaH4 = new javax.swing.JCheckBox();
        boxPrensa4 = new javax.swing.JCheckBox();
        boxAfundoQ4 = new javax.swing.JCheckBox();
        boxAfuncoB4 = new javax.swing.JCheckBox();
        boxExtensora4 = new javax.swing.JCheckBox();
        painelGluteo4 = new javax.swing.JPanel();
        boxElevQuadril4 = new javax.swing.JCheckBox();
        boxAgaHalter4 = new javax.swing.JCheckBox();
        boxKick4 = new javax.swing.JCheckBox();
        boxAbdPerna4 = new javax.swing.JCheckBox();
        boxAfundoG4 = new javax.swing.JCheckBox();
        boxAgaLivre4 = new javax.swing.JCheckBox();
        boxAgaSumo4 = new javax.swing.JCheckBox();
        boxStiff4 = new javax.swing.JCheckBox();
        painelPanturrilha4 = new javax.swing.JPanel();
        boxEmPe4 = new javax.swing.JCheckBox();
        boxPantLeg4 = new javax.swing.JCheckBox();
        boxEmPeU4 = new javax.swing.JCheckBox();
        boxPanSentado4 = new javax.swing.JCheckBox();
        boxPanBarra4 = new javax.swing.JCheckBox();
        boxDonkey4 = new javax.swing.JCheckBox();
        boxPanSalto4 = new javax.swing.JCheckBox();
        boxPanUni4 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        boxEsteiraP = new javax.swing.JCheckBox();
        boxBikeP = new javax.swing.JCheckBox();
        boxAbdomenP = new javax.swing.JCheckBox();
        lblBikeP = new javax.swing.JTextField();
        lblEsteiraP = new javax.swing.JTextField();
        lblAbdomenP = new javax.swing.JTextField();
        combEsteiraP = new javax.swing.JComboBox<>();
        combBikeP = new javax.swing.JComboBox<>();
        combAbdomenP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro/Alteração/Exclusão visitante");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPesquisa.setText("PESQUISAR");

        btnExcluir.setText("EXCLUIR");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");

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
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtNome.setText("Nome:");

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

        lblSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        txtCivil.setText("Estado civil:");

        lblCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorsiado" }));

        txtProfi.setText("Profissão:");

        txtCpf.setText("CPF:");

        txtRg.setText("RG:");

        txtUf.setText("UF - RG:");

        lblUfRg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AF", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "SC", "SE", "SP", "TO" }));

        txtTel.setText("Telefone:");

        txtEnd.setText("Endereço:");

        txtNum.setText("Número:");

        txtCompl.setText("Complemento:");

        txtBairro.setText("Bairro:");

        txtCidade.setText("Cidade:");

        txtCep.setText("CEP:");

        txtUfC.setText("UF:");

        lblUfC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AF", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "SC", "SE", "SP", "TO" }));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtProf.setText("Professor Responsável:");

        txtQuestionario.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtQuestionario.setText("Questionário");

        txtBebe.setText("Bebe:");

        lblBebe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtFuma.setText("Fuma:");

        lblFuma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtTreinou.setText("Já treinou ?");

        lblTreinou.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        txtP1.setText("Como conheceu a academia ?");

        txtP2.setText("Gosta de treinar ou é por saúde ?");

        txtP3.setText("Quanto tempo ?");

        txtMod.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtMod.setText("Modalidade desejada");

        lblHip.setText("Hipertrofia");

        lblAero.setText("Aeróbico");

        lblNat.setText("Natação");

        lblBox.setText("Box");

        lblZumba.setText("Zumba");

        lblDanca.setText("Dança");

        lblBale.setText("Ballet");

        lblFisio.setText("Fisio");

        lblCross.setText("Cross Fit");

        lblIoga.setText("Ioga");

        lblTenis.setText("Tênis");

        lblBasq.setText("Basquete");

        lblTf.setText("Treinamento funcional");

        lblTi.setText("Treinamento intervalado de alta intensidade");

        lblVolei.setText("Volei");

        lblBfit.setText("Ballet Fitness");

        javax.swing.GroupLayout painelModalidadesLayout = new javax.swing.GroupLayout(painelModalidades);
        painelModalidades.setLayout(painelModalidadesLayout);
        painelModalidadesLayout.setHorizontalGroup(
            painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModalidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHip)
                    .addComponent(lblAero)
                    .addComponent(lblNat)
                    .addComponent(lblBox))
                .addGap(18, 18, 18)
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFisio)
                    .addComponent(lblBale)
                    .addComponent(lblDanca)
                    .addComponent(lblZumba))
                .addGap(18, 18, 18)
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCross)
                    .addComponent(lblIoga)
                    .addComponent(lblTenis)
                    .addComponent(lblBasq))
                .addGap(18, 18, 18)
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBfit)
                    .addComponent(lblVolei)
                    .addComponent(lblTi)
                    .addComponent(lblTf))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        painelModalidadesLayout.setVerticalGroup(
            painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModalidadesLayout.createSequentialGroup()
                .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelModalidadesLayout.createSequentialGroup()
                        .addComponent(lblHip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBox))
                    .addGroup(painelModalidadesLayout.createSequentialGroup()
                        .addComponent(lblZumba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFisio))
                    .addGroup(painelModalidadesLayout.createSequentialGroup()
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCross)
                            .addComponent(lblTf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIoga)
                            .addComponent(lblTi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenis)
                            .addComponent(lblVolei))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelModalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBasq)
                            .addComponent(lblBfit))))
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
                        .addComponent(lblFuma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblP2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTreinou)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTreinou, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblP3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtBebe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBebe, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtQuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txtP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblP1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelModalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelModalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProf)
                            .addComponent(lblProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuestionario)
                            .addComponent(txtMod))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBebe)
                            .addComponent(lblBebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP1)
                            .addComponent(lblP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFuma)
                            .addComponent(lblFuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP2)
                            .addComponent(lblP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTreinou)
                            .addComponent(lblTreinou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP3)
                            .addComponent(lblP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("FOTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
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
                                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(lblUfC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(lblUfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCivil)
                            .addComponent(lblCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProfi)
                            .addComponent(lblProfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg)
                            .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUf)
                            .addComponent(lblUfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(lblUfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStatus)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Dados cadastrais", painelDados);

        jPanel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Quantos dias treinará :");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 dia", "2 dias", "3 dias", "4 dias", "5 dias", "6 dias", "1 semana", "15 dias", "3 semanas" }));

        jLabel16.setText("Qual horário :");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setText("Como foi sua experiência aqui na nossa academia ?");

        jScrollPane3.setViewportView(jTextPane2);

        jLabel14.setText("Voltaria ou seria um aluno da academia ?");

        jScrollPane4.setViewportView(jTextPane3);

        jScrollPane10.setViewportView(jTextPane9);

        jLabel18.setText("Nos de alguma dica para melhorar alguma coisa na academia ...");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane10)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 844, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelDadosProfissionaisLayout = new javax.swing.GroupLayout(painelDadosProfissionais);
        painelDadosProfissionais.setLayout(painelDadosProfissionaisLayout);
        painelDadosProfissionaisLayout.setHorizontalGroup(
            painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        painelDadosProfissionaisLayout.setVerticalGroup(
            painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Permanência na academia", painelDadosProfissionais);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAbdomem.setText("Abdomem:");

        lblAbdomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAbdomemActionPerformed(evt);
            }
        });

        txtAnteBraco.setText("Antebraço Esq:");

        lblAnteBraco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAnteBracoActionPerformed(evt);
            }
        });

        txtAnteBraco1.setText("Antebraço Dir:");

        lblAnteBraco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAnteBraco1ActionPerformed(evt);
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

        lblAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAlturaActionPerformed(evt);
            }
        });

        txtCoxaDir.setText("Coxa Dir:");

        lblCoxadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCoxadirActionPerformed(evt);
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

        lblCoxaEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCoxaEsqActionPerformed(evt);
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
                                .addComponent(txtAnteBraco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnteBraco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnteBraco1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnteBraco1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(lblCoxadir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtAnteBraco)
                    .addComponent(lblAnteBraco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnteBraco1)
                    .addComponent(lblAnteBraco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblCoxadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(269, Short.MAX_VALUE))
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
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mapeamento corporal", painelPerimetria);

        jLabel2.setText("Nome:");

        lblNomeTreino.setText("NOME DO ALUNO");

        lblNomeProfessorTreino.setText("NOME DO PROFESSOR");

        jLabel3.setText("Professor:");

        jLabel4.setText("Data início treino:");

        jLabel5.setText("Data término treino:");

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setText("Exercício/Tempo");

        jCheckBox1.setText("Esteira");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Bicicleta");

        jCheckBox3.setText("Abdomem");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas", "Repetições" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pré treino");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Pós treino");

        painelPeito6.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto6.setText("Supino Reto");

        boxSupinoInclinado6.setText("Supino Inclinado");

        boxCanadense6.setText("Supino Declinado");

        boxPeck6.setText("Peck Deck");

        boxCrucifixo6.setText("Crucifixo");

        boxFlexao6.setText("Flexão");

        javax.swing.GroupLayout painelPeito6Layout = new javax.swing.GroupLayout(painelPeito6);
        painelPeito6.setLayout(painelPeito6Layout);
        painelPeito6Layout.setHorizontalGroup(
            painelPeito6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto6)
                    .addComponent(boxSupinoInclinado6)
                    .addComponent(boxCanadense6)
                    .addComponent(boxPeck6)
                    .addComponent(boxCrucifixo6)
                    .addComponent(boxFlexao6)))
        );
        painelPeito6Layout.setVerticalGroup(
            painelPeito6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas6.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas6.setText("Puxada Costas");

        boxPuFrente6.setText("Puxada Frente");

        boxPuFrenteI6.setText("Puxada Frente Inv");

        boxRemadaB6.setText("Remada Baixa");
        boxRemadaB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB6ActionPerformed(evt);
            }
        });

        boxRemadaUni6.setText("Remada Unilateral");

        boxVoador6.setText("Voador");

        javax.swing.GroupLayout painelCostas6Layout = new javax.swing.GroupLayout(painelCostas6);
        painelCostas6.setLayout(painelCostas6Layout);
        painelCostas6Layout.setHorizontalGroup(
            painelCostas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas6)
                    .addComponent(boxPuFrente6)
                    .addComponent(boxPuFrenteI6)
                    .addComponent(boxRemadaB6)
                    .addComponent(boxRemadaUni6)
                    .addComponent(boxVoador6))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas6Layout.setVerticalGroup(
            painelCostas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral6.setText("Elevação Lat");

        boxEleFrontal6.setText("Elevação Front");

        boxRotacaoI6.setText("Rotação Interna");

        boxRotacaoE6.setText("Rotação Externa");

        boxDesComBarra6.setText("Desenv. c/ Barra");

        boxCrossI6.setText("Cross Invertido");

        BoxRemAlta6.setText("Remada Alta");

        boxEncOmbro6.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro6Layout = new javax.swing.GroupLayout(painelOmbro6);
        painelOmbro6.setLayout(painelOmbro6Layout);
        painelOmbro6Layout.setHorizontalGroup(
            painelOmbro6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral6)
                    .addComponent(boxEleFrontal6)
                    .addComponent(boxRotacaoI6)
                    .addComponent(boxRotacaoE6)
                    .addComponent(boxDesComBarra6)
                    .addComponent(boxCrossI6)
                    .addComponent(BoxRemAlta6)
                    .addComponent(boxEncOmbro6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro6Layout.setVerticalGroup(
            painelOmbro6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps6.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD6.setText("Rosca Direta");

        boxScoty6.setText("Banco Scoty");

        boxMartelo6.setText("Martelinho");

        boxRoscaI6.setText("Rosca Indireta");

        box27.setText("Rosca 21");

        boxRoscaA6.setText("Rosca Alternada");

        BoscaRoscaC6.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps6Layout = new javax.swing.GroupLayout(painelBiceps6);
        painelBiceps6.setLayout(painelBiceps6Layout);
        painelBiceps6Layout.setHorizontalGroup(
            painelBiceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD6)
                    .addComponent(boxScoty6)
                    .addComponent(boxMartelo6)
                    .addComponent(boxRoscaI6)
                    .addComponent(box27)
                    .addComponent(boxRoscaA6)
                    .addComponent(BoscaRoscaC6))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps6Layout.setVerticalGroup(
            painelBiceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps6.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta6.setText("Testa");

        boxPulley6.setText("Pulley");

        boxCrossV6.setText("Cross Barra V");
        boxCrossV6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV6ActionPerformed(evt);
            }
        });

        boxCrossBarraR6.setText("Cross Barra Reta");

        boxFundos6.setText("Fundos em Máquina");

        boxTriSupinado6.setText("Supino Pega Junta");

        boxExtTriceps6.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps6Layout = new javax.swing.GroupLayout(painelTriceps6);
        painelTriceps6.setLayout(painelTriceps6Layout);
        painelTriceps6Layout.setHorizontalGroup(
            painelTriceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV6)
                    .addComponent(boxTesta6)
                    .addComponent(boxPulley6)
                    .addComponent(boxCrossBarraR6)
                    .addComponent(boxFundos6)
                    .addComponent(boxTriSupinado6)
                    .addComponent(boxExtTriceps6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps6Layout.setVerticalGroup(
            painelTriceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps6.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga6.setText("Agachamento");

        boxAgaF6.setText("Agachamento Front");

        boxAgaH6.setText("Agachamento Hack");

        boxPrensa6.setText("Prensa 90º");

        boxAfundoQ6.setText("Afundo");

        boxAfuncoB6.setText("Afundo c/ Barra");

        boxExtensora6.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps6Layout = new javax.swing.GroupLayout(painelQuadriceps6);
        painelQuadriceps6.setLayout(painelQuadriceps6Layout);
        painelQuadriceps6Layout.setHorizontalGroup(
            painelQuadriceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga6)
                    .addComponent(boxAgaF6)
                    .addComponent(boxAgaH6)
                    .addComponent(boxPrensa6)
                    .addComponent(boxAfundoQ6)
                    .addComponent(boxAfuncoB6)
                    .addComponent(boxExtensora6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps6Layout.setVerticalGroup(
            painelQuadriceps6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo6.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril6.setText("Ele. Quadril");

        boxAgaHalter6.setText("Aga. c/ Halter");

        boxKick6.setText("Kickbacks");

        boxAbdPerna6.setText("Abd. de Perna");

        boxAfundoG6.setText("Afundo");

        boxAgaLivre6.setText("Aga. Livre");

        boxAgaSumo6.setText("Aga. Sumo");

        boxStiff6.setText("Stiff");

        javax.swing.GroupLayout painelGluteo6Layout = new javax.swing.GroupLayout(painelGluteo6);
        painelGluteo6.setLayout(painelGluteo6Layout);
        painelGluteo6Layout.setHorizontalGroup(
            painelGluteo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril6)
                    .addComponent(boxAgaHalter6)
                    .addComponent(boxKick6)
                    .addComponent(boxAbdPerna6)
                    .addComponent(boxAfundoG6)
                    .addComponent(boxAgaLivre6)
                    .addComponent(boxAgaSumo6)
                    .addComponent(boxStiff6))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo6Layout.setVerticalGroup(
            painelGluteo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha6.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe6.setText("Em pé");

        boxPantLeg6.setText("Leg Press");

        boxEmPeU6.setText("Em pé Uni");

        boxPanSentado6.setText("Ele. Sentado");

        boxPanBarra6.setText("C/ Barra");

        boxDonkey6.setText("Ele. Donkey");

        boxPanSalto6.setText("C/ Salto");

        boxPanUni6.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha6Layout = new javax.swing.GroupLayout(painelPanturrilha6);
        painelPanturrilha6.setLayout(painelPanturrilha6Layout);
        painelPanturrilha6Layout.setHorizontalGroup(
            painelPanturrilha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe6)
                    .addComponent(boxPantLeg6)
                    .addComponent(boxEmPeU6)
                    .addComponent(boxPanSentado6)
                    .addComponent(boxPanBarra6)
                    .addComponent(boxDonkey6)
                    .addComponent(boxPanSalto6)
                    .addComponent(boxPanUni6))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha6Layout.setVerticalGroup(
            painelPanturrilha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni6)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino A", jPanel8);

        painelPeito5.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto5.setText("Supino Reto");

        boxSupinoInclinado5.setText("Supino Inclinado");

        boxCanadense5.setText("Supino Declinado");

        boxPeck5.setText("Peck Deck");

        boxCrucifixo5.setText("Crucifixo");

        boxFlexao5.setText("Flexão");

        javax.swing.GroupLayout painelPeito5Layout = new javax.swing.GroupLayout(painelPeito5);
        painelPeito5.setLayout(painelPeito5Layout);
        painelPeito5Layout.setHorizontalGroup(
            painelPeito5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto5)
                    .addComponent(boxSupinoInclinado5)
                    .addComponent(boxCanadense5)
                    .addComponent(boxPeck5)
                    .addComponent(boxCrucifixo5)
                    .addComponent(boxFlexao5)))
        );
        painelPeito5Layout.setVerticalGroup(
            painelPeito5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas5.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas5.setText("Puxada Costas");

        boxPuFrente5.setText("Puxada Frente");

        boxPuFrenteI5.setText("Puxada Frente Inv");

        boxRemadaB5.setText("Remada Baixa");
        boxRemadaB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB5ActionPerformed(evt);
            }
        });

        boxRemadaUni5.setText("Remada Unilateral");

        boxVoador5.setText("Voador");

        javax.swing.GroupLayout painelCostas5Layout = new javax.swing.GroupLayout(painelCostas5);
        painelCostas5.setLayout(painelCostas5Layout);
        painelCostas5Layout.setHorizontalGroup(
            painelCostas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas5)
                    .addComponent(boxPuFrente5)
                    .addComponent(boxPuFrenteI5)
                    .addComponent(boxRemadaB5)
                    .addComponent(boxRemadaUni5)
                    .addComponent(boxVoador5))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas5Layout.setVerticalGroup(
            painelCostas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral5.setText("Elevação Lat");

        boxEleFrontal5.setText("Elevação Front");

        boxRotacaoI5.setText("Rotação Interna");

        boxRotacaoE5.setText("Rotação Externa");

        boxDesComBarra5.setText("Desenv. c/ Barra");

        boxCrossI5.setText("Cross Invertido");

        BoxRemAlta5.setText("Remada Alta");

        boxEncOmbro5.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro5Layout = new javax.swing.GroupLayout(painelOmbro5);
        painelOmbro5.setLayout(painelOmbro5Layout);
        painelOmbro5Layout.setHorizontalGroup(
            painelOmbro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral5)
                    .addComponent(boxEleFrontal5)
                    .addComponent(boxRotacaoI5)
                    .addComponent(boxRotacaoE5)
                    .addComponent(boxDesComBarra5)
                    .addComponent(boxCrossI5)
                    .addComponent(BoxRemAlta5)
                    .addComponent(boxEncOmbro5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro5Layout.setVerticalGroup(
            painelOmbro5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps5.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD5.setText("Rosca Direta");

        boxScoty5.setText("Banco Scoty");

        boxMartelo5.setText("Martelinho");

        boxRoscaI5.setText("Rosca Indireta");

        box26.setText("Rosca 21");

        boxRoscaA5.setText("Rosca Alternada");

        BoscaRoscaC5.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps5Layout = new javax.swing.GroupLayout(painelBiceps5);
        painelBiceps5.setLayout(painelBiceps5Layout);
        painelBiceps5Layout.setHorizontalGroup(
            painelBiceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD5)
                    .addComponent(boxScoty5)
                    .addComponent(boxMartelo5)
                    .addComponent(boxRoscaI5)
                    .addComponent(box26)
                    .addComponent(boxRoscaA5)
                    .addComponent(BoscaRoscaC5))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps5Layout.setVerticalGroup(
            painelBiceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta5.setText("Testa");

        boxPulley5.setText("Pulley");

        boxCrossV5.setText("Cross Barra V");
        boxCrossV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV5ActionPerformed(evt);
            }
        });

        boxCrossBarraR5.setText("Cross Barra Reta");

        boxFundos5.setText("Fundos em Máquina");

        boxTriSupinado5.setText("Supino Pega Junta");

        boxExtTriceps5.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps5Layout = new javax.swing.GroupLayout(painelTriceps5);
        painelTriceps5.setLayout(painelTriceps5Layout);
        painelTriceps5Layout.setHorizontalGroup(
            painelTriceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV5)
                    .addComponent(boxTesta5)
                    .addComponent(boxPulley5)
                    .addComponent(boxCrossBarraR5)
                    .addComponent(boxFundos5)
                    .addComponent(boxTriSupinado5)
                    .addComponent(boxExtTriceps5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps5Layout.setVerticalGroup(
            painelTriceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps5.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga5.setText("Agachamento");

        boxAgaF5.setText("Agachamento Front");

        boxAgaH5.setText("Agachamento Hack");

        boxPrensa5.setText("Prensa 90º");

        boxAfundoQ5.setText("Afundo");

        boxAfuncoB5.setText("Afundo c/ Barra");

        boxExtensora5.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps5Layout = new javax.swing.GroupLayout(painelQuadriceps5);
        painelQuadriceps5.setLayout(painelQuadriceps5Layout);
        painelQuadriceps5Layout.setHorizontalGroup(
            painelQuadriceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga5)
                    .addComponent(boxAgaF5)
                    .addComponent(boxAgaH5)
                    .addComponent(boxPrensa5)
                    .addComponent(boxAfundoQ5)
                    .addComponent(boxAfuncoB5)
                    .addComponent(boxExtensora5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps5Layout.setVerticalGroup(
            painelQuadriceps5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo5.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril5.setText("Ele. Quadril");

        boxAgaHalter5.setText("Aga. c/ Halter");

        boxKick5.setText("Kickbacks");

        boxAbdPerna5.setText("Abd. de Perna");

        boxAfundoG5.setText("Afundo");

        boxAgaLivre5.setText("Aga. Livre");

        boxAgaSumo5.setText("Aga. Sumo");

        boxStiff5.setText("Stiff");

        javax.swing.GroupLayout painelGluteo5Layout = new javax.swing.GroupLayout(painelGluteo5);
        painelGluteo5.setLayout(painelGluteo5Layout);
        painelGluteo5Layout.setHorizontalGroup(
            painelGluteo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril5)
                    .addComponent(boxAgaHalter5)
                    .addComponent(boxKick5)
                    .addComponent(boxAbdPerna5)
                    .addComponent(boxAfundoG5)
                    .addComponent(boxAgaLivre5)
                    .addComponent(boxAgaSumo5)
                    .addComponent(boxStiff5))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo5Layout.setVerticalGroup(
            painelGluteo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha5.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe5.setText("Em pé");

        boxPantLeg5.setText("Leg Press");

        boxEmPeU5.setText("Em pé Uni");

        boxPanSentado5.setText("Ele. Sentado");

        boxPanBarra5.setText("C/ Barra");

        boxDonkey5.setText("Ele. Donkey");

        boxPanSalto5.setText("C/ Salto");

        boxPanUni5.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha5Layout = new javax.swing.GroupLayout(painelPanturrilha5);
        painelPanturrilha5.setLayout(painelPanturrilha5Layout);
        painelPanturrilha5Layout.setHorizontalGroup(
            painelPanturrilha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe5)
                    .addComponent(boxPantLeg5)
                    .addComponent(boxEmPeU5)
                    .addComponent(boxPanSentado5)
                    .addComponent(boxPanBarra5)
                    .addComponent(boxDonkey5)
                    .addComponent(boxPanSalto5)
                    .addComponent(boxPanUni5))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha5Layout.setVerticalGroup(
            painelPanturrilha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni5)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino B", jPanel9);

        painelPeito4.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto4.setText("Supino Reto");

        boxSupinoInclinado4.setText("Supino Inclinado");

        boxCanadense4.setText("Supino Declinado");

        boxPeck4.setText("Peck Deck");

        boxCrucifixo4.setText("Crucifixo");

        boxFlexao4.setText("Flexão");

        javax.swing.GroupLayout painelPeito4Layout = new javax.swing.GroupLayout(painelPeito4);
        painelPeito4.setLayout(painelPeito4Layout);
        painelPeito4Layout.setHorizontalGroup(
            painelPeito4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto4)
                    .addComponent(boxSupinoInclinado4)
                    .addComponent(boxCanadense4)
                    .addComponent(boxPeck4)
                    .addComponent(boxCrucifixo4)
                    .addComponent(boxFlexao4)))
        );
        painelPeito4Layout.setVerticalGroup(
            painelPeito4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas4.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas4.setText("Puxada Costas");

        boxPuFrente4.setText("Puxada Frente");

        boxPuFrenteI4.setText("Puxada Frente Inv");

        boxRemadaB4.setText("Remada Baixa");
        boxRemadaB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB4ActionPerformed(evt);
            }
        });

        boxRemadaUni4.setText("Remada Unilateral");

        boxVoador4.setText("Voador");

        javax.swing.GroupLayout painelCostas4Layout = new javax.swing.GroupLayout(painelCostas4);
        painelCostas4.setLayout(painelCostas4Layout);
        painelCostas4Layout.setHorizontalGroup(
            painelCostas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas4)
                    .addComponent(boxPuFrente4)
                    .addComponent(boxPuFrenteI4)
                    .addComponent(boxRemadaB4)
                    .addComponent(boxRemadaUni4)
                    .addComponent(boxVoador4))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas4Layout.setVerticalGroup(
            painelCostas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral4.setText("Elevação Lat");

        boxEleFrontal4.setText("Elevação Front");

        boxRotacaoI4.setText("Rotação Interna");

        boxRotacaoE4.setText("Rotação Externa");

        boxDesComBarra4.setText("Desenv. c/ Barra");

        boxCrossI4.setText("Cross Invertido");

        BoxRemAlta4.setText("Remada Alta");

        boxEncOmbro4.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro4Layout = new javax.swing.GroupLayout(painelOmbro4);
        painelOmbro4.setLayout(painelOmbro4Layout);
        painelOmbro4Layout.setHorizontalGroup(
            painelOmbro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral4)
                    .addComponent(boxEleFrontal4)
                    .addComponent(boxRotacaoI4)
                    .addComponent(boxRotacaoE4)
                    .addComponent(boxDesComBarra4)
                    .addComponent(boxCrossI4)
                    .addComponent(BoxRemAlta4)
                    .addComponent(boxEncOmbro4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro4Layout.setVerticalGroup(
            painelOmbro4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps4.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD4.setText("Rosca Direta");

        boxScoty4.setText("Banco Scoty");

        boxMartelo4.setText("Martelinho");

        boxRoscaI4.setText("Rosca Indireta");

        box25.setText("Rosca 21");

        boxRoscaA4.setText("Rosca Alternada");

        BoscaRoscaC4.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps4Layout = new javax.swing.GroupLayout(painelBiceps4);
        painelBiceps4.setLayout(painelBiceps4Layout);
        painelBiceps4Layout.setHorizontalGroup(
            painelBiceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD4)
                    .addComponent(boxScoty4)
                    .addComponent(boxMartelo4)
                    .addComponent(boxRoscaI4)
                    .addComponent(box25)
                    .addComponent(boxRoscaA4)
                    .addComponent(BoscaRoscaC4))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps4Layout.setVerticalGroup(
            painelBiceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta4.setText("Testa");

        boxPulley4.setText("Pulley");

        boxCrossV4.setText("Cross Barra V");
        boxCrossV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV4ActionPerformed(evt);
            }
        });

        boxCrossBarraR4.setText("Cross Barra Reta");

        boxFundos4.setText("Fundos em Máquina");

        boxTriSupinado4.setText("Supino Pega Junta");

        boxExtTriceps4.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps4Layout = new javax.swing.GroupLayout(painelTriceps4);
        painelTriceps4.setLayout(painelTriceps4Layout);
        painelTriceps4Layout.setHorizontalGroup(
            painelTriceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV4)
                    .addComponent(boxTesta4)
                    .addComponent(boxPulley4)
                    .addComponent(boxCrossBarraR4)
                    .addComponent(boxFundos4)
                    .addComponent(boxTriSupinado4)
                    .addComponent(boxExtTriceps4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps4Layout.setVerticalGroup(
            painelTriceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps4.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga4.setText("Agachamento");

        boxAgaF4.setText("Agachamento Front");

        boxAgaH4.setText("Agachamento Hack");

        boxPrensa4.setText("Prensa 90º");

        boxAfundoQ4.setText("Afundo");

        boxAfuncoB4.setText("Afundo c/ Barra");

        boxExtensora4.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps4Layout = new javax.swing.GroupLayout(painelQuadriceps4);
        painelQuadriceps4.setLayout(painelQuadriceps4Layout);
        painelQuadriceps4Layout.setHorizontalGroup(
            painelQuadriceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga4)
                    .addComponent(boxAgaF4)
                    .addComponent(boxAgaH4)
                    .addComponent(boxPrensa4)
                    .addComponent(boxAfundoQ4)
                    .addComponent(boxAfuncoB4)
                    .addComponent(boxExtensora4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps4Layout.setVerticalGroup(
            painelQuadriceps4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo4.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril4.setText("Ele. Quadril");

        boxAgaHalter4.setText("Aga. c/ Halter");

        boxKick4.setText("Kickbacks");

        boxAbdPerna4.setText("Abd. de Perna");

        boxAfundoG4.setText("Afundo");

        boxAgaLivre4.setText("Aga. Livre");

        boxAgaSumo4.setText("Aga. Sumo");

        boxStiff4.setText("Stiff");

        javax.swing.GroupLayout painelGluteo4Layout = new javax.swing.GroupLayout(painelGluteo4);
        painelGluteo4.setLayout(painelGluteo4Layout);
        painelGluteo4Layout.setHorizontalGroup(
            painelGluteo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril4)
                    .addComponent(boxAgaHalter4)
                    .addComponent(boxKick4)
                    .addComponent(boxAbdPerna4)
                    .addComponent(boxAfundoG4)
                    .addComponent(boxAgaLivre4)
                    .addComponent(boxAgaSumo4)
                    .addComponent(boxStiff4))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo4Layout.setVerticalGroup(
            painelGluteo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha4.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe4.setText("Em pé");

        boxPantLeg4.setText("Leg Press");

        boxEmPeU4.setText("Em pé Uni");

        boxPanSentado4.setText("Ele. Sentado");

        boxPanBarra4.setText("C/ Barra");

        boxDonkey4.setText("Ele. Donkey");

        boxPanSalto4.setText("C/ Salto");

        boxPanUni4.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha4Layout = new javax.swing.GroupLayout(painelPanturrilha4);
        painelPanturrilha4.setLayout(painelPanturrilha4Layout);
        painelPanturrilha4Layout.setHorizontalGroup(
            painelPanturrilha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe4)
                    .addComponent(boxPantLeg4)
                    .addComponent(boxEmPeU4)
                    .addComponent(boxPanSentado4)
                    .addComponent(boxPanBarra4)
                    .addComponent(boxDonkey4)
                    .addComponent(boxPanSalto4)
                    .addComponent(boxPanUni4))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha4Layout.setVerticalGroup(
            painelPanturrilha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni4)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino C", jPanel10);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        combAbdomenP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Minutos", "Hora", "Horas", "Repetições" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
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
                        .addComponent(combAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEsteiraP)
                    .addComponent(lblEsteiraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combEsteiraP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxBikeP)
                    .addComponent(lblBikeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combBikeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAbdomenP)
                    .addComponent(lblAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combAbdomenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeProfessorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelTreinoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelTreinoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2)))
        );
        painelTreinoLayout.setVerticalGroup(
            painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNomeTreino)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblNomeProfessorTreino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Treino", painelTreino);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void boxEsteiraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraPActionPerformed

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

    private void lblCoxadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCoxadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCoxadirActionPerformed

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

    private void lblAnteBraco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnteBraco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnteBraco1ActionPerformed

    private void lblAnteBracoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAnteBracoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnteBracoActionPerformed

    private void lblAbdomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAbdomemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAbdomemActionPerformed

    private void lblNasciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNasciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNasciActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int retorno = JOptionPane.showConfirmDialog(null, "As alterações não forão salvas. Deseja realmente sair ?");
        if(retorno == 0){
            this.dispose(); new TelaPrincipal().setVisible(false);
            //exit(0);
        }
        else{
            //não faz nada
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void boxRemadaB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB4ActionPerformed

    private void boxCrossV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV4ActionPerformed

    private void boxRemadaB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB5ActionPerformed

    private void boxCrossV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV5ActionPerformed

    private void boxRemadaB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB6ActionPerformed

    private void boxCrossV6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV6ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    /*---------------TESTE SEM AS CLASSES PRINCIPAIS----------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*--------------------------------------------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    /*--------------------------------------------------------------------------------------------------------    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadVisitante().setVisible(true);
            }
        });
    }
-------------------------TESTE SEM AS CLASSES PRINCIPAIS--------------------------------------------------------*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoscaRoscaC4;
    private javax.swing.JCheckBox BoscaRoscaC5;
    private javax.swing.JCheckBox BoscaRoscaC6;
    private javax.swing.JCheckBox BoxRemAlta4;
    private javax.swing.JCheckBox BoxRemAlta5;
    private javax.swing.JCheckBox BoxRemAlta6;
    private javax.swing.JCheckBox box25;
    private javax.swing.JCheckBox box26;
    private javax.swing.JCheckBox box27;
    private javax.swing.JCheckBox boxAbdPerna4;
    private javax.swing.JCheckBox boxAbdPerna5;
    private javax.swing.JCheckBox boxAbdPerna6;
    private javax.swing.JCheckBox boxAbdomenP;
    private javax.swing.JCheckBox boxAfuncoB4;
    private javax.swing.JCheckBox boxAfuncoB5;
    private javax.swing.JCheckBox boxAfuncoB6;
    private javax.swing.JCheckBox boxAfundoG4;
    private javax.swing.JCheckBox boxAfundoG5;
    private javax.swing.JCheckBox boxAfundoG6;
    private javax.swing.JCheckBox boxAfundoQ4;
    private javax.swing.JCheckBox boxAfundoQ5;
    private javax.swing.JCheckBox boxAfundoQ6;
    private javax.swing.JCheckBox boxAga4;
    private javax.swing.JCheckBox boxAga5;
    private javax.swing.JCheckBox boxAga6;
    private javax.swing.JCheckBox boxAgaF4;
    private javax.swing.JCheckBox boxAgaF5;
    private javax.swing.JCheckBox boxAgaF6;
    private javax.swing.JCheckBox boxAgaH4;
    private javax.swing.JCheckBox boxAgaH5;
    private javax.swing.JCheckBox boxAgaH6;
    private javax.swing.JCheckBox boxAgaHalter4;
    private javax.swing.JCheckBox boxAgaHalter5;
    private javax.swing.JCheckBox boxAgaHalter6;
    private javax.swing.JCheckBox boxAgaLivre4;
    private javax.swing.JCheckBox boxAgaLivre5;
    private javax.swing.JCheckBox boxAgaLivre6;
    private javax.swing.JCheckBox boxAgaSumo4;
    private javax.swing.JCheckBox boxAgaSumo5;
    private javax.swing.JCheckBox boxAgaSumo6;
    private javax.swing.JCheckBox boxBikeP;
    private javax.swing.JCheckBox boxCanadense4;
    private javax.swing.JCheckBox boxCanadense5;
    private javax.swing.JCheckBox boxCanadense6;
    private javax.swing.JCheckBox boxCrossBarraR4;
    private javax.swing.JCheckBox boxCrossBarraR5;
    private javax.swing.JCheckBox boxCrossBarraR6;
    private javax.swing.JCheckBox boxCrossI4;
    private javax.swing.JCheckBox boxCrossI5;
    private javax.swing.JCheckBox boxCrossI6;
    private javax.swing.JCheckBox boxCrossV4;
    private javax.swing.JCheckBox boxCrossV5;
    private javax.swing.JCheckBox boxCrossV6;
    private javax.swing.JCheckBox boxCrucifixo4;
    private javax.swing.JCheckBox boxCrucifixo5;
    private javax.swing.JCheckBox boxCrucifixo6;
    private javax.swing.JCheckBox boxDesComBarra4;
    private javax.swing.JCheckBox boxDesComBarra5;
    private javax.swing.JCheckBox boxDesComBarra6;
    private javax.swing.JCheckBox boxDonkey4;
    private javax.swing.JCheckBox boxDonkey5;
    private javax.swing.JCheckBox boxDonkey6;
    private javax.swing.JCheckBox boxEleFrontal4;
    private javax.swing.JCheckBox boxEleFrontal5;
    private javax.swing.JCheckBox boxEleFrontal6;
    private javax.swing.JCheckBox boxEleLateral4;
    private javax.swing.JCheckBox boxEleLateral5;
    private javax.swing.JCheckBox boxEleLateral6;
    private javax.swing.JCheckBox boxElevQuadril4;
    private javax.swing.JCheckBox boxElevQuadril5;
    private javax.swing.JCheckBox boxElevQuadril6;
    private javax.swing.JCheckBox boxEmPe4;
    private javax.swing.JCheckBox boxEmPe5;
    private javax.swing.JCheckBox boxEmPe6;
    private javax.swing.JCheckBox boxEmPeU4;
    private javax.swing.JCheckBox boxEmPeU5;
    private javax.swing.JCheckBox boxEmPeU6;
    private javax.swing.JCheckBox boxEncOmbro4;
    private javax.swing.JCheckBox boxEncOmbro5;
    private javax.swing.JCheckBox boxEncOmbro6;
    private javax.swing.JCheckBox boxEsteiraP;
    private javax.swing.JCheckBox boxExtTriceps4;
    private javax.swing.JCheckBox boxExtTriceps5;
    private javax.swing.JCheckBox boxExtTriceps6;
    private javax.swing.JCheckBox boxExtensora4;
    private javax.swing.JCheckBox boxExtensora5;
    private javax.swing.JCheckBox boxExtensora6;
    private javax.swing.JCheckBox boxFlexao4;
    private javax.swing.JCheckBox boxFlexao5;
    private javax.swing.JCheckBox boxFlexao6;
    private javax.swing.JCheckBox boxFundos4;
    private javax.swing.JCheckBox boxFundos5;
    private javax.swing.JCheckBox boxFundos6;
    private javax.swing.JCheckBox boxKick4;
    private javax.swing.JCheckBox boxKick5;
    private javax.swing.JCheckBox boxKick6;
    private javax.swing.JCheckBox boxMartelo4;
    private javax.swing.JCheckBox boxMartelo5;
    private javax.swing.JCheckBox boxMartelo6;
    private javax.swing.JCheckBox boxPanBarra4;
    private javax.swing.JCheckBox boxPanBarra5;
    private javax.swing.JCheckBox boxPanBarra6;
    private javax.swing.JCheckBox boxPanSalto4;
    private javax.swing.JCheckBox boxPanSalto5;
    private javax.swing.JCheckBox boxPanSalto6;
    private javax.swing.JCheckBox boxPanSentado4;
    private javax.swing.JCheckBox boxPanSentado5;
    private javax.swing.JCheckBox boxPanSentado6;
    private javax.swing.JCheckBox boxPanUni4;
    private javax.swing.JCheckBox boxPanUni5;
    private javax.swing.JCheckBox boxPanUni6;
    private javax.swing.JCheckBox boxPantLeg4;
    private javax.swing.JCheckBox boxPantLeg5;
    private javax.swing.JCheckBox boxPantLeg6;
    private javax.swing.JCheckBox boxPeck4;
    private javax.swing.JCheckBox boxPeck5;
    private javax.swing.JCheckBox boxPeck6;
    private javax.swing.JCheckBox boxPrensa4;
    private javax.swing.JCheckBox boxPrensa5;
    private javax.swing.JCheckBox boxPrensa6;
    private javax.swing.JCheckBox boxPuCostas4;
    private javax.swing.JCheckBox boxPuCostas5;
    private javax.swing.JCheckBox boxPuCostas6;
    private javax.swing.JCheckBox boxPuFrente4;
    private javax.swing.JCheckBox boxPuFrente5;
    private javax.swing.JCheckBox boxPuFrente6;
    private javax.swing.JCheckBox boxPuFrenteI4;
    private javax.swing.JCheckBox boxPuFrenteI5;
    private javax.swing.JCheckBox boxPuFrenteI6;
    private javax.swing.JCheckBox boxPulley4;
    private javax.swing.JCheckBox boxPulley5;
    private javax.swing.JCheckBox boxPulley6;
    private javax.swing.JCheckBox boxRemadaB4;
    private javax.swing.JCheckBox boxRemadaB5;
    private javax.swing.JCheckBox boxRemadaB6;
    private javax.swing.JCheckBox boxRemadaUni4;
    private javax.swing.JCheckBox boxRemadaUni5;
    private javax.swing.JCheckBox boxRemadaUni6;
    private javax.swing.JCheckBox boxRoscaA4;
    private javax.swing.JCheckBox boxRoscaA5;
    private javax.swing.JCheckBox boxRoscaA6;
    private javax.swing.JCheckBox boxRoscaD4;
    private javax.swing.JCheckBox boxRoscaD5;
    private javax.swing.JCheckBox boxRoscaD6;
    private javax.swing.JCheckBox boxRoscaI4;
    private javax.swing.JCheckBox boxRoscaI5;
    private javax.swing.JCheckBox boxRoscaI6;
    private javax.swing.JCheckBox boxRotacaoE4;
    private javax.swing.JCheckBox boxRotacaoE5;
    private javax.swing.JCheckBox boxRotacaoE6;
    private javax.swing.JCheckBox boxRotacaoI4;
    private javax.swing.JCheckBox boxRotacaoI5;
    private javax.swing.JCheckBox boxRotacaoI6;
    private javax.swing.JCheckBox boxScoty4;
    private javax.swing.JCheckBox boxScoty5;
    private javax.swing.JCheckBox boxScoty6;
    private javax.swing.JCheckBox boxStiff4;
    private javax.swing.JCheckBox boxStiff5;
    private javax.swing.JCheckBox boxStiff6;
    private javax.swing.JCheckBox boxSupinoInclinado4;
    private javax.swing.JCheckBox boxSupinoInclinado5;
    private javax.swing.JCheckBox boxSupinoInclinado6;
    private javax.swing.JCheckBox boxSupinoReto4;
    private javax.swing.JCheckBox boxSupinoReto5;
    private javax.swing.JCheckBox boxSupinoReto6;
    private javax.swing.JCheckBox boxTesta4;
    private javax.swing.JCheckBox boxTesta5;
    private javax.swing.JCheckBox boxTesta6;
    private javax.swing.JCheckBox boxTriSupinado4;
    private javax.swing.JCheckBox boxTriSupinado5;
    private javax.swing.JCheckBox boxTriSupinado6;
    private javax.swing.JCheckBox boxVoador4;
    private javax.swing.JCheckBox boxVoador5;
    private javax.swing.JCheckBox boxVoador6;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> combAbdomenP;
    private javax.swing.JComboBox<String> combBikeP;
    private javax.swing.JComboBox<String> combEsteiraP;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JTextField lblAbdomem;
    private javax.swing.JTextField lblAbdomenP;
    private javax.swing.JCheckBox lblAero;
    private javax.swing.JTextField lblAltura;
    private javax.swing.JTextField lblAnteBraco;
    private javax.swing.JTextField lblAnteBraco1;
    private javax.swing.JTextField lblBairro;
    private javax.swing.JCheckBox lblBale;
    private javax.swing.JCheckBox lblBasq;
    private javax.swing.JComboBox<String> lblBebe;
    private javax.swing.JCheckBox lblBfit;
    private javax.swing.JTextField lblBikeP;
    private javax.swing.JCheckBox lblBox;
    private javax.swing.JTextField lblBracoDirContraido;
    private javax.swing.JTextField lblBracoDirRelaxado;
    private javax.swing.JTextField lblBracoEsqContraido;
    private javax.swing.JTextField lblBracoEsqRelaxado;
    private javax.swing.JTextField lblCep;
    private javax.swing.JTextField lblCidade;
    private javax.swing.JTextField lblCintura;
    private javax.swing.JTextField lblCinturaEscapular;
    private javax.swing.JComboBox<String> lblCivil;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField lblCompl;
    private javax.swing.JTextField lblCoxaEsq;
    private javax.swing.JTextField lblCoxadir;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JCheckBox lblCross;
    private javax.swing.JCheckBox lblDanca;
    private javax.swing.JTextField lblEnd;
    private javax.swing.JTextField lblEsteiraP;
    private javax.swing.JCheckBox lblFisio;
    private javax.swing.JComboBox<String> lblFuma;
    private javax.swing.JCheckBox lblHip;
    private javax.swing.JCheckBox lblIoga;
    private javax.swing.JTextField lblNasci;
    private javax.swing.JCheckBox lblNat;
    private javax.swing.JTextField lblNome;
    private javax.swing.JLabel lblNomeProfessorTreino;
    private javax.swing.JLabel lblNomeTreino;
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
    private javax.swing.JComboBox<String> lblSexo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField lblTel;
    private javax.swing.JCheckBox lblTenis;
    private javax.swing.JCheckBox lblTf;
    private javax.swing.JCheckBox lblTi;
    private javax.swing.JComboBox<String> lblTreinou;
    private javax.swing.JComboBox<String> lblUfC;
    private javax.swing.JComboBox<String> lblUfRg;
    private javax.swing.JCheckBox lblVolei;
    private javax.swing.JCheckBox lblZumba;
    private javax.swing.JPanel painelBiceps4;
    private javax.swing.JPanel painelBiceps5;
    private javax.swing.JPanel painelBiceps6;
    private javax.swing.JPanel painelCostas4;
    private javax.swing.JPanel painelCostas5;
    private javax.swing.JPanel painelCostas6;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelDadosProfissionais;
    private javax.swing.JPanel painelGluteo4;
    private javax.swing.JPanel painelGluteo5;
    private javax.swing.JPanel painelGluteo6;
    private javax.swing.JPanel painelModalidades;
    private javax.swing.JPanel painelOmbro4;
    private javax.swing.JPanel painelOmbro5;
    private javax.swing.JPanel painelOmbro6;
    private javax.swing.JPanel painelPanturrilha4;
    private javax.swing.JPanel painelPanturrilha5;
    private javax.swing.JPanel painelPanturrilha6;
    private javax.swing.JPanel painelPeito4;
    private javax.swing.JPanel painelPeito5;
    private javax.swing.JPanel painelPeito6;
    private javax.swing.JPanel painelPerimetria;
    private javax.swing.JPanel painelQuadriceps4;
    private javax.swing.JPanel painelQuadriceps5;
    private javax.swing.JPanel painelQuadriceps6;
    private javax.swing.JPanel painelTreino;
    private javax.swing.JPanel painelTriceps4;
    private javax.swing.JPanel painelTriceps5;
    private javax.swing.JPanel painelTriceps6;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txtAbdomem;
    private javax.swing.JLabel txtAltura;
    private javax.swing.JLabel txtAltura1;
    private javax.swing.JLabel txtAnteBraco;
    private javax.swing.JLabel txtAnteBraco1;
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
    private javax.swing.JLabel txtEnd;
    private javax.swing.JLabel txtFuma;
    private javax.swing.JLabel txtMod;
    private javax.swing.JLabel txtNasci;
    private javax.swing.JLabel txtNome;
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
