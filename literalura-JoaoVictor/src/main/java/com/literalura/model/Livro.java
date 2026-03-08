
package com.literalura.model;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    private Autor autor;

    private String idioma;
    private Integer downloads;

    public Livro(){}

    public Livro(String titulo, Autor autor, String idioma, Integer downloads){
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.downloads = downloads;
    }

    public String getTitulo(){
        return titulo;
    }

    public Autor getAutor(){
        return autor;
    }
}
