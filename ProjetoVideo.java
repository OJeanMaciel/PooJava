package br.com.Video;

public class ProjetoVideo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 14 de Projeto");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jean", 22, "M", "Joker");
        g[1] = new Gafanhoto("Patrick", 20, "M", "Alemão");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());


    }

}
