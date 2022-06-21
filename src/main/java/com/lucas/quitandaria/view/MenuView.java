package com.lucas.quitandaria.view;

import com.lucas.quitandaria.fonts.FontManager;
import com.lucas.quitandaria.relogio.AtualizadorHorario;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
*@author – Lucasgabriellv
 */
public class MenuView extends javax.swing.JFrame {

    //INICIALIZAÇÃO DOS COMPONENTES
    public MenuView() {
        initComponents();
        AtualizadorHorario.start(lbRelogio);
        setLocationRelativeTo(null);
    }

    //CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTudo = new javax.swing.JPanel();
        jpCabecalho = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        lbRelogio2 = new javax.swing.JLabel();
        lbRelogio = new javax.swing.JLabel();
        jpBotoes = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnCadastroProduto = new javax.swing.JButton();
        btnConsultaProduto = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        btnConsultaCliente = new javax.swing.JButton();
        btnRelatorioVendas = new javax.swing.JButton();
        lbRelogio1 = new javax.swing.JLabel();
        jpCorpo = new javax.swing.JPanel();
        dskPainelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quitandaria");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 560));
        setMinimumSize(new java.awt.Dimension(1024, 560));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpTudo.setBackground(new java.awt.Color(255, 255, 255));
        jpTudo.setMaximumSize(new java.awt.Dimension(1024, 560));
        jpTudo.setMinimumSize(new java.awt.Dimension(1024, 560));
        jpTudo.setPreferredSize(new java.awt.Dimension(1024, 560));

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(1024, 40));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(1024, 40));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(1024, 40));

        btnSair.setBackground(new java.awt.Color(17, 128, 216));
        btnSair.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/power 25x25.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lbRelogio2.setBackground(new java.awt.Color(17, 128, 216));
        lbRelogio2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbRelogio2.setForeground(new java.awt.Color(255, 255, 255));
        lbRelogio2.setText("Quitandaria");

        lbRelogio.setBackground(new java.awt.Color(17, 128, 216));
        lbRelogio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRelogio.setForeground(new java.awt.Color(255, 255, 255));
        lbRelogio.setText("22/06/2022 23:59:59");

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRelogio2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(lbRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRelogio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpBotoes.setBackground(new java.awt.Color(102, 102, 102));
        jpBotoes.setForeground(new java.awt.Color(153, 153, 153));
        jpBotoes.setMaximumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setMinimumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setPreferredSize(new java.awt.Dimension(165, 502));

        btnVenda.setBackground(new java.awt.Color(17, 128, 216));
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Venda");
        btnVenda.setBorder(null);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnCadastroProduto.setBackground(new java.awt.Color(17, 128, 216));
        btnCadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroProduto.setText("Cadastrar Produto");
        btnCadastroProduto.setBorder(null);
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

        btnConsultaProduto.setBackground(new java.awt.Color(17, 128, 216));
        btnConsultaProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaProduto.setText("Consultar Produto");
        btnConsultaProduto.setBorder(null);
        btnConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProdutoActionPerformed(evt);
            }
        });

        btnCadastroCliente.setBackground(new java.awt.Color(17, 128, 216));
        btnCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroCliente.setText("Cadastrar Cliente");
        btnCadastroCliente.setBorder(null);
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        btnConsultaCliente.setBackground(new java.awt.Color(17, 128, 216));
        btnConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaCliente.setText("Consultar Cliente");
        btnConsultaCliente.setBorder(null);
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClienteActionPerformed(evt);
            }
        });

        btnRelatorioVendas.setBackground(new java.awt.Color(17, 128, 216));
        btnRelatorioVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioVendas.setText("Relatório");
        btnRelatorioVendas.setBorder(null);
        btnRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioVendasActionPerformed(evt);
            }
        });

        lbRelogio1.setBackground(new java.awt.Color(17, 128, 216));
        lbRelogio1.setForeground(new java.awt.Color(255, 255, 255));
        lbRelogio1.setText("Lucas Gabriel Lins Veloso");

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBotoesLayout.createSequentialGroup()
                        .addComponent(lbRelogio1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbRelogio1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbRelogio1.getAccessibleContext().setAccessibleParent(jpCabecalho);

        jpCorpo.setMaximumSize(new java.awt.Dimension(853, 514));
        jpCorpo.setMinimumSize(new java.awt.Dimension(853, 514));
        jpCorpo.setPreferredSize(new java.awt.Dimension(853, 514));

        dskPainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dskPainelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dskPainelPrincipal.setMaximumSize(new java.awt.Dimension(853, 514));
        dskPainelPrincipal.setMinimumSize(new java.awt.Dimension(853, 514));

        javax.swing.GroupLayout dskPainelPrincipalLayout = new javax.swing.GroupLayout(dskPainelPrincipal);
        dskPainelPrincipal.setLayout(dskPainelPrincipalLayout);
        dskPainelPrincipalLayout.setHorizontalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        dskPainelPrincipalLayout.setVerticalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpCorpoLayout = new javax.swing.GroupLayout(jpCorpo);
        jpCorpo.setLayout(jpCorpoLayout);
        jpCorpoLayout.setHorizontalGroup(
            jpCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCorpoLayout.setVerticalGroup(
            jpCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpTudoLayout = new javax.swing.GroupLayout(jpTudo);
        jpTudo.setLayout(jpTudoLayout);
        jpTudoLayout.setHorizontalGroup(
            jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTudoLayout.createSequentialGroup()
                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpTudoLayout.createSequentialGroup()
                        .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpTudoLayout.setVerticalGroup(
            jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTudoLayout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //NAO MEXER NO METODO ABAIXO (DECLARACAO DE CLASSE PRINCIPAL)
    public static void main(String args[]) {
        //NIMBUS==================================================================
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });

    }
//==============================================================================
//DECLARACOES
//==============================================================================
    private VendaView TelaDeVenda;
    private ProdutoCadastroAlteracaoView produtoCadastroAlteracao;
    private ProdutoConsultaView produtoConsulta;
    private ClienteCadastroAlteracaoView clienteCadastroAlteracao;
    private ClienteConsultaView clienteConsulta;
    private RelatorioConsultaView relatorioConsulta;

//==============================================================================
//GETERS E SETERS
//============================================================================== 
    public JDesktopPane getDskPainelPrincipal() {
        return dskPainelPrincipal;
    }

    public void setDskPainelPrincipal(JDesktopPane dskPainelPrincipal) {
        this.dskPainelPrincipal = dskPainelPrincipal;
    }

//==============================================================================
//FUNCOES
//==============================================================================
    //TELA DE VENDA
    public void telaVenda() {
        //verifica se a tela ja existe
        if (TelaDeVenda == null) {
            //se não existir faz uma tela
            TelaDeVenda = new VendaView();
            TelaDeVenda.menuView = this;
        }

        //verifico se a tela ja esta no painel
        if (!TelaDeVenda.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(TelaDeVenda);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            TelaDeVenda.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        TelaDeVenda.toFront();

        //redimensiona tela para tamanho do painel
        try {
            TelaDeVenda.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //retira o painel superior
        ((BasicInternalFrameUI) TelaDeVenda.getUI()).setNorthPane(null);
    }

    //CADASTRAR PRODUTO
    public void cadastrarProduto() {
        //verifica se a tela ja existe
        if (produtoCadastroAlteracao == null) {
            //se não existir faz uma tela
            produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
        }

        //coloca cabecario de acordo com a funcao cadasto/alteracao
        produtoCadastroAlteracao.setCabecario("Cadastro de Produto");

        //verifico se a tela ja esta no painel
        if (!produtoCadastroAlteracao.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(produtoCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoCadastroAlteracao.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        produtoCadastroAlteracao.toFront();

        //redimensiona tela para tamanho do painel
        try {
            produtoCadastroAlteracao.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //retira o painel superior
        ((BasicInternalFrameUI) produtoCadastroAlteracao.getUI()).setNorthPane(null);
    }

    //CONSULTAR PRODUTO
    public void consultarProduto() {
        //verifica se a tela ja existe
        if (produtoConsulta == null) {
            //se não existir faz uma tela
            produtoConsulta = new ProdutoConsultaView();
        }

        //verifico se a tela ja esta no painel
        if (!produtoConsulta.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(produtoConsulta);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoConsulta.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        produtoConsulta.toFront();

        //redimensiona tela para tamanho do painel
        try {
            produtoConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //limpa tabela de pesquisa
        produtoConsulta.tableModelLimpar();

        //retira o painel superior
        ((BasicInternalFrameUI) produtoConsulta.getUI()).setNorthPane(null);
    }

    //CADASTRAR CLIENTE
    public void cadastrarCliente() {
        //verifica se a tela ja existe
        if (clienteCadastroAlteracao == null) {
            //se não existir faz uma tela
            clienteCadastroAlteracao = new ClienteCadastroAlteracaoView();
        }

        //coloca cabecario de acordo com a funcao cadasto/alteracao
        clienteCadastroAlteracao.setCabecario("Cadastro de Cliente");

        //verifico se a tela ja esta no painel
        if (!clienteCadastroAlteracao.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(clienteCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            clienteCadastroAlteracao.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        clienteCadastroAlteracao.toFront();

        //redimensiona tela para tamanho do painel
        try {
            clienteCadastroAlteracao.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //retira o painel superior
        ((BasicInternalFrameUI) clienteCadastroAlteracao.getUI()).setNorthPane(null);
    }

    //CONSULTAR CLIENTE
    public void consultarCliente() {
        //verifica se a tela ja existe
        if (clienteConsulta == null) {
            //se não existir faz uma tela
            clienteConsulta = new ClienteConsultaView();
        }

        //verifico se a tela ja esta no painel
        if (!clienteConsulta.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(clienteConsulta);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            clienteConsulta.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        clienteConsulta.toFront();

        //redimensiona tela para tamanho do painel
        try {
            clienteConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //limpa tabela de pesquisa
        clienteConsulta.tableModelLimpar();

        //retira o painel superior
        ((BasicInternalFrameUI) clienteConsulta.getUI()).setNorthPane(null);
    }

    //RELATORIO DE VENDAS
    public void relatorioVendas() {
        //verifica se a tela ja existe
        if (relatorioConsulta == null) {
            //se não existir faz uma tela
            relatorioConsulta = new RelatorioConsultaView();
        }

        //verifico se a tela ja esta no painel
        if (!relatorioConsulta.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(relatorioConsulta);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            relatorioConsulta.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        relatorioConsulta.toFront();

        //redimensiona tela para tamanho do painel
        try {
            relatorioConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //limpa tabela de pesquisa
        relatorioConsulta.tableModelLimpar();

        //retira o painel superior
        ((BasicInternalFrameUI) relatorioConsulta.getUI()).setNorthPane(null);
    }

//==============================================================================
//EVENTOS
//==============================================================================
    //CADASTRO DE PRODUTO
    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutoActionPerformed
        cadastrarProduto();
    }//GEN-LAST:event_btnCadastroProdutoActionPerformed

    //CONSULTA DE PRODUTO
    private void btnConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaProdutoActionPerformed
        consultarProduto();
    }//GEN-LAST:event_btnConsultaProdutoActionPerformed

    //FECHAR APLICAÇÃO
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    //CADASTRO DE CLIENTE
    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        cadastrarCliente();
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    //CONSULTA DE CLIENTE
    private void btnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClienteActionPerformed
        consultarCliente();
    }//GEN-LAST:event_btnConsultaClienteActionPerformed

    //RELATORIO VENDAS
    private void btnRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioVendasActionPerformed
        relatorioVendas();
    }//GEN-LAST:event_btnRelatorioVendasActionPerformed

    //VENDA
    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        telaVenda();
    }//GEN-LAST:event_btnVendaActionPerformed

    //INTERFACE INICIA
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FontManager fontManager = new FontManager();
        Font futuraPT14 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 14);
        Font futuraPT16 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 16);

        btnCadastroCliente.setFont(futuraPT14);
        btnConsultaCliente.setFont(futuraPT14);
        btnCadastroProduto.setFont(futuraPT14);
        btnConsultaProduto.setFont(futuraPT14);
        btnVenda.setFont(futuraPT14);
        btnRelatorioVendas.setFont(futuraPT14);
        lbRelogio.setFont(futuraPT16);
    }//GEN-LAST:event_formWindowOpened
//GEN-FIRST:event_btnSairActionPerformed
    //VENDA
//GEN-LAST:event_btnSairActionPerformed
   
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnCadastroProduto;
    private javax.swing.JButton btnConsultaCliente;
    private javax.swing.JButton btnConsultaProduto;
    private javax.swing.JButton btnRelatorioVendas;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVenda;
    private javax.swing.JDesktopPane dskPainelPrincipal;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JPanel jpCorpo;
    private javax.swing.JPanel jpTudo;
    private javax.swing.JLabel lbRelogio;
    private javax.swing.JLabel lbRelogio1;
    private javax.swing.JLabel lbRelogio2;
    // End of variables declaration//GEN-END:variables
}
