package com.book.demo.book;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_BOOK")
public class BookModel {

     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nome;
     private String categoria;
     private String senha;

     public BookModel(){
     }

    public BookModel(Long id, String nome, String categoria, String senha) {
        this.nome = nome;
        this.categoria = categoria;
        this.id = id;
        this.senha = senha;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
