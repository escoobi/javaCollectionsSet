package br.com;

import java.lang.reflect.Array;
import java.util.*;

public class javaset {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //System.out.println(notas.toString());

        Iterator<Double> it = notas.iterator();
        Double soma = 0.0;
        while (it.hasNext()){
            Double prox = it.next();
            soma += prox;
        }
       // System.out.println(soma);
       // System.out.println(soma/notas.size());

        notas.remove(0.0);
       // System.out.println(notas);

        notas.clear();
       // System.out.println(notas);

        Set<ordenSets.Serie> minhasSeries = new HashSet<>(){{
           add(new ordenSets.Serie("got", "fantasia", 60));
           add(new ordenSets.Serie("dark", "drama", 120));
           add(new ordenSets.Serie("that '70s show", "fantasia", 90));
        }};

        // for (ordenSets.Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());

        Set<ordenSets.Serie> minhasSeriess = new LinkedHashSet<>(){{
            add(new ordenSets.Serie("got", "fantasia", 60));
            add(new ordenSets.Serie("dark", "drama", 120));
            add(new ordenSets.Serie("that '70s show", "fantasia", 90));
        }};

         for (ordenSets.Serie serie: minhasSeriess) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());


        Set<ordenSets.Serie> minhasSeriesss = new TreeSet<>(minhasSeries);

        System.out.println("\n");
        for (ordenSets.Serie serie: minhasSeriesss) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
    }
}
