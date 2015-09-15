package form;

import controller.LivroController;
import entity.Livro;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import table.LivroCellRenderer;
import table.LivroTableModel;

public class LivroForm1 extends javax.swing.JFrame {

    private List<Livro> livroList;
    private Long idLivro;

    public LivroForm1() throws HeadlessException {
        super("Cadastro de Livros");
        initComponents();
        redefinindoLayout();
        refreshTable();
        enableFields(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButtons = new javax.swing.JPanel();
        btn_New = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Remove = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panelAdd = new javax.swing.JPanel();
        lb_Editora = new javax.swing.JLabel();
        lb_Titulo = new javax.swing.JLabel();
        lb_Isbn = new javax.swing.JLabel();
        tf_Editora = new javax.swing.JTextField();
        tf_Titulo = new javax.swing.JTextField();
        tf_Isbn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        panelButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelButtons.setPreferredSize(new java.awt.Dimension(478, 40));

        btn_New.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Projeto_netbeans\\TutorialJTable\\src\\img\\new.png")); // NOI18N
        btn_New.setAlignmentY(0.0F);
        btn_New.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
            }
        });

        btn_Cancel.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Projeto_netbeans\\TutorialJTable\\src\\img\\cancel.png")); // NOI18N
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_Update.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Projeto_netbeans\\TutorialJTable\\src\\img\\edit.png")); // NOI18N
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Remove.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Projeto_netbeans\\TutorialJTable\\src\\img\\trash.png")); // NOI18N
        btn_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveActionPerformed(evt);
            }
        });

        btn_Save.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Projeto_netbeans\\TutorialJTable\\src\\img\\save.png")); // NOI18N
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btn_New)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Cancel)
                .addGap(18, 18, 18)
                .addComponent(btn_Save)
                .addGap(18, 18, 18)
                .addComponent(btn_Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Remove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_New, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Save, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Update, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Remove, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Livros"));
        panelTable.setPreferredSize(new java.awt.Dimension(480, 240));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane.setViewportView(table);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        panelAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adicionar Livros"));
        panelAdd.setPreferredSize(new java.awt.Dimension(480, 100));

        lb_Editora.setText("Editora:");

        lb_Titulo.setText("Título:");

        lb_Isbn.setText("ISBN:");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Editora)
                            .addComponent(lb_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_Editora)
                    .addComponent(tf_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(tf_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Editora)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(tf_Editora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Titulo))
                        .addGap(9, 9, 9)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Isbn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(panelButtons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(panelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        onSaveLivro();
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        onCancelar();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        onNovoLivro();
    }//GEN-LAST:event_btn_NewActionPerformed

    private void btn_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveActionPerformed
        onRemoverLivro();
    }//GEN-LAST:event_btn_RemoveActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        onAlterarLivro();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_New;
    private javax.swing.JButton btn_Remove;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel lb_Editora;
    private javax.swing.JLabel lb_Isbn;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JTextField tf_Editora;
    private javax.swing.JTextField tf_Isbn;
    private javax.swing.JTextField tf_Titulo;
    // End of variables declaration//GEN-END:variables

    private void onNovoLivro() {
        enableFields(true);
    }

    private void onCancelar() {
        tf_Editora.setText("");
        tf_Titulo.setText("");
        tf_Isbn.setText("");
        enableFields(false);
    }

    private void onSaveLivro() {
        Livro livro = new Livro();
        if (tf_Editora.getText().length() > 0 && tf_Titulo.getText().length() > 0 && tf_Isbn.getText().length() > 0) {
            livro.setEditora(tf_Editora.getText());
            livro.setTitulo(tf_Titulo.getText());
            livro.setIsbn(tf_Isbn.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Todos os são obrigatórios!");
            return;
        }

        int result = 0;
        if (idLivro == null) {
            result = new LivroController().addLivro(livro);
        } else {
            livro.setId(idLivro);
            result = new LivroController().alterarLivro(livro);
            idLivro = null;
        }

        if (result == 1) {
            JOptionPane.showMessageDialog(this, "Valor inserido com sucesso!");
            enableFields(false);
            onCancelar();
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }

    private void onAlterarLivro() {
        //Captura a linha selecionada.
        int rowIndex = table.getSelectedRow();

        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione o livro a ser alterado");
            return;
        }

        // recupera o objeto que será alterado.
        Livro livro = new LivroTableModel(livroList).get(rowIndex);

        //recupera o id selecionado na tabela.
        idLivro = livro.getId();

        tf_Editora.setText(livro.getEditora());
        tf_Titulo.setText(livro.getTitulo());
        tf_Isbn.setText(livro.getIsbn());

        enableFields(true);

    }

    private void onRemoverLivro() {
        //Captura a linha selecionada
        int rowIndex = table.getSelectedRow();

        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione o livro a ser removido");
            return;
        }

        Livro livro = new LivroTableModel(livroList).get(rowIndex);

        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?", "Excluir Livro", JOptionPane.YES_NO_OPTION);

        if (confirm != 0) {
            return;
        }

        int result = new LivroController().excluirLivro(livro.getId());

        if (result == 1) {
            JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }

    /* Método que subscreve o tipo de layout do JPanel */
    private void redefinindoLayout() {
        panelAdd = new JPanel(new MigLayout());
        panelTable = new JPanel(new MigLayout());
        panelButtons = new JPanel(new MigLayout());
    }

    // Metodo que bloqueia os campos ao carregar a aplicação
    private void enableFields(boolean b) {
        tf_Editora.setEditable(b);
        tf_Titulo.setEditable(b);
        tf_Isbn.setEditable(b);
    }
    /* Método que edita a tabela */

    private void refreshTable() {

        livroList = new LivroController().findLivros();
        if (livroList != null) {
            table.setModel(new LivroTableModel(livroList));
            table.setDefaultRenderer(Object.class, new LivroCellRenderer());
        }
    }
}
