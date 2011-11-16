package org.courtine.foobarqix

import org.junit.Test
import org.junit.Assert._

/**
 * Test de la classe principale de traitement.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
class RuleProcessorTest {

  /** Le processeur est testé pour la première règle (chiffre 3 et chaîne "Foo"). */
  val TEST_RULE_PROCESSOR = new RuleProcessor(3, "Foo")

  /** Liste de nombres non divisibles par 3. */
  val MODULO_NOT_OK = List.range(1, 1000).filter(_ % 3 != 0)

  /** Liste de nombre divisibles par 3. */
  val MODULO_OK = List.range(1, 1000).filter(_ % 3 == 0)

  /** Liste de nombres ne contenant pas le chiffre 3. */
  val CONTAINS_NOT_OK = List.range(1, 1000).filter(!_.toString.contains("3"))

  /** Liste de nombres contenant le chiffre 3 une unique fois. */
  val CONTAINS_OK = List.range(1, 1000).filter(_.toString.count(_ == '3') == 1)

  /** Liste de valeurs ne validant aucune des deux parties de la règle. */
  val BOTH_NOT_OK = MODULO_NOT_OK.intersect(CONTAINS_NOT_OK)

  /** Liste de valeurs validant uniquement la règle "contains". */
  val CONTAINS_ONLY_OK = CONTAINS_OK.intersect(MODULO_NOT_OK)

  /** Liste de valeurs validant uniquement la règle "module". */
  val MODULO_ONLY_OK = MODULO_OK.intersect(CONTAINS_NOT_OK)

  /** Liste de valeurs validant les deux règles. */
  val BOTH_OK = CONTAINS_OK.intersect(MODULO_OK)

  @Test
  def moduloNotOk() {
    MODULO_NOT_OK.foreach(
      n => assertEquals("", TEST_RULE_PROCESSOR.modulo(n))
    )
  }

  @Test
  def moduloOk() {
    MODULO_OK.foreach(
      n => assertEquals("Foo", TEST_RULE_PROCESSOR.modulo(n))
    )
  }

  @Test
  def containsNotOk() {
    CONTAINS_NOT_OK.foreach(
      n => assertEquals("", TEST_RULE_PROCESSOR.contains(n))
    )
  }

  @Test
  def containsOk() {
    CONTAINS_OK.foreach(
      n => assertEquals("Foo", TEST_RULE_PROCESSOR.contains(n))
    )
  }

  @Test
  def ruleNotOk() {
    BOTH_NOT_OK.foreach(
      n => assertEquals("", TEST_RULE_PROCESSOR.processNumber(n))
    )
  }

  @Test
  def ruleContainsOnlyOk() {
    CONTAINS_ONLY_OK.foreach(
      n => assertEquals("Foo", TEST_RULE_PROCESSOR.processNumber(n))
    )
  }

  @Test
  def ruleModuloOnlyOk() {
    MODULO_ONLY_OK.foreach(
      n => assertEquals("Foo", TEST_RULE_PROCESSOR.processNumber(n))
    )
  }

  @Test
  def bothModuloAndContainsOk() {
    BOTH_OK.foreach(
      n => assertEquals("FooFoo", TEST_RULE_PROCESSOR.processNumber(n))
    )
  }

  @Test
  def containsMultiple() {
    assertEquals("Foo", TEST_RULE_PROCESSOR.processNumber(31))
    assertEquals("FooFoo", TEST_RULE_PROCESSOR.processNumber(331))
    assertEquals("FooFoo", TEST_RULE_PROCESSOR.processNumber(3731))
    assertEquals("FooFooFoo", TEST_RULE_PROCESSOR.processNumber(3331))
  }

  @Test
  def containsMultipleAndDivisible() {
    assertEquals("FooFoo", TEST_RULE_PROCESSOR.processNumber(3))
    assertEquals("FooFooFoo", TEST_RULE_PROCESSOR.processNumber(33))
    assertEquals("FooFooFoo", TEST_RULE_PROCESSOR.processNumber(3531))
    assertEquals("FooFooFooFoo", TEST_RULE_PROCESSOR.processNumber(333))
  }
}
