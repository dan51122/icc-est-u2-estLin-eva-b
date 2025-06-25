package test;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.Queue;

import main.LogicaClasificacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicaClasificacionTest {

    LogicaClasificacion logica = new LogicaClasificacion();

    @Test
    void testInvertirColaNombres() {
        Queue<String> entrada = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        Queue<String> esperado = new LinkedList<>(Arrays.asList("Pedro", "Luis", "Ana"));
        Queue<String> resultado = logica.invertirColaNombres(entrada);
        assertEquals(esperado, resultado);

        // Probar con una cola vacía
        Queue<String> colaVacia = new LinkedList<>();
        Queue<String> resultadoVacio = logica.invertirColaNombres(colaVacia);
        assertEquals(new LinkedList<>(), resultadoVacio);

        // Probar con una cola de un solo elemento
        Queue<String> casoUnico = new LinkedList<>(Arrays.asList("Solo"));
        Queue<String> resultadoUnico = logica.invertirColaNombres(casoUnico);
        assertEquals(new LinkedList<>(Arrays.asList("Solo")), resultadoUnico);

        // Probar con una cola con elementos repetidos
        Queue<String> casoRepetidos = new LinkedList<>(Arrays.asList("Uno", "Repetido", "Repetido"));
        Queue<String> resultadoRepetidos = logica.invertirColaNombres(casoRepetidos);
        assertEquals(new LinkedList<>(Arrays.asList("Repetido", "Repetido", "Uno")), resultadoRepetidos);

        // Probar con una cola con elementos en mayúsculas y minúsculas
        Queue<String> casoMayusculas = new LinkedList<>(Arrays.asList("Ana", "luis", "PEDRO"));
        Queue<String> resultadoMayusculas = logica.invertirColaNombres(casoMayusculas);
        assertEquals(new LinkedList<>(Arrays.asList("PEDRO", "luis", "Ana")), resultadoMayusculas);

        // Probar con una cola con espacios en blanco
        Queue<String> casoEspacios = new LinkedList<>(Arrays.asList("  Ana", "Luis  ", "  Pedro  "));
        Queue<String> resultadoEspacios = logica.invertirColaNombres(casoEspacios);
        assertEquals(new LinkedList<>(Arrays.asList("  Pedro  ", "Luis  ", "  Ana")), resultadoEspacios);

    }

    @Test
    void testIntercalarColas() {
        // Caso 1: colas de igual tamaño
        Queue<Integer> cola1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> cola2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        Queue<Integer> esperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(esperado, logica.intercalarColas(cola1, cola2));

        // Caso 2: una cola más larga
        cola1 = new LinkedList<>(Arrays.asList(10, 20));
        cola2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        esperado = new LinkedList<>(Arrays.asList(10, 1, 20, 2, 3, 4));
        assertEquals(esperado, logica.intercalarColas(cola1, cola2));

        // Caso 3: una cola vacía
        cola1 = new LinkedList<>();
        cola2 = new LinkedList<>(Arrays.asList(7, 8));
        esperado = new LinkedList<>(Arrays.asList(7, 8));
        assertEquals(esperado, logica.intercalarColas(cola1, cola2));

        // Caso 4: ambas vacías
        cola1 = new LinkedList<>();
        cola2 = new LinkedList<>();
        esperado = new LinkedList<>();
        assertEquals(esperado, logica.intercalarColas(cola1, cola2));
    }
}
