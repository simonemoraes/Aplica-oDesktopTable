
package controller;

import entity.Livro;
import facade.LivroFacade;
import java.util.List;

public class LivroController {

    private LivroFacade facade;
      
    /* A class de controler é apenas voltada para a interface grafica */
    public LivroController() {
        this.facade = new LivroFacade();
    }
    
    public int addLivro ( Livro livro ) {
        return facade.save( livro );
    }
    
    public int alterarLivro ( Livro livro ) {
        return facade.update(livro);
    }
    
    public int excluirLivro ( Long id ) {
        return facade.remove(id);
    }
    
    public List<Livro> findLivros() {
        return facade.findAll();
    }
}
