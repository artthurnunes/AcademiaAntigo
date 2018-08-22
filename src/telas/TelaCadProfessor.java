
package telas;

import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TelaCadProfessor extends javax.swing.JFrame {
    

    public TelaCadProfessor() {
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
        BTNalterar = new javax.swing.JButton();
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
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
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
        jPanel9 = new javax.swing.JPanel();
        painelPeito3 = new javax.swing.JPanel();
        boxSupinoReto3 = new javax.swing.JCheckBox();
        boxSupinoInclinado3 = new javax.swing.JCheckBox();
        boxCanadense3 = new javax.swing.JCheckBox();
        boxPeck3 = new javax.swing.JCheckBox();
        boxCrucifixo3 = new javax.swing.JCheckBox();
        boxFlexao3 = new javax.swing.JCheckBox();
        painelCostas3 = new javax.swing.JPanel();
        boxPuCostas3 = new javax.swing.JCheckBox();
        boxPuFrente3 = new javax.swing.JCheckBox();
        boxPuFrenteI3 = new javax.swing.JCheckBox();
        boxRemadaB3 = new javax.swing.JCheckBox();
        boxRemadaUni3 = new javax.swing.JCheckBox();
        boxVoador3 = new javax.swing.JCheckBox();
        painelOmbro3 = new javax.swing.JPanel();
        boxEleLateral3 = new javax.swing.JCheckBox();
        boxEleFrontal3 = new javax.swing.JCheckBox();
        boxRotacaoI3 = new javax.swing.JCheckBox();
        boxRotacaoE3 = new javax.swing.JCheckBox();
        boxDesComBarra3 = new javax.swing.JCheckBox();
        boxCrossI3 = new javax.swing.JCheckBox();
        BoxRemAlta3 = new javax.swing.JCheckBox();
        boxEncOmbro3 = new javax.swing.JCheckBox();
        painelBiceps3 = new javax.swing.JPanel();
        boxRoscaD3 = new javax.swing.JCheckBox();
        boxScoty3 = new javax.swing.JCheckBox();
        boxMartelo3 = new javax.swing.JCheckBox();
        boxRoscaI3 = new javax.swing.JCheckBox();
        box24 = new javax.swing.JCheckBox();
        boxRoscaA3 = new javax.swing.JCheckBox();
        BoscaRoscaC3 = new javax.swing.JCheckBox();
        painelTriceps3 = new javax.swing.JPanel();
        boxTesta3 = new javax.swing.JCheckBox();
        boxPulley3 = new javax.swing.JCheckBox();
        boxCrossV3 = new javax.swing.JCheckBox();
        boxCrossBarraR3 = new javax.swing.JCheckBox();
        boxFundos3 = new javax.swing.JCheckBox();
        boxTriSupinado3 = new javax.swing.JCheckBox();
        boxExtTriceps3 = new javax.swing.JCheckBox();
        painelQuadriceps3 = new javax.swing.JPanel();
        boxAga3 = new javax.swing.JCheckBox();
        boxAgaF3 = new javax.swing.JCheckBox();
        boxAgaH3 = new javax.swing.JCheckBox();
        boxPrensa3 = new javax.swing.JCheckBox();
        boxAfundoQ3 = new javax.swing.JCheckBox();
        boxAfuncoB3 = new javax.swing.JCheckBox();
        boxExtensora3 = new javax.swing.JCheckBox();
        painelGluteo3 = new javax.swing.JPanel();
        boxElevQuadril3 = new javax.swing.JCheckBox();
        boxAgaHalter3 = new javax.swing.JCheckBox();
        boxKick3 = new javax.swing.JCheckBox();
        boxAbdPerna3 = new javax.swing.JCheckBox();
        boxAfundoG3 = new javax.swing.JCheckBox();
        boxAgaLivre3 = new javax.swing.JCheckBox();
        boxAgaSumo3 = new javax.swing.JCheckBox();
        boxStiff3 = new javax.swing.JCheckBox();
        painelPanturrilha3 = new javax.swing.JPanel();
        boxEmPe3 = new javax.swing.JCheckBox();
        boxPantLeg3 = new javax.swing.JCheckBox();
        boxEmPeU3 = new javax.swing.JCheckBox();
        boxPanSentado3 = new javax.swing.JCheckBox();
        boxPanBarra3 = new javax.swing.JCheckBox();
        boxDonkey3 = new javax.swing.JCheckBox();
        boxPanSalto3 = new javax.swing.JCheckBox();
        boxPanUni3 = new javax.swing.JCheckBox();
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
        setTitle("Cadastro/Alteração/Exclusão professor");

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

        BTNalterar.setText("ALTERAR");

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
                .addComponent(BTNalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
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
                    .addComponent(BTNalterar))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("FOTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Dados cadastrais", painelDados);

        jPanel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Formação academica :");

        jLabel11.setText("Formação academica :");

        jLabel12.setText("Formação academica :");

        jLabel13.setText("Experiência em Academia :");

        jScrollPane2.setViewportView(jTextPane1);

        jLabel14.setText("Horário de trabalho : ");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel14)))
                .addGap(27, 27, 27)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane4.setViewportView(jTextPane3);

        jLabel15.setText("Observações");

        jScrollPane3.setViewportView(jTextPane2);

        jLabel16.setText("Descrição de tarefas na academia");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setText("Dicas para melhorar o local de trabalho");

        jScrollPane5.setViewportView(jTextPane4);

        jScrollPane6.setViewportView(jTextPane5);

        jScrollPane7.setViewportView(jTextPane6);

        jScrollPane8.setViewportView(jTextPane7);

        jScrollPane9.setViewportView(jTextPane8);

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDadosProfissionaisLayout.setVerticalGroup(
            painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelDadosProfissionaisLayout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados Profissionais", painelDadosProfissionais);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mapeamento corporal", painelPerimetria);

        jLabel2.setText("Nome:");

        lblNomeTreino.setText("NOME DO ALUNO");

        lblNomeProfessorTreino.setText("NOME DO PROFESSOR");

        jLabel3.setText("Professor:");

        jLabel4.setText("Data início treino:");

        jLabel5.setText("Data término treino:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pré treino");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Pós treino");

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
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
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
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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

        jTabbedPane2.addTab("Treino A", jPanel8);

        painelPeito3.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto3.setText("Supino Reto");

        boxSupinoInclinado3.setText("Supino Inclinado");

        boxCanadense3.setText("Supino Declinado");

        boxPeck3.setText("Peck Deck");

        boxCrucifixo3.setText("Crucifixo");

        boxFlexao3.setText("Flexão");

        javax.swing.GroupLayout painelPeito3Layout = new javax.swing.GroupLayout(painelPeito3);
        painelPeito3.setLayout(painelPeito3Layout);
        painelPeito3Layout.setHorizontalGroup(
            painelPeito3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto3)
                    .addComponent(boxSupinoInclinado3)
                    .addComponent(boxCanadense3)
                    .addComponent(boxPeck3)
                    .addComponent(boxCrucifixo3)
                    .addComponent(boxFlexao3)))
        );
        painelPeito3Layout.setVerticalGroup(
            painelPeito3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas3.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas3.setText("Puxada Costas");

        boxPuFrente3.setText("Puxada Frente");

        boxPuFrenteI3.setText("Puxada Frente Inv");

        boxRemadaB3.setText("Remada Baixa");
        boxRemadaB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB3ActionPerformed(evt);
            }
        });

        boxRemadaUni3.setText("Remada Unilateral");

        boxVoador3.setText("Voador");

        javax.swing.GroupLayout painelCostas3Layout = new javax.swing.GroupLayout(painelCostas3);
        painelCostas3.setLayout(painelCostas3Layout);
        painelCostas3Layout.setHorizontalGroup(
            painelCostas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas3)
                    .addComponent(boxPuFrente3)
                    .addComponent(boxPuFrenteI3)
                    .addComponent(boxRemadaB3)
                    .addComponent(boxRemadaUni3)
                    .addComponent(boxVoador3))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas3Layout.setVerticalGroup(
            painelCostas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral3.setText("Elevação Lat");

        boxEleFrontal3.setText("Elevação Front");

        boxRotacaoI3.setText("Rotação Interna");

        boxRotacaoE3.setText("Rotação Externa");

        boxDesComBarra3.setText("Desenv. c/ Barra");

        boxCrossI3.setText("Cross Invertido");

        BoxRemAlta3.setText("Remada Alta");

        boxEncOmbro3.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro3Layout = new javax.swing.GroupLayout(painelOmbro3);
        painelOmbro3.setLayout(painelOmbro3Layout);
        painelOmbro3Layout.setHorizontalGroup(
            painelOmbro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral3)
                    .addComponent(boxEleFrontal3)
                    .addComponent(boxRotacaoI3)
                    .addComponent(boxRotacaoE3)
                    .addComponent(boxDesComBarra3)
                    .addComponent(boxCrossI3)
                    .addComponent(BoxRemAlta3)
                    .addComponent(boxEncOmbro3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro3Layout.setVerticalGroup(
            painelOmbro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps3.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD3.setText("Rosca Direta");

        boxScoty3.setText("Banco Scoty");

        boxMartelo3.setText("Martelinho");

        boxRoscaI3.setText("Rosca Indireta");

        box24.setText("Rosca 21");

        boxRoscaA3.setText("Rosca Alternada");

        BoscaRoscaC3.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps3Layout = new javax.swing.GroupLayout(painelBiceps3);
        painelBiceps3.setLayout(painelBiceps3Layout);
        painelBiceps3Layout.setHorizontalGroup(
            painelBiceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD3)
                    .addComponent(boxScoty3)
                    .addComponent(boxMartelo3)
                    .addComponent(boxRoscaI3)
                    .addComponent(box24)
                    .addComponent(boxRoscaA3)
                    .addComponent(BoscaRoscaC3))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps3Layout.setVerticalGroup(
            painelBiceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta3.setText("Testa");

        boxPulley3.setText("Pulley");

        boxCrossV3.setText("Cross Barra V");
        boxCrossV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV3ActionPerformed(evt);
            }
        });

        boxCrossBarraR3.setText("Cross Barra Reta");

        boxFundos3.setText("Fundos em Máquina");

        boxTriSupinado3.setText("Supino Pega Junta");

        boxExtTriceps3.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps3Layout = new javax.swing.GroupLayout(painelTriceps3);
        painelTriceps3.setLayout(painelTriceps3Layout);
        painelTriceps3Layout.setHorizontalGroup(
            painelTriceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV3)
                    .addComponent(boxTesta3)
                    .addComponent(boxPulley3)
                    .addComponent(boxCrossBarraR3)
                    .addComponent(boxFundos3)
                    .addComponent(boxTriSupinado3)
                    .addComponent(boxExtTriceps3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps3Layout.setVerticalGroup(
            painelTriceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps3.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga3.setText("Agachamento");

        boxAgaF3.setText("Agachamento Front");

        boxAgaH3.setText("Agachamento Hack");

        boxPrensa3.setText("Prensa 90º");

        boxAfundoQ3.setText("Afundo");

        boxAfuncoB3.setText("Afundo c/ Barra");

        boxExtensora3.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps3Layout = new javax.swing.GroupLayout(painelQuadriceps3);
        painelQuadriceps3.setLayout(painelQuadriceps3Layout);
        painelQuadriceps3Layout.setHorizontalGroup(
            painelQuadriceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga3)
                    .addComponent(boxAgaF3)
                    .addComponent(boxAgaH3)
                    .addComponent(boxPrensa3)
                    .addComponent(boxAfundoQ3)
                    .addComponent(boxAfuncoB3)
                    .addComponent(boxExtensora3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps3Layout.setVerticalGroup(
            painelQuadriceps3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo3.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril3.setText("Ele. Quadril");

        boxAgaHalter3.setText("Aga. c/ Halter");

        boxKick3.setText("Kickbacks");

        boxAbdPerna3.setText("Abd. de Perna");

        boxAfundoG3.setText("Afundo");

        boxAgaLivre3.setText("Aga. Livre");

        boxAgaSumo3.setText("Aga. Sumo");

        boxStiff3.setText("Stiff");

        javax.swing.GroupLayout painelGluteo3Layout = new javax.swing.GroupLayout(painelGluteo3);
        painelGluteo3.setLayout(painelGluteo3Layout);
        painelGluteo3Layout.setHorizontalGroup(
            painelGluteo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril3)
                    .addComponent(boxAgaHalter3)
                    .addComponent(boxKick3)
                    .addComponent(boxAbdPerna3)
                    .addComponent(boxAfundoG3)
                    .addComponent(boxAgaLivre3)
                    .addComponent(boxAgaSumo3)
                    .addComponent(boxStiff3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo3Layout.setVerticalGroup(
            painelGluteo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha3.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe3.setText("Em pé");

        boxPantLeg3.setText("Leg Press");

        boxEmPeU3.setText("Em pé Uni");

        boxPanSentado3.setText("Ele. Sentado");

        boxPanBarra3.setText("C/ Barra");

        boxDonkey3.setText("Ele. Donkey");

        boxPanSalto3.setText("C/ Salto");

        boxPanUni3.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha3Layout = new javax.swing.GroupLayout(painelPanturrilha3);
        painelPanturrilha3.setLayout(painelPanturrilha3Layout);
        painelPanturrilha3Layout.setHorizontalGroup(
            painelPanturrilha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe3)
                    .addComponent(boxPantLeg3)
                    .addComponent(boxEmPeU3)
                    .addComponent(boxPanSentado3)
                    .addComponent(boxPanBarra3)
                    .addComponent(boxDonkey3)
                    .addComponent(boxPanSalto3)
                    .addComponent(boxPanUni3))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha3Layout.setVerticalGroup(
            painelPanturrilha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni3)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(99, Short.MAX_VALUE))
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTreinoLayout.createSequentialGroup()
                            .addComponent(painelPreTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelPosTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelTreinoLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(542, 542, 542)
                            .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelTreinoLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNomeProfessorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelTreinoLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel9)))
                            .addGap(77, 77, 77)
                            .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelTreinoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTreinoLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(painelTreinoLayout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
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
                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPreTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Treino professor", painelTreino);

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

    private void boxRemadaB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB2ActionPerformed

    private void boxCrossV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV2ActionPerformed

    private void boxRemadaB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB3ActionPerformed

    private void boxCrossV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV3ActionPerformed

    private void boxRemadaB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB4ActionPerformed

    private void boxCrossV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV4ActionPerformed

    private void boxEsteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraActionPerformed

    private void boxEsteiraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraPActionPerformed

/*------------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*---------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
/*--------------------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProfessor().setVisible(true);
            }
        });
    }---------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNalterar;
    private javax.swing.JCheckBox BoscaRoscaC2;
    private javax.swing.JCheckBox BoscaRoscaC3;
    private javax.swing.JCheckBox BoscaRoscaC4;
    private javax.swing.JCheckBox BoxRemAlta2;
    private javax.swing.JCheckBox BoxRemAlta3;
    private javax.swing.JCheckBox BoxRemAlta4;
    private javax.swing.JCheckBox box23;
    private javax.swing.JCheckBox box24;
    private javax.swing.JCheckBox box25;
    private javax.swing.JCheckBox boxAbdPerna2;
    private javax.swing.JCheckBox boxAbdPerna3;
    private javax.swing.JCheckBox boxAbdPerna4;
    private javax.swing.JCheckBox boxAbdomen;
    private javax.swing.JCheckBox boxAbdomenP;
    private javax.swing.JCheckBox boxAfuncoB2;
    private javax.swing.JCheckBox boxAfuncoB3;
    private javax.swing.JCheckBox boxAfuncoB4;
    private javax.swing.JCheckBox boxAfundoG2;
    private javax.swing.JCheckBox boxAfundoG3;
    private javax.swing.JCheckBox boxAfundoG4;
    private javax.swing.JCheckBox boxAfundoQ2;
    private javax.swing.JCheckBox boxAfundoQ3;
    private javax.swing.JCheckBox boxAfundoQ4;
    private javax.swing.JCheckBox boxAga2;
    private javax.swing.JCheckBox boxAga3;
    private javax.swing.JCheckBox boxAga4;
    private javax.swing.JCheckBox boxAgaF2;
    private javax.swing.JCheckBox boxAgaF3;
    private javax.swing.JCheckBox boxAgaF4;
    private javax.swing.JCheckBox boxAgaH2;
    private javax.swing.JCheckBox boxAgaH3;
    private javax.swing.JCheckBox boxAgaH4;
    private javax.swing.JCheckBox boxAgaHalter2;
    private javax.swing.JCheckBox boxAgaHalter3;
    private javax.swing.JCheckBox boxAgaHalter4;
    private javax.swing.JCheckBox boxAgaLivre2;
    private javax.swing.JCheckBox boxAgaLivre3;
    private javax.swing.JCheckBox boxAgaLivre4;
    private javax.swing.JCheckBox boxAgaSumo2;
    private javax.swing.JCheckBox boxAgaSumo3;
    private javax.swing.JCheckBox boxAgaSumo4;
    private javax.swing.JCheckBox boxBike;
    private javax.swing.JCheckBox boxBikeP;
    private javax.swing.JCheckBox boxCanadense2;
    private javax.swing.JCheckBox boxCanadense3;
    private javax.swing.JCheckBox boxCanadense4;
    private javax.swing.JCheckBox boxCrossBarraR2;
    private javax.swing.JCheckBox boxCrossBarraR3;
    private javax.swing.JCheckBox boxCrossBarraR4;
    private javax.swing.JCheckBox boxCrossI2;
    private javax.swing.JCheckBox boxCrossI3;
    private javax.swing.JCheckBox boxCrossI4;
    private javax.swing.JCheckBox boxCrossV2;
    private javax.swing.JCheckBox boxCrossV3;
    private javax.swing.JCheckBox boxCrossV4;
    private javax.swing.JCheckBox boxCrucifixo2;
    private javax.swing.JCheckBox boxCrucifixo3;
    private javax.swing.JCheckBox boxCrucifixo4;
    private javax.swing.JCheckBox boxDesComBarra2;
    private javax.swing.JCheckBox boxDesComBarra3;
    private javax.swing.JCheckBox boxDesComBarra4;
    private javax.swing.JCheckBox boxDonkey2;
    private javax.swing.JCheckBox boxDonkey3;
    private javax.swing.JCheckBox boxDonkey4;
    private javax.swing.JCheckBox boxEleFrontal2;
    private javax.swing.JCheckBox boxEleFrontal3;
    private javax.swing.JCheckBox boxEleFrontal4;
    private javax.swing.JCheckBox boxEleLateral2;
    private javax.swing.JCheckBox boxEleLateral3;
    private javax.swing.JCheckBox boxEleLateral4;
    private javax.swing.JCheckBox boxElevQuadril2;
    private javax.swing.JCheckBox boxElevQuadril3;
    private javax.swing.JCheckBox boxElevQuadril4;
    private javax.swing.JCheckBox boxEmPe2;
    private javax.swing.JCheckBox boxEmPe3;
    private javax.swing.JCheckBox boxEmPe4;
    private javax.swing.JCheckBox boxEmPeU2;
    private javax.swing.JCheckBox boxEmPeU3;
    private javax.swing.JCheckBox boxEmPeU4;
    private javax.swing.JCheckBox boxEncOmbro2;
    private javax.swing.JCheckBox boxEncOmbro3;
    private javax.swing.JCheckBox boxEncOmbro4;
    private javax.swing.JCheckBox boxEsteira;
    private javax.swing.JCheckBox boxEsteiraP;
    private javax.swing.JCheckBox boxExtTriceps2;
    private javax.swing.JCheckBox boxExtTriceps3;
    private javax.swing.JCheckBox boxExtTriceps4;
    private javax.swing.JCheckBox boxExtensora2;
    private javax.swing.JCheckBox boxExtensora3;
    private javax.swing.JCheckBox boxExtensora4;
    private javax.swing.JCheckBox boxFlexao2;
    private javax.swing.JCheckBox boxFlexao3;
    private javax.swing.JCheckBox boxFlexao4;
    private javax.swing.JCheckBox boxFundos2;
    private javax.swing.JCheckBox boxFundos3;
    private javax.swing.JCheckBox boxFundos4;
    private javax.swing.JCheckBox boxKick2;
    private javax.swing.JCheckBox boxKick3;
    private javax.swing.JCheckBox boxKick4;
    private javax.swing.JCheckBox boxMartelo2;
    private javax.swing.JCheckBox boxMartelo3;
    private javax.swing.JCheckBox boxMartelo4;
    private javax.swing.JCheckBox boxPanBarra2;
    private javax.swing.JCheckBox boxPanBarra3;
    private javax.swing.JCheckBox boxPanBarra4;
    private javax.swing.JCheckBox boxPanSalto2;
    private javax.swing.JCheckBox boxPanSalto3;
    private javax.swing.JCheckBox boxPanSalto4;
    private javax.swing.JCheckBox boxPanSentado2;
    private javax.swing.JCheckBox boxPanSentado3;
    private javax.swing.JCheckBox boxPanSentado4;
    private javax.swing.JCheckBox boxPanUni2;
    private javax.swing.JCheckBox boxPanUni3;
    private javax.swing.JCheckBox boxPanUni4;
    private javax.swing.JCheckBox boxPantLeg2;
    private javax.swing.JCheckBox boxPantLeg3;
    private javax.swing.JCheckBox boxPantLeg4;
    private javax.swing.JCheckBox boxPeck2;
    private javax.swing.JCheckBox boxPeck3;
    private javax.swing.JCheckBox boxPeck4;
    private javax.swing.JCheckBox boxPrensa2;
    private javax.swing.JCheckBox boxPrensa3;
    private javax.swing.JCheckBox boxPrensa4;
    private javax.swing.JCheckBox boxPuCostas2;
    private javax.swing.JCheckBox boxPuCostas3;
    private javax.swing.JCheckBox boxPuCostas4;
    private javax.swing.JCheckBox boxPuFrente2;
    private javax.swing.JCheckBox boxPuFrente3;
    private javax.swing.JCheckBox boxPuFrente4;
    private javax.swing.JCheckBox boxPuFrenteI2;
    private javax.swing.JCheckBox boxPuFrenteI3;
    private javax.swing.JCheckBox boxPuFrenteI4;
    private javax.swing.JCheckBox boxPulley2;
    private javax.swing.JCheckBox boxPulley3;
    private javax.swing.JCheckBox boxPulley4;
    private javax.swing.JCheckBox boxRemadaB2;
    private javax.swing.JCheckBox boxRemadaB3;
    private javax.swing.JCheckBox boxRemadaB4;
    private javax.swing.JCheckBox boxRemadaUni2;
    private javax.swing.JCheckBox boxRemadaUni3;
    private javax.swing.JCheckBox boxRemadaUni4;
    private javax.swing.JCheckBox boxRoscaA2;
    private javax.swing.JCheckBox boxRoscaA3;
    private javax.swing.JCheckBox boxRoscaA4;
    private javax.swing.JCheckBox boxRoscaD2;
    private javax.swing.JCheckBox boxRoscaD3;
    private javax.swing.JCheckBox boxRoscaD4;
    private javax.swing.JCheckBox boxRoscaI2;
    private javax.swing.JCheckBox boxRoscaI3;
    private javax.swing.JCheckBox boxRoscaI4;
    private javax.swing.JCheckBox boxRotacaoE2;
    private javax.swing.JCheckBox boxRotacaoE3;
    private javax.swing.JCheckBox boxRotacaoE4;
    private javax.swing.JCheckBox boxRotacaoI2;
    private javax.swing.JCheckBox boxRotacaoI3;
    private javax.swing.JCheckBox boxRotacaoI4;
    private javax.swing.JCheckBox boxScoty2;
    private javax.swing.JCheckBox boxScoty3;
    private javax.swing.JCheckBox boxScoty4;
    private javax.swing.JCheckBox boxStiff2;
    private javax.swing.JCheckBox boxStiff3;
    private javax.swing.JCheckBox boxStiff4;
    private javax.swing.JCheckBox boxSupinoInclinado2;
    private javax.swing.JCheckBox boxSupinoInclinado3;
    private javax.swing.JCheckBox boxSupinoInclinado4;
    private javax.swing.JCheckBox boxSupinoReto2;
    private javax.swing.JCheckBox boxSupinoReto3;
    private javax.swing.JCheckBox boxSupinoReto4;
    private javax.swing.JCheckBox boxTesta2;
    private javax.swing.JCheckBox boxTesta3;
    private javax.swing.JCheckBox boxTesta4;
    private javax.swing.JCheckBox boxTriSupinado2;
    private javax.swing.JCheckBox boxTriSupinado3;
    private javax.swing.JCheckBox boxTriSupinado4;
    private javax.swing.JCheckBox boxVoador2;
    private javax.swing.JCheckBox boxVoador3;
    private javax.swing.JCheckBox boxVoador4;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> combAbdomen;
    private javax.swing.JComboBox<String> combBike;
    private javax.swing.JComboBox<String> combBikeP;
    private javax.swing.JComboBox<String> combEsteira;
    private javax.swing.JComboBox<String> combEsteiraP;
    private javax.swing.JComboBox<String> compAbdomenP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextField lblAbdomem;
    private javax.swing.JTextField lblAbdomen;
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
    private javax.swing.JTextField lblBike;
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
    private javax.swing.JTextField lblEsteira;
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
    private javax.swing.JPanel painelBiceps2;
    private javax.swing.JPanel painelBiceps3;
    private javax.swing.JPanel painelBiceps4;
    private javax.swing.JPanel painelCostas2;
    private javax.swing.JPanel painelCostas3;
    private javax.swing.JPanel painelCostas4;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelDadosProfissionais;
    private javax.swing.JPanel painelGluteo2;
    private javax.swing.JPanel painelGluteo3;
    private javax.swing.JPanel painelGluteo4;
    private javax.swing.JPanel painelModalidades;
    private javax.swing.JPanel painelOmbro2;
    private javax.swing.JPanel painelOmbro3;
    private javax.swing.JPanel painelOmbro4;
    private javax.swing.JPanel painelPanturrilha2;
    private javax.swing.JPanel painelPanturrilha3;
    private javax.swing.JPanel painelPanturrilha4;
    private javax.swing.JPanel painelPeito2;
    private javax.swing.JPanel painelPeito3;
    private javax.swing.JPanel painelPeito4;
    private javax.swing.JPanel painelPerimetria;
    private javax.swing.JPanel painelPosTreino;
    private javax.swing.JPanel painelPreTreino;
    private javax.swing.JPanel painelQuadriceps2;
    private javax.swing.JPanel painelQuadriceps3;
    private javax.swing.JPanel painelQuadriceps4;
    private javax.swing.JPanel painelTreino;
    private javax.swing.JPanel painelTriceps2;
    private javax.swing.JPanel painelTriceps3;
    private javax.swing.JPanel painelTriceps4;
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
