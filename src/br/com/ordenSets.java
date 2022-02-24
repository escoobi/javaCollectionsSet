package br.com;

import java.util.Objects;

public class ordenSets {
    static class Serie implements Comparable <Serie>{
        private String nome;
        private String genero;
        private Integer tempoEp;

        public Serie(String nome, String genero, Integer tempoEp) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEp = tempoEp;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEp() {
            return tempoEp;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEp=" + tempoEp +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEp, serie.tempoEp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEp);
        }


        @Override
        public int compareTo(Serie o) {
            return Integer.compare(this.getTempoEp(), o.getTempoEp());
        }
    }
}
