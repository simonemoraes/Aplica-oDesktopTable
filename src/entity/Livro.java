package entity;

public class Livro {

    private long id;
    private String editora;
    private String titulo;
    private String Isbn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }
    
    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", editora=" + editora + ", titulo=" + titulo + ", Isbn=" + Isbn + '}';
    }
    
    
}
