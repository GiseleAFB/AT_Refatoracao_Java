import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int ano) {
        Livro l = new Livro(titulo, autor, ano);
        livros.add(l);
    }

    public Livro buscarLivroDisponivel(String tituloLivro) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro) && l.isDisponivel()) {
                return l;
            }
        }
        return null;
    }

    public void realizarEmprestimo(Usuario u, String tituloLivro) {
        Livro livroEncontrado = buscarLivroDisponivel(tituloLivro);

        if (livroEncontrado != null) {
            Emprestimo e = new Emprestimo(u, livroEncontrado);
            emprestimos.add(e);
            livroEncontrado.setDisponivel(false);
            System.out.println("Empréstimo realizado: " + u.getNome() + " pegou " + livroEncontrado.getTitulo());
        } else {
            System.out.println("Livro não disponível.");
        }
    }

    public void listarEmprestimos() {
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }
    }

    public void relatorioLivros() {
        for (Livro l : livros) {
            System.out.println(l);
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
