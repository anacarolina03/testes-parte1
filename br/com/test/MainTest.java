package br.com.test;

import org.junit.jupiter.api.Test;

import br.com.stream.Main;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    void testFiltrarMulheres() {
        List<String> input = List.of("MARCIO-MASCULINO", "LUARA-FEMININO", "LETICIA-FEMININO");
        List<String> resultadoEsperado = List.of("LUARA-FEMININO", "LETICIA-FEMININO");

        List<String> resultado = Main.filtrarMulheres(input);

        assertEquals(resultadoEsperado, resultado);
    }
}