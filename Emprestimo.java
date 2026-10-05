import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate data;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.data = LocalDate.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    @Override
    public String toString() {
        return "Usuário: " + usuario.getNome() + " - Livro: " + livro.getTitulo() + " - Data: " + getDataFormatada();
    }
}