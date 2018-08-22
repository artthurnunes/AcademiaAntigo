
package telas;

import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TelaCadAdm extends javax.swing.JFrame {
    

    public TelaCadAdm() {
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
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel53 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jPanel54 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
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
        painelPeito8 = new javax.swing.JPanel();
        boxSupinoReto8 = new javax.swing.JCheckBox();
        boxSupinoInclinado8 = new javax.swing.JCheckBox();
        boxCanadense8 = new javax.swing.JCheckBox();
        boxPeck8 = new javax.swing.JCheckBox();
        boxCrucifixo8 = new javax.swing.JCheckBox();
        boxFlexao8 = new javax.swing.JCheckBox();
        painelCostas8 = new javax.swing.JPanel();
        boxPuCostas8 = new javax.swing.JCheckBox();
        boxPuFrente8 = new javax.swing.JCheckBox();
        boxPuFrenteI8 = new javax.swing.JCheckBox();
        boxRemadaB8 = new javax.swing.JCheckBox();
        boxRemadaUni8 = new javax.swing.JCheckBox();
        boxVoador8 = new javax.swing.JCheckBox();
        painelOmbro8 = new javax.swing.JPanel();
        boxEleLateral8 = new javax.swing.JCheckBox();
        boxEleFrontal8 = new javax.swing.JCheckBox();
        boxRotacaoI8 = new javax.swing.JCheckBox();
        boxRotacaoE8 = new javax.swing.JCheckBox();
        boxDesComBarra8 = new javax.swing.JCheckBox();
        boxCrossI8 = new javax.swing.JCheckBox();
        BoxRemAlta8 = new javax.swing.JCheckBox();
        boxEncOmbro8 = new javax.swing.JCheckBox();
        painelBiceps8 = new javax.swing.JPanel();
        boxRoscaD8 = new javax.swing.JCheckBox();
        boxScoty8 = new javax.swing.JCheckBox();
        boxMartelo8 = new javax.swing.JCheckBox();
        boxRoscaI8 = new javax.swing.JCheckBox();
        box29 = new javax.swing.JCheckBox();
        boxRoscaA8 = new javax.swing.JCheckBox();
        BoscaRoscaC8 = new javax.swing.JCheckBox();
        painelTriceps8 = new javax.swing.JPanel();
        boxTesta8 = new javax.swing.JCheckBox();
        boxPulley8 = new javax.swing.JCheckBox();
        boxCrossV8 = new javax.swing.JCheckBox();
        boxCrossBarraR8 = new javax.swing.JCheckBox();
        boxFundos8 = new javax.swing.JCheckBox();
        boxTriSupinado8 = new javax.swing.JCheckBox();
        boxExtTriceps8 = new javax.swing.JCheckBox();
        painelQuadriceps8 = new javax.swing.JPanel();
        boxAga8 = new javax.swing.JCheckBox();
        boxAgaF8 = new javax.swing.JCheckBox();
        boxAgaH8 = new javax.swing.JCheckBox();
        boxPrensa8 = new javax.swing.JCheckBox();
        boxAfundoQ8 = new javax.swing.JCheckBox();
        boxAfuncoB8 = new javax.swing.JCheckBox();
        boxExtensora8 = new javax.swing.JCheckBox();
        painelGluteo8 = new javax.swing.JPanel();
        boxElevQuadril8 = new javax.swing.JCheckBox();
        boxAgaHalter8 = new javax.swing.JCheckBox();
        boxKick8 = new javax.swing.JCheckBox();
        boxAbdPerna8 = new javax.swing.JCheckBox();
        boxAfundoG8 = new javax.swing.JCheckBox();
        boxAgaLivre8 = new javax.swing.JCheckBox();
        boxAgaSumo8 = new javax.swing.JCheckBox();
        boxStiff8 = new javax.swing.JCheckBox();
        painelPanturrilha8 = new javax.swing.JPanel();
        boxEmPe8 = new javax.swing.JCheckBox();
        boxPantLeg8 = new javax.swing.JCheckBox();
        boxEmPeU8 = new javax.swing.JCheckBox();
        boxPanSentado8 = new javax.swing.JCheckBox();
        boxPanBarra8 = new javax.swing.JCheckBox();
        boxDonkey8 = new javax.swing.JCheckBox();
        boxPanSalto8 = new javax.swing.JCheckBox();
        boxPanUni8 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        painelPeito7 = new javax.swing.JPanel();
        boxSupinoReto7 = new javax.swing.JCheckBox();
        boxSupinoInclinado7 = new javax.swing.JCheckBox();
        boxCanadense7 = new javax.swing.JCheckBox();
        boxPeck7 = new javax.swing.JCheckBox();
        boxCrucifixo7 = new javax.swing.JCheckBox();
        boxFlexao7 = new javax.swing.JCheckBox();
        painelCostas7 = new javax.swing.JPanel();
        boxPuCostas7 = new javax.swing.JCheckBox();
        boxPuFrente7 = new javax.swing.JCheckBox();
        boxPuFrenteI7 = new javax.swing.JCheckBox();
        boxRemadaB7 = new javax.swing.JCheckBox();
        boxRemadaUni7 = new javax.swing.JCheckBox();
        boxVoador7 = new javax.swing.JCheckBox();
        painelOmbro7 = new javax.swing.JPanel();
        boxEleLateral7 = new javax.swing.JCheckBox();
        boxEleFrontal7 = new javax.swing.JCheckBox();
        boxRotacaoI7 = new javax.swing.JCheckBox();
        boxRotacaoE7 = new javax.swing.JCheckBox();
        boxDesComBarra7 = new javax.swing.JCheckBox();
        boxCrossI7 = new javax.swing.JCheckBox();
        BoxRemAlta7 = new javax.swing.JCheckBox();
        boxEncOmbro7 = new javax.swing.JCheckBox();
        painelBiceps7 = new javax.swing.JPanel();
        boxRoscaD7 = new javax.swing.JCheckBox();
        boxScoty7 = new javax.swing.JCheckBox();
        boxMartelo7 = new javax.swing.JCheckBox();
        boxRoscaI7 = new javax.swing.JCheckBox();
        box28 = new javax.swing.JCheckBox();
        boxRoscaA7 = new javax.swing.JCheckBox();
        BoscaRoscaC7 = new javax.swing.JCheckBox();
        painelTriceps7 = new javax.swing.JPanel();
        boxTesta7 = new javax.swing.JCheckBox();
        boxPulley7 = new javax.swing.JCheckBox();
        boxCrossV7 = new javax.swing.JCheckBox();
        boxCrossBarraR7 = new javax.swing.JCheckBox();
        boxFundos7 = new javax.swing.JCheckBox();
        boxTriSupinado7 = new javax.swing.JCheckBox();
        boxExtTriceps7 = new javax.swing.JCheckBox();
        painelQuadriceps7 = new javax.swing.JPanel();
        boxAga7 = new javax.swing.JCheckBox();
        boxAgaF7 = new javax.swing.JCheckBox();
        boxAgaH7 = new javax.swing.JCheckBox();
        boxPrensa7 = new javax.swing.JCheckBox();
        boxAfundoQ7 = new javax.swing.JCheckBox();
        boxAfuncoB7 = new javax.swing.JCheckBox();
        boxExtensora7 = new javax.swing.JCheckBox();
        painelGluteo7 = new javax.swing.JPanel();
        boxElevQuadril7 = new javax.swing.JCheckBox();
        boxAgaHalter7 = new javax.swing.JCheckBox();
        boxKick7 = new javax.swing.JCheckBox();
        boxAbdPerna7 = new javax.swing.JCheckBox();
        boxAfundoG7 = new javax.swing.JCheckBox();
        boxAgaLivre7 = new javax.swing.JCheckBox();
        boxAgaSumo7 = new javax.swing.JCheckBox();
        boxStiff7 = new javax.swing.JCheckBox();
        painelPanturrilha7 = new javax.swing.JPanel();
        boxEmPe7 = new javax.swing.JCheckBox();
        boxPantLeg7 = new javax.swing.JCheckBox();
        boxEmPeU7 = new javax.swing.JCheckBox();
        boxPanSentado7 = new javax.swing.JCheckBox();
        boxPanBarra7 = new javax.swing.JCheckBox();
        boxDonkey7 = new javax.swing.JCheckBox();
        boxPanSalto7 = new javax.swing.JCheckBox();
        boxPanUni7 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
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
        setTitle("Cadastro/Alteração/Exclusão administração");

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
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel8.setText("Formação academica :");

        jLabel11.setText("Formação academica :");

        jLabel12.setText("Formação academica :");

        jLabel13.setText("Experiências profissionais :");

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(34, Short.MAX_VALUE))
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
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setText("Descrição de tarefas na academia");

        jScrollPane3.setViewportView(jTextPane2);

        jLabel14.setText("Observações");

        jScrollPane4.setViewportView(jTextPane3);

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
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane9.setViewportView(jTextPane8);

        jScrollPane8.setViewportView(jTextPane7);

        jScrollPane7.setViewportView(jTextPane6);

        jScrollPane6.setViewportView(jTextPane5);

        jScrollPane5.setViewportView(jTextPane4);

        jLabel17.setText("Dicas para melhorar o local de trabalho");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 14, Short.MAX_VALUE))
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
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        painelDadosProfissionaisLayout.setVerticalGroup(
            painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosProfissionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosProfissionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelDadosProfissionaisLayout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addContainerGap(265, Short.MAX_VALUE))
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pré treino");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Pós treino");

        painelPeito8.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto8.setText("Supino Reto");

        boxSupinoInclinado8.setText("Supino Inclinado");

        boxCanadense8.setText("Supino Declinado");

        boxPeck8.setText("Peck Deck");

        boxCrucifixo8.setText("Crucifixo");

        boxFlexao8.setText("Flexão");

        javax.swing.GroupLayout painelPeito8Layout = new javax.swing.GroupLayout(painelPeito8);
        painelPeito8.setLayout(painelPeito8Layout);
        painelPeito8Layout.setHorizontalGroup(
            painelPeito8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto8)
                    .addComponent(boxSupinoInclinado8)
                    .addComponent(boxCanadense8)
                    .addComponent(boxPeck8)
                    .addComponent(boxCrucifixo8)
                    .addComponent(boxFlexao8)))
        );
        painelPeito8Layout.setVerticalGroup(
            painelPeito8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas8.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas8.setText("Puxada Costas");

        boxPuFrente8.setText("Puxada Frente");

        boxPuFrenteI8.setText("Puxada Frente Inv");

        boxRemadaB8.setText("Remada Baixa");
        boxRemadaB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB8ActionPerformed(evt);
            }
        });

        boxRemadaUni8.setText("Remada Unilateral");

        boxVoador8.setText("Voador");

        javax.swing.GroupLayout painelCostas8Layout = new javax.swing.GroupLayout(painelCostas8);
        painelCostas8.setLayout(painelCostas8Layout);
        painelCostas8Layout.setHorizontalGroup(
            painelCostas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas8)
                    .addComponent(boxPuFrente8)
                    .addComponent(boxPuFrenteI8)
                    .addComponent(boxRemadaB8)
                    .addComponent(boxRemadaUni8)
                    .addComponent(boxVoador8))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas8Layout.setVerticalGroup(
            painelCostas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro8.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral8.setText("Elevação Lat");

        boxEleFrontal8.setText("Elevação Front");

        boxRotacaoI8.setText("Rotação Interna");

        boxRotacaoE8.setText("Rotação Externa");

        boxDesComBarra8.setText("Desenv. c/ Barra");

        boxCrossI8.setText("Cross Invertido");

        BoxRemAlta8.setText("Remada Alta");

        boxEncOmbro8.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro8Layout = new javax.swing.GroupLayout(painelOmbro8);
        painelOmbro8.setLayout(painelOmbro8Layout);
        painelOmbro8Layout.setHorizontalGroup(
            painelOmbro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral8)
                    .addComponent(boxEleFrontal8)
                    .addComponent(boxRotacaoI8)
                    .addComponent(boxRotacaoE8)
                    .addComponent(boxDesComBarra8)
                    .addComponent(boxCrossI8)
                    .addComponent(BoxRemAlta8)
                    .addComponent(boxEncOmbro8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro8Layout.setVerticalGroup(
            painelOmbro8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps8.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD8.setText("Rosca Direta");

        boxScoty8.setText("Banco Scoty");

        boxMartelo8.setText("Martelinho");

        boxRoscaI8.setText("Rosca Indireta");

        box29.setText("Rosca 21");

        boxRoscaA8.setText("Rosca Alternada");

        BoscaRoscaC8.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps8Layout = new javax.swing.GroupLayout(painelBiceps8);
        painelBiceps8.setLayout(painelBiceps8Layout);
        painelBiceps8Layout.setHorizontalGroup(
            painelBiceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD8)
                    .addComponent(boxScoty8)
                    .addComponent(boxMartelo8)
                    .addComponent(boxRoscaI8)
                    .addComponent(box29)
                    .addComponent(boxRoscaA8)
                    .addComponent(BoscaRoscaC8))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps8Layout.setVerticalGroup(
            painelBiceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps8.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta8.setText("Testa");

        boxPulley8.setText("Pulley");

        boxCrossV8.setText("Cross Barra V");
        boxCrossV8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV8ActionPerformed(evt);
            }
        });

        boxCrossBarraR8.setText("Cross Barra Reta");

        boxFundos8.setText("Fundos em Máquina");

        boxTriSupinado8.setText("Supino Pega Junta");

        boxExtTriceps8.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps8Layout = new javax.swing.GroupLayout(painelTriceps8);
        painelTriceps8.setLayout(painelTriceps8Layout);
        painelTriceps8Layout.setHorizontalGroup(
            painelTriceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV8)
                    .addComponent(boxTesta8)
                    .addComponent(boxPulley8)
                    .addComponent(boxCrossBarraR8)
                    .addComponent(boxFundos8)
                    .addComponent(boxTriSupinado8)
                    .addComponent(boxExtTriceps8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps8Layout.setVerticalGroup(
            painelTriceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps8.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga8.setText("Agachamento");

        boxAgaF8.setText("Agachamento Front");

        boxAgaH8.setText("Agachamento Hack");

        boxPrensa8.setText("Prensa 90º");

        boxAfundoQ8.setText("Afundo");

        boxAfuncoB8.setText("Afundo c/ Barra");

        boxExtensora8.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps8Layout = new javax.swing.GroupLayout(painelQuadriceps8);
        painelQuadriceps8.setLayout(painelQuadriceps8Layout);
        painelQuadriceps8Layout.setHorizontalGroup(
            painelQuadriceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga8)
                    .addComponent(boxAgaF8)
                    .addComponent(boxAgaH8)
                    .addComponent(boxPrensa8)
                    .addComponent(boxAfundoQ8)
                    .addComponent(boxAfuncoB8)
                    .addComponent(boxExtensora8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps8Layout.setVerticalGroup(
            painelQuadriceps8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo8.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril8.setText("Ele. Quadril");

        boxAgaHalter8.setText("Aga. c/ Halter");

        boxKick8.setText("Kickbacks");

        boxAbdPerna8.setText("Abd. de Perna");

        boxAfundoG8.setText("Afundo");

        boxAgaLivre8.setText("Aga. Livre");

        boxAgaSumo8.setText("Aga. Sumo");

        boxStiff8.setText("Stiff");

        javax.swing.GroupLayout painelGluteo8Layout = new javax.swing.GroupLayout(painelGluteo8);
        painelGluteo8.setLayout(painelGluteo8Layout);
        painelGluteo8Layout.setHorizontalGroup(
            painelGluteo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril8)
                    .addComponent(boxAgaHalter8)
                    .addComponent(boxKick8)
                    .addComponent(boxAbdPerna8)
                    .addComponent(boxAfundoG8)
                    .addComponent(boxAgaLivre8)
                    .addComponent(boxAgaSumo8)
                    .addComponent(boxStiff8))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo8Layout.setVerticalGroup(
            painelGluteo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha8.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe8.setText("Em pé");

        boxPantLeg8.setText("Leg Press");

        boxEmPeU8.setText("Em pé Uni");

        boxPanSentado8.setText("Ele. Sentado");

        boxPanBarra8.setText("C/ Barra");

        boxDonkey8.setText("Ele. Donkey");

        boxPanSalto8.setText("C/ Salto");

        boxPanUni8.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha8Layout = new javax.swing.GroupLayout(painelPanturrilha8);
        painelPanturrilha8.setLayout(painelPanturrilha8Layout);
        painelPanturrilha8Layout.setHorizontalGroup(
            painelPanturrilha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe8)
                    .addComponent(boxPantLeg8)
                    .addComponent(boxEmPeU8)
                    .addComponent(boxPanSentado8)
                    .addComponent(boxPanBarra8)
                    .addComponent(boxDonkey8)
                    .addComponent(boxPanSalto8)
                    .addComponent(boxPanUni8))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha8Layout.setVerticalGroup(
            painelPanturrilha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni8)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino A", jPanel8);

        painelPeito7.setBorder(javax.swing.BorderFactory.createTitledBorder("Peito"));

        boxSupinoReto7.setText("Supino Reto");

        boxSupinoInclinado7.setText("Supino Inclinado");

        boxCanadense7.setText("Supino Declinado");

        boxPeck7.setText("Peck Deck");

        boxCrucifixo7.setText("Crucifixo");

        boxFlexao7.setText("Flexão");

        javax.swing.GroupLayout painelPeito7Layout = new javax.swing.GroupLayout(painelPeito7);
        painelPeito7.setLayout(painelPeito7Layout);
        painelPeito7Layout.setHorizontalGroup(
            painelPeito7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPeito7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxSupinoReto7)
                    .addComponent(boxSupinoInclinado7)
                    .addComponent(boxCanadense7)
                    .addComponent(boxPeck7)
                    .addComponent(boxCrucifixo7)
                    .addComponent(boxFlexao7)))
        );
        painelPeito7Layout.setVerticalGroup(
            painelPeito7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPeito7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxSupinoReto7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxSupinoInclinado7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCanadense7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPeck7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrucifixo7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFlexao7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCostas7.setBorder(javax.swing.BorderFactory.createTitledBorder("Costas"));

        boxPuCostas7.setText("Puxada Costas");

        boxPuFrente7.setText("Puxada Frente");

        boxPuFrenteI7.setText("Puxada Frente Inv");

        boxRemadaB7.setText("Remada Baixa");
        boxRemadaB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRemadaB7ActionPerformed(evt);
            }
        });

        boxRemadaUni7.setText("Remada Unilateral");

        boxVoador7.setText("Voador");

        javax.swing.GroupLayout painelCostas7Layout = new javax.swing.GroupLayout(painelCostas7);
        painelCostas7.setLayout(painelCostas7Layout);
        painelCostas7Layout.setHorizontalGroup(
            painelCostas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCostas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPuCostas7)
                    .addComponent(boxPuFrente7)
                    .addComponent(boxPuFrenteI7)
                    .addComponent(boxRemadaB7)
                    .addComponent(boxRemadaUni7)
                    .addComponent(boxVoador7))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelCostas7Layout.setVerticalGroup(
            painelCostas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCostas7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxPuCostas7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrente7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPuFrenteI7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaB7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRemadaUni7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxVoador7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelOmbro7.setBorder(javax.swing.BorderFactory.createTitledBorder("Ombro"));

        boxEleLateral7.setText("Elevação Lat");

        boxEleFrontal7.setText("Elevação Front");

        boxRotacaoI7.setText("Rotação Interna");

        boxRotacaoE7.setText("Rotação Externa");

        boxDesComBarra7.setText("Desenv. c/ Barra");

        boxCrossI7.setText("Cross Invertido");

        BoxRemAlta7.setText("Remada Alta");

        boxEncOmbro7.setText("Encol. de Ombro");

        javax.swing.GroupLayout painelOmbro7Layout = new javax.swing.GroupLayout(painelOmbro7);
        painelOmbro7.setLayout(painelOmbro7Layout);
        painelOmbro7Layout.setHorizontalGroup(
            painelOmbro7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOmbro7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEleLateral7)
                    .addComponent(boxEleFrontal7)
                    .addComponent(boxRotacaoI7)
                    .addComponent(boxRotacaoE7)
                    .addComponent(boxDesComBarra7)
                    .addComponent(boxCrossI7)
                    .addComponent(BoxRemAlta7)
                    .addComponent(boxEncOmbro7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOmbro7Layout.setVerticalGroup(
            painelOmbro7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOmbro7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEleLateral7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEleFrontal7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoI7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRotacaoE7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDesComBarra7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossI7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxRemAlta7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEncOmbro7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBiceps7.setBorder(javax.swing.BorderFactory.createTitledBorder("Bíceps"));

        boxRoscaD7.setText("Rosca Direta");

        boxScoty7.setText("Banco Scoty");

        boxMartelo7.setText("Martelinho");

        boxRoscaI7.setText("Rosca Indireta");

        box28.setText("Rosca 21");

        boxRoscaA7.setText("Rosca Alternada");

        BoscaRoscaC7.setText("Rosca c/ Consen");

        javax.swing.GroupLayout painelBiceps7Layout = new javax.swing.GroupLayout(painelBiceps7);
        painelBiceps7.setLayout(painelBiceps7Layout);
        painelBiceps7Layout.setHorizontalGroup(
            painelBiceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBiceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxRoscaD7)
                    .addComponent(boxScoty7)
                    .addComponent(boxMartelo7)
                    .addComponent(boxRoscaI7)
                    .addComponent(box28)
                    .addComponent(boxRoscaA7)
                    .addComponent(BoscaRoscaC7))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        painelBiceps7Layout.setVerticalGroup(
            painelBiceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBiceps7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxRoscaD7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaA7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMartelo7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoscaRoscaC7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxRoscaI7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxScoty7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTriceps7.setBorder(javax.swing.BorderFactory.createTitledBorder("Tríceps"));

        boxTesta7.setText("Testa");

        boxPulley7.setText("Pulley");

        boxCrossV7.setText("Cross Barra V");
        boxCrossV7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCrossV7ActionPerformed(evt);
            }
        });

        boxCrossBarraR7.setText("Cross Barra Reta");

        boxFundos7.setText("Fundos em Máquina");

        boxTriSupinado7.setText("Supino Pega Junta");

        boxExtTriceps7.setText("Exten. Tríceps Hal");

        javax.swing.GroupLayout painelTriceps7Layout = new javax.swing.GroupLayout(painelTriceps7);
        painelTriceps7.setLayout(painelTriceps7Layout);
        painelTriceps7Layout.setHorizontalGroup(
            painelTriceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTriceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxCrossV7)
                    .addComponent(boxTesta7)
                    .addComponent(boxPulley7)
                    .addComponent(boxCrossBarraR7)
                    .addComponent(boxFundos7)
                    .addComponent(boxTriSupinado7)
                    .addComponent(boxExtTriceps7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTriceps7Layout.setVerticalGroup(
            painelTriceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTriceps7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTesta7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPulley7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossV7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCrossBarraR7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFundos7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTriSupinado7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtTriceps7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelQuadriceps7.setBorder(javax.swing.BorderFactory.createTitledBorder("Quadríceps / Post Coxa"));

        boxAga7.setText("Agachamento");

        boxAgaF7.setText("Agachamento Front");

        boxAgaH7.setText("Agachamento Hack");

        boxPrensa7.setText("Prensa 90º");

        boxAfundoQ7.setText("Afundo");

        boxAfuncoB7.setText("Afundo c/ Barra");

        boxExtensora7.setText("Extensora");

        javax.swing.GroupLayout painelQuadriceps7Layout = new javax.swing.GroupLayout(painelQuadriceps7);
        painelQuadriceps7.setLayout(painelQuadriceps7Layout);
        painelQuadriceps7Layout.setHorizontalGroup(
            painelQuadriceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuadriceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxAga7)
                    .addComponent(boxAgaF7)
                    .addComponent(boxAgaH7)
                    .addComponent(boxPrensa7)
                    .addComponent(boxAfundoQ7)
                    .addComponent(boxAfuncoB7)
                    .addComponent(boxExtensora7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelQuadriceps7Layout.setVerticalGroup(
            painelQuadriceps7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuadriceps7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxAga7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaF7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaH7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPrensa7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoQ7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfuncoB7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxExtensora7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGluteo7.setBorder(javax.swing.BorderFactory.createTitledBorder("Glúteo / Virilha"));

        boxElevQuadril7.setText("Ele. Quadril");

        boxAgaHalter7.setText("Aga. c/ Halter");

        boxKick7.setText("Kickbacks");

        boxAbdPerna7.setText("Abd. de Perna");

        boxAfundoG7.setText("Afundo");

        boxAgaLivre7.setText("Aga. Livre");

        boxAgaSumo7.setText("Aga. Sumo");

        boxStiff7.setText("Stiff");

        javax.swing.GroupLayout painelGluteo7Layout = new javax.swing.GroupLayout(painelGluteo7);
        painelGluteo7.setLayout(painelGluteo7Layout);
        painelGluteo7Layout.setHorizontalGroup(
            painelGluteo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGluteo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxElevQuadril7)
                    .addComponent(boxAgaHalter7)
                    .addComponent(boxKick7)
                    .addComponent(boxAbdPerna7)
                    .addComponent(boxAfundoG7)
                    .addComponent(boxAgaLivre7)
                    .addComponent(boxAgaSumo7)
                    .addComponent(boxStiff7))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelGluteo7Layout.setVerticalGroup(
            painelGluteo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGluteo7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxElevQuadril7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaHalter7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxKick7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAbdPerna7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAfundoG7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaLivre7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAgaSumo7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStiff7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPanturrilha7.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        boxEmPe7.setText("Em pé");

        boxPantLeg7.setText("Leg Press");

        boxEmPeU7.setText("Em pé Uni");

        boxPanSentado7.setText("Ele. Sentado");

        boxPanBarra7.setText("C/ Barra");

        boxDonkey7.setText("Ele. Donkey");

        boxPanSalto7.setText("C/ Salto");

        boxPanUni7.setText("Carga Uni");

        javax.swing.GroupLayout painelPanturrilha7Layout = new javax.swing.GroupLayout(painelPanturrilha7);
        painelPanturrilha7.setLayout(painelPanturrilha7Layout);
        painelPanturrilha7Layout.setHorizontalGroup(
            painelPanturrilha7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPanturrilha7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEmPe7)
                    .addComponent(boxPantLeg7)
                    .addComponent(boxEmPeU7)
                    .addComponent(boxPanSentado7)
                    .addComponent(boxPanBarra7)
                    .addComponent(boxDonkey7)
                    .addComponent(boxPanSalto7)
                    .addComponent(boxPanUni7))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        painelPanturrilha7Layout.setVerticalGroup(
            painelPanturrilha7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPanturrilha7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxEmPe7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantLeg7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmPeU7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSentado7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanBarra7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxDonkey7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanSalto7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPanUni7)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPeito7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCostas7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOmbro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBiceps7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTriceps7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuadriceps7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGluteo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPanturrilha7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPanturrilha7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelGluteo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuadriceps7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTriceps7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCostas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPeito7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOmbro7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBiceps7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Treino B", jPanel9);

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
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
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeProfessorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))
                    .addGroup(painelTreinoLayout.createSequentialGroup()
                        .addComponent(painelPreTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9)
                                .addGap(298, 298, 298)
                                .addGroup(painelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelTreinoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelTreinoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelTreinoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(painelPosTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(painelPreTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPosTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void boxRemadaB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB6ActionPerformed

    private void boxCrossV6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV6ActionPerformed

    private void boxRemadaB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB7ActionPerformed

    private void boxCrossV7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV7ActionPerformed

    private void boxRemadaB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRemadaB8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRemadaB8ActionPerformed

    private void boxCrossV8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCrossV8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCrossV8ActionPerformed

    private void boxEsteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraActionPerformed

    private void boxEsteiraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsteiraPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsteiraPActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    /*---------------TESTE SEM AS CLASSES PRINCIPAIS----------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*----------------------------------------------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    /*--------------------------------------------------------------------------------------------    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadAdm().setVisible(true);
            }
        });
    }
    -------------------------TESTE SEM AS CLASSES PRINCIPAIS--------------------------------------------------------*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoscaRoscaC6;
    private javax.swing.JCheckBox BoscaRoscaC7;
    private javax.swing.JCheckBox BoscaRoscaC8;
    private javax.swing.JCheckBox BoxRemAlta6;
    private javax.swing.JCheckBox BoxRemAlta7;
    private javax.swing.JCheckBox BoxRemAlta8;
    private javax.swing.JCheckBox box27;
    private javax.swing.JCheckBox box28;
    private javax.swing.JCheckBox box29;
    private javax.swing.JCheckBox boxAbdPerna6;
    private javax.swing.JCheckBox boxAbdPerna7;
    private javax.swing.JCheckBox boxAbdPerna8;
    private javax.swing.JCheckBox boxAbdomen;
    private javax.swing.JCheckBox boxAbdomenP;
    private javax.swing.JCheckBox boxAfuncoB6;
    private javax.swing.JCheckBox boxAfuncoB7;
    private javax.swing.JCheckBox boxAfuncoB8;
    private javax.swing.JCheckBox boxAfundoG6;
    private javax.swing.JCheckBox boxAfundoG7;
    private javax.swing.JCheckBox boxAfundoG8;
    private javax.swing.JCheckBox boxAfundoQ6;
    private javax.swing.JCheckBox boxAfundoQ7;
    private javax.swing.JCheckBox boxAfundoQ8;
    private javax.swing.JCheckBox boxAga6;
    private javax.swing.JCheckBox boxAga7;
    private javax.swing.JCheckBox boxAga8;
    private javax.swing.JCheckBox boxAgaF6;
    private javax.swing.JCheckBox boxAgaF7;
    private javax.swing.JCheckBox boxAgaF8;
    private javax.swing.JCheckBox boxAgaH6;
    private javax.swing.JCheckBox boxAgaH7;
    private javax.swing.JCheckBox boxAgaH8;
    private javax.swing.JCheckBox boxAgaHalter6;
    private javax.swing.JCheckBox boxAgaHalter7;
    private javax.swing.JCheckBox boxAgaHalter8;
    private javax.swing.JCheckBox boxAgaLivre6;
    private javax.swing.JCheckBox boxAgaLivre7;
    private javax.swing.JCheckBox boxAgaLivre8;
    private javax.swing.JCheckBox boxAgaSumo6;
    private javax.swing.JCheckBox boxAgaSumo7;
    private javax.swing.JCheckBox boxAgaSumo8;
    private javax.swing.JCheckBox boxBike;
    private javax.swing.JCheckBox boxBikeP;
    private javax.swing.JCheckBox boxCanadense6;
    private javax.swing.JCheckBox boxCanadense7;
    private javax.swing.JCheckBox boxCanadense8;
    private javax.swing.JCheckBox boxCrossBarraR6;
    private javax.swing.JCheckBox boxCrossBarraR7;
    private javax.swing.JCheckBox boxCrossBarraR8;
    private javax.swing.JCheckBox boxCrossI6;
    private javax.swing.JCheckBox boxCrossI7;
    private javax.swing.JCheckBox boxCrossI8;
    private javax.swing.JCheckBox boxCrossV6;
    private javax.swing.JCheckBox boxCrossV7;
    private javax.swing.JCheckBox boxCrossV8;
    private javax.swing.JCheckBox boxCrucifixo6;
    private javax.swing.JCheckBox boxCrucifixo7;
    private javax.swing.JCheckBox boxCrucifixo8;
    private javax.swing.JCheckBox boxDesComBarra6;
    private javax.swing.JCheckBox boxDesComBarra7;
    private javax.swing.JCheckBox boxDesComBarra8;
    private javax.swing.JCheckBox boxDonkey6;
    private javax.swing.JCheckBox boxDonkey7;
    private javax.swing.JCheckBox boxDonkey8;
    private javax.swing.JCheckBox boxEleFrontal6;
    private javax.swing.JCheckBox boxEleFrontal7;
    private javax.swing.JCheckBox boxEleFrontal8;
    private javax.swing.JCheckBox boxEleLateral6;
    private javax.swing.JCheckBox boxEleLateral7;
    private javax.swing.JCheckBox boxEleLateral8;
    private javax.swing.JCheckBox boxElevQuadril6;
    private javax.swing.JCheckBox boxElevQuadril7;
    private javax.swing.JCheckBox boxElevQuadril8;
    private javax.swing.JCheckBox boxEmPe6;
    private javax.swing.JCheckBox boxEmPe7;
    private javax.swing.JCheckBox boxEmPe8;
    private javax.swing.JCheckBox boxEmPeU6;
    private javax.swing.JCheckBox boxEmPeU7;
    private javax.swing.JCheckBox boxEmPeU8;
    private javax.swing.JCheckBox boxEncOmbro6;
    private javax.swing.JCheckBox boxEncOmbro7;
    private javax.swing.JCheckBox boxEncOmbro8;
    private javax.swing.JCheckBox boxEsteira;
    private javax.swing.JCheckBox boxEsteiraP;
    private javax.swing.JCheckBox boxExtTriceps6;
    private javax.swing.JCheckBox boxExtTriceps7;
    private javax.swing.JCheckBox boxExtTriceps8;
    private javax.swing.JCheckBox boxExtensora6;
    private javax.swing.JCheckBox boxExtensora7;
    private javax.swing.JCheckBox boxExtensora8;
    private javax.swing.JCheckBox boxFlexao6;
    private javax.swing.JCheckBox boxFlexao7;
    private javax.swing.JCheckBox boxFlexao8;
    private javax.swing.JCheckBox boxFundos6;
    private javax.swing.JCheckBox boxFundos7;
    private javax.swing.JCheckBox boxFundos8;
    private javax.swing.JCheckBox boxKick6;
    private javax.swing.JCheckBox boxKick7;
    private javax.swing.JCheckBox boxKick8;
    private javax.swing.JCheckBox boxMartelo6;
    private javax.swing.JCheckBox boxMartelo7;
    private javax.swing.JCheckBox boxMartelo8;
    private javax.swing.JCheckBox boxPanBarra6;
    private javax.swing.JCheckBox boxPanBarra7;
    private javax.swing.JCheckBox boxPanBarra8;
    private javax.swing.JCheckBox boxPanSalto6;
    private javax.swing.JCheckBox boxPanSalto7;
    private javax.swing.JCheckBox boxPanSalto8;
    private javax.swing.JCheckBox boxPanSentado6;
    private javax.swing.JCheckBox boxPanSentado7;
    private javax.swing.JCheckBox boxPanSentado8;
    private javax.swing.JCheckBox boxPanUni6;
    private javax.swing.JCheckBox boxPanUni7;
    private javax.swing.JCheckBox boxPanUni8;
    private javax.swing.JCheckBox boxPantLeg6;
    private javax.swing.JCheckBox boxPantLeg7;
    private javax.swing.JCheckBox boxPantLeg8;
    private javax.swing.JCheckBox boxPeck6;
    private javax.swing.JCheckBox boxPeck7;
    private javax.swing.JCheckBox boxPeck8;
    private javax.swing.JCheckBox boxPrensa6;
    private javax.swing.JCheckBox boxPrensa7;
    private javax.swing.JCheckBox boxPrensa8;
    private javax.swing.JCheckBox boxPuCostas6;
    private javax.swing.JCheckBox boxPuCostas7;
    private javax.swing.JCheckBox boxPuCostas8;
    private javax.swing.JCheckBox boxPuFrente6;
    private javax.swing.JCheckBox boxPuFrente7;
    private javax.swing.JCheckBox boxPuFrente8;
    private javax.swing.JCheckBox boxPuFrenteI6;
    private javax.swing.JCheckBox boxPuFrenteI7;
    private javax.swing.JCheckBox boxPuFrenteI8;
    private javax.swing.JCheckBox boxPulley6;
    private javax.swing.JCheckBox boxPulley7;
    private javax.swing.JCheckBox boxPulley8;
    private javax.swing.JCheckBox boxRemadaB6;
    private javax.swing.JCheckBox boxRemadaB7;
    private javax.swing.JCheckBox boxRemadaB8;
    private javax.swing.JCheckBox boxRemadaUni6;
    private javax.swing.JCheckBox boxRemadaUni7;
    private javax.swing.JCheckBox boxRemadaUni8;
    private javax.swing.JCheckBox boxRoscaA6;
    private javax.swing.JCheckBox boxRoscaA7;
    private javax.swing.JCheckBox boxRoscaA8;
    private javax.swing.JCheckBox boxRoscaD6;
    private javax.swing.JCheckBox boxRoscaD7;
    private javax.swing.JCheckBox boxRoscaD8;
    private javax.swing.JCheckBox boxRoscaI6;
    private javax.swing.JCheckBox boxRoscaI7;
    private javax.swing.JCheckBox boxRoscaI8;
    private javax.swing.JCheckBox boxRotacaoE6;
    private javax.swing.JCheckBox boxRotacaoE7;
    private javax.swing.JCheckBox boxRotacaoE8;
    private javax.swing.JCheckBox boxRotacaoI6;
    private javax.swing.JCheckBox boxRotacaoI7;
    private javax.swing.JCheckBox boxRotacaoI8;
    private javax.swing.JCheckBox boxScoty6;
    private javax.swing.JCheckBox boxScoty7;
    private javax.swing.JCheckBox boxScoty8;
    private javax.swing.JCheckBox boxStiff6;
    private javax.swing.JCheckBox boxStiff7;
    private javax.swing.JCheckBox boxStiff8;
    private javax.swing.JCheckBox boxSupinoInclinado6;
    private javax.swing.JCheckBox boxSupinoInclinado7;
    private javax.swing.JCheckBox boxSupinoInclinado8;
    private javax.swing.JCheckBox boxSupinoReto6;
    private javax.swing.JCheckBox boxSupinoReto7;
    private javax.swing.JCheckBox boxSupinoReto8;
    private javax.swing.JCheckBox boxTesta6;
    private javax.swing.JCheckBox boxTesta7;
    private javax.swing.JCheckBox boxTesta8;
    private javax.swing.JCheckBox boxTriSupinado6;
    private javax.swing.JCheckBox boxTriSupinado7;
    private javax.swing.JCheckBox boxTriSupinado8;
    private javax.swing.JCheckBox boxVoador6;
    private javax.swing.JCheckBox boxVoador7;
    private javax.swing.JCheckBox boxVoador8;
    private javax.swing.JButton btnAlterar;
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
    private javax.swing.JPanel painelBiceps6;
    private javax.swing.JPanel painelBiceps7;
    private javax.swing.JPanel painelBiceps8;
    private javax.swing.JPanel painelCostas6;
    private javax.swing.JPanel painelCostas7;
    private javax.swing.JPanel painelCostas8;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelDadosProfissionais;
    private javax.swing.JPanel painelGluteo6;
    private javax.swing.JPanel painelGluteo7;
    private javax.swing.JPanel painelGluteo8;
    private javax.swing.JPanel painelModalidades;
    private javax.swing.JPanel painelOmbro6;
    private javax.swing.JPanel painelOmbro7;
    private javax.swing.JPanel painelOmbro8;
    private javax.swing.JPanel painelPanturrilha6;
    private javax.swing.JPanel painelPanturrilha7;
    private javax.swing.JPanel painelPanturrilha8;
    private javax.swing.JPanel painelPeito6;
    private javax.swing.JPanel painelPeito7;
    private javax.swing.JPanel painelPeito8;
    private javax.swing.JPanel painelPerimetria;
    private javax.swing.JPanel painelPosTreino;
    private javax.swing.JPanel painelPreTreino;
    private javax.swing.JPanel painelQuadriceps6;
    private javax.swing.JPanel painelQuadriceps7;
    private javax.swing.JPanel painelQuadriceps8;
    private javax.swing.JPanel painelTreino;
    private javax.swing.JPanel painelTriceps6;
    private javax.swing.JPanel painelTriceps7;
    private javax.swing.JPanel painelTriceps8;
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
