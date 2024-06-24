package com.projetosrafaelfemina.appfilmes.Model;

import kotlin.Suppress;

public class Movie {

    private String titulo;  // title - titulo
    private String capa;    // cover - capa
    private String descricao;   // description - descricao
    private String elenco;  //cast - elenco
    private String video;   //movie - video

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
