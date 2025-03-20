package br.edu.unicesumar.unicesumar.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nome;

    private String autor;

    private BookStatus statusLivro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return statusLivro.name();
    }

    public void setStatus(BookStatus statusLivro) {
        this.statusLivro = statusLivro;
    }
}
