
package facade;

import entity.Livro;
import dao.ILivroDao;
import dao.LivroDao;
import java.util.List;

/* A class facade intermedia a interface grafica da class dao que faz a conexao com BD
   É class facade que é feita toda a regra de negocio se necessario  */
public class LivroFacade {
    
    private ILivroDao dao;
    
     public LivroFacade ( ) {
        this.dao = new LivroDao();
    }
     
     public int save ( Livro livro ) {
         return dao.save( livro );
     }
     
     public int update ( Livro livro ) {
         return dao.update( livro );
     }
     
     public int remove ( Long livro ) {
         return dao.remove( livro );
     }
     
     public List<Livro> findAll () {
         return dao.findAll();
     }
}
