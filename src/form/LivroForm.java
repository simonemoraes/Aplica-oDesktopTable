package form;

import controller.LivroController;
import entity.Livro;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import table.LivroCellRenderer;
import table.LivroTableModel;

public class LivroForm extends JFrame {

    private JLabel lb_Editora, lb_Titulo, lb_Isbn;
    private JTextField tf_Editora, tf_Titulo, tf_Isbn;
    private JPanel panelAdd, panelTable, panelButtons;
    private JButton btn_New, btn_Save, btn_Update, btn_Remove, btn_Cancel;
    private JTable table;
    private JScrollPane scrollPane;

    private List<Livro> livroList;
    private Long idLivro; //recebera  id recuperado para se ter acesso a esse id.

    public LivroForm() throws HeadlessException {
        super("Cadastro de Livros");
        setContentPane(new JPanel());
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelAdd = new JPanel(new MigLayout());

        panelAdd.setBorder(BorderFactory.createTitledBorder("Adicionar Livros"));
        panelAdd.setBounds(5, 0, 480, 100);

        lb_Editora = new JLabel("Editora");
        lb_Titulo = new JLabel("Título");
        lb_Isbn = new JLabel("ISBN");

        tf_Editora = new JTextField(50);
        tf_Titulo = new JTextField(50);
        tf_Isbn = new JTextField(15);

        panelAdd.add(lb_Editora);
        panelAdd.add(tf_Editora, "span, growx"); // span(espande o campo / (growx (pula linha))

        panelAdd.add(lb_Titulo);
        panelAdd.add(tf_Titulo, "span, growx");

        panelAdd.add(lb_Isbn);
        panelAdd.add(tf_Isbn, "wrap para");

        panelButtons = new JPanel(new MigLayout());
        panelButtons.setBorder(BorderFactory.createEtchedBorder());
        panelButtons.setBounds(5, 105, 480, 40);

        ClassLoader loader = getClass().getClassLoader();

        btn_New = new JButton(new ImageIcon(loader.getResource("img/new.png")));
        btn_Save = new JButton(new ImageIcon(loader.getResource("img/save.png")));
        btn_Cancel = new JButton(new ImageIcon(loader.getResource("img/cancel.png")));
        btn_Remove = new JButton(new ImageIcon(loader.getResource("img/trash.png")));
        btn_Update = new JButton(new ImageIcon(loader.getResource("img/edit.png")));

        panelButtons.add(btn_New, "gapleft 90"); // Alinha a esquerda com espaço de 90.
        panelButtons.add(btn_Cancel);
        panelButtons.add(btn_Save, "gap unrelated"); // Insere um espaço entre um botão e outro
        panelButtons.add(btn_Update, "gap unrelated");
        panelButtons.add(btn_Remove);

        panelTable = new JPanel(new MigLayout());
        panelTable.setBorder(BorderFactory.createTitledBorder("Lista de Livros"));
        panelTable.setBounds(5, 150, 480, 240);

        table = new JTable();

        scrollPane = new JScrollPane(table);

        panelTable.add(scrollPane);

        refreshTable();
        enableFields(false);

        add(panelAdd);
        add(panelButtons);
        add(panelTable);
        setMinimumSize(new Dimension(500, 420));
        setLocationRelativeTo(this);
        setVisible(true);

        btn_Save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                onSaveLivro();
            }

        });

        btn_Cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                onCancelar();
            }

        });

        btn_New.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                onNovoLivro();
            }

        });
        
         btn_Remove.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                onRemoverLivro();
            }

        });
         
          btn_Update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                onAlterarLivro();
            }

        });
    }

    private void onNovoLivro() {
        enableFields( true );
    }
    
     private void onCancelar() {
        tf_Editora.setText("");
        tf_Titulo.setText("");
        tf_Isbn.setText("");
        enableFields( false );
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
            enableFields( false );
            onCancelar();
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }

    private void onAlterarLivro() {
         //Captura a linha selecionada.
        int rowIndex = table.getSelectedRow();
        
        if ( rowIndex == -1 ) {
            JOptionPane.showMessageDialog( this, "Selecione o livro a ser alterado");
            return;
        }
        
        // recupera o objeto que será alterado.
        Livro livro = new LivroTableModel(livroList).get(rowIndex);
        
        //recupera o id selecionado na tabela.
        idLivro = livro.getId();
        
        tf_Editora.setText( livro.getEditora() );
        tf_Titulo.setText( livro.getTitulo() );
        tf_Isbn.setText( livro.getIsbn() );
        
        enableFields( true );
        
        
    }
    
    private void onRemoverLivro() {
        //Captura a linha selecionada
        int rowIndex = table.getSelectedRow();
        
        if ( rowIndex == -1 ) {
            JOptionPane.showMessageDialog( this, "Selecione o livro a ser removido");
            return;
        }
        
        Livro livro = new LivroTableModel(livroList).get(rowIndex);
        
        int confirm = JOptionPane.showConfirmDialog( this, "Confirmar exclusão?", "Excluir Livro", JOptionPane.YES_NO_OPTION);
        
        if ( confirm != 0 ) {
            return;
        }
        
        int result = new LivroController().excluirLivro( livro.getId() );
        
         if (result == 1) {
            JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }
    
    // Metodo que bloqueia os campos ao carregar a aplicação

    private void enableFields(boolean b) {
        tf_Editora.setEditable(b);
        tf_Titulo.setEditable(b);
        tf_Isbn.setEditable(b);
    }

    private void refreshTable() {
        livroList = new LivroController().findLivros();
        if (livroList != null) {
            table.setModel(new LivroTableModel(livroList));
            table.setDefaultRenderer( Object.class, new LivroCellRenderer() );
        }
    }
}
