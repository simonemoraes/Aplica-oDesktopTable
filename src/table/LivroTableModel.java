
package table;

import entity.Livro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

//Class onde é criada todos os metodos para a criação de uma tabela com conexão com BD

public class LivroTableModel extends AbstractTableModel {
    
    private static final int COL_ID = 0;
    private static final int COL_EDITORA = 1;
    private static final int COL_TITULO = 2;
    private static final int COL_ISBN = 3;
    
    private List<Livro> valores;
    
     public LivroTableModel(List<Livro> valores) {
        this.valores = valores;
    }
    
    @Override
    public int getRowCount() {
        //retorna o valor da lista(saber quantas linhas a lista ira possuir)
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        //retorna o numero de colunas
        return 4;
    }

    @Override
    public Object getValueAt( int rowIndex, int columnIndex ) {
        //o metodo ira saber qual o valor da linha (para saber qual linha está sendo acessada)
        Livro livro = valores.get(rowIndex);
        
        //Teste na coluna para saber se a coluna possui o mesmo valor que foi setado
        if ( columnIndex == COL_ID ) {
            return livro.getId();
        } else if ( columnIndex == COL_EDITORA ) {
            return livro.getEditora();
        } else if ( columnIndex == COL_TITULO ) {
            return livro.getTitulo();
        } else if ( columnIndex == COL_ISBN ) {
            return livro.getIsbn();
        }                
        return null;
    }

    @Override
    public String getColumnName( int column ) {
        //Metodo para preencher os nomes das colunas.
        String coluna = "";
        
        switch ( column ) {
            case COL_ID:
                coluna = "Código";
                break;
            case COL_EDITORA:
                coluna = "Editora";
                break;
            case COL_TITULO:
                coluna = "Título";
                break;
            case COL_ISBN:
                coluna = "ISBN";
                break;
            default:
                throw new IllegalArgumentException( "Coluna inválida!" );
        }
        return coluna;       
    }

    @Override
    public Class<?> getColumnClass( int columnIndex ) {
        //Metodo para saber o tipo de dado que cada coluna tem.
        if ( columnIndex == COL_ID ) {
            return Long.class; 
        } else if ( columnIndex == COL_EDITORA ) {
            return String.class;
        } else if ( columnIndex == COL_TITULO ) {
            return String.class;
        } else if ( columnIndex == COL_ISBN ) {
            return String.class;
        }        
        return null;
    }
    
    // metodo para saber qual linha esta sendo utilizada retornando o valor que essa linha tem.
    public Livro get( int row ) {
        return valores.get( row );
    }
    
}
