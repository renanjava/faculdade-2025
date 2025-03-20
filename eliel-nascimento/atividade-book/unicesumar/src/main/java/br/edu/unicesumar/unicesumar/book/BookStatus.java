package br.edu.unicesumar.unicesumar.book;

public enum BookStatus {
    DISPONIVEL("Livro disponível"),
    EM_EMPRESTIMO("Livro em emprestimo"),
    RESERVADO("Livro reservado");

    private final String descricao;

    BookStatus(String descricao) {
        this.descricao = descricao;
    }
}
