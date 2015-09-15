
package dao;

import entity.Livro;
import java.util.List;

public interface ILivroDao {
    
    int save ( Livro livro );
    int update ( Livro livro );
    int remove ( Long id );
    List<Livro> findAll ();
}
