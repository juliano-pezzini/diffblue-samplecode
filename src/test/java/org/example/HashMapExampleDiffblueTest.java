package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HashMapExampleDiffblueTest {
  /**
   * Method under test:
   * {@link HashMapExample.Funcoes#validaConsultaPadrao(ArrayList)}
   */
  @Test
  void testFuncoesValidaConsultaPadrao() {
    // Arrange, Act and Assert
    assertNull(HashMapExample.Funcoes.validaConsultaPadrao(new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link HashMapExample.Funcoes#validaConsultaPadrao(ArrayList)}
   */
  @Test
  void testFuncoesValidaConsultaPadrao2() {
    // Arrange
    ArrayList<HashMap> hashMaps = new ArrayList<>();
    hashMaps.add(new HashMap());

    // Act and Assert
    assertNull(HashMapExample.Funcoes.validaConsultaPadrao(hashMaps));
  }

  /**
   * Method under test:
   * {@link HashMapExample.Funcoes#validaConsultaPadrao(ArrayList)}
   */
  @Test
  void testFuncoesValidaConsultaPadrao3() {
    // Arrange
    ArrayList<HashMap> hashMaps = new ArrayList<>();
    hashMaps.add(new HashMap());
    hashMaps.add(new HashMap());

    // Act and Assert
    assertNull(HashMapExample.Funcoes.validaConsultaPadrao(hashMaps));
  }

  /**
   * Method under test: {@link HashMapExample#methodThatReturnAHashMap(HashMap)}
   */
  @Test
  void testMethodThatReturnAHashMap() {
    // Arrange
    HashMapExample hashMapExample = new HashMapExample();

    HashMap input = new HashMap();
    input.put("PARAM1", "A");

    // Act and Assert
    assertEquals(2, hashMapExample.methodThatReturnAHashMap(input).size());
  }

  /**
   * Method under test: {@link HashMapExample#methodThatReturnAHashMap(HashMap)}
   */
  @Test
  void testMethodThatReturnAHashMap2() {
    // Arrange
    HashMapExample hashMapExample = new HashMapExample();

    HashMap input = new HashMap();
    input.put("PARAM1", "B");

    // Act and Assert
    assertEquals(2, hashMapExample.methodThatReturnAHashMap(input).size());
  }

  /**
   * Method under test: {@link HashMapExample#methodThatReturnAHashMap(HashMap)}
   */
  @Test
  void testMethodThatReturnAHashMap3() {
    // Arrange
    HashMapExample hashMapExample = new HashMapExample();

    HashMap input = new HashMap();
    input.put("PARAM1", 1);

    // Act and Assert
    assertEquals(1, hashMapExample.methodThatReturnAHashMap(input).size());
  }

  /**
   * Method under test:
   * {@link HashMapExample#executaGravarPrescricaoCase(HashMap)}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testExecutaGravarPrescricaoCase() {
    // TODO: Diffblue Cover was only able to create a partial test for this method:
    //   Reason: No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.lang.NullPointerException
    //       at org.example.HashMapExample.executaGravarPrescricaoCase(HashMapExample.java:31)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange
    HashMapExample hashMapExample = new HashMapExample();

    // Act
    hashMapExample.executaGravarPrescricaoCase(new HashMap());
  }

  /**
   * Method under test: {@link HashMapExample.WDAOInjector#consultaPadrao()}
   */
  @Test
  void testWDAOInjectorConsultaPadrao() {
    // Arrange, Act and Assert
    assertNull(HashMapExample.WDAOInjector.consultaPadrao());
  }
}
