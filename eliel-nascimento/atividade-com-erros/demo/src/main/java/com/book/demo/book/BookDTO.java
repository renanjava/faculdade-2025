package com.book.demo.book;

public class BookDTO {

    private Long id;
    private String nome;
    private String categoria;
    private String senha;

    public BookModel transformaParaObjeto(){
        return new BookModel(this.id, this.nome, this.categoria, this.senha);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSenha(String senha) { this.senha = senha; }

    public String getSenha() { return this.senha; }
}
