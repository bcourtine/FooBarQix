package org.courtine.foobarqix

import org.junit.Test
import org.junit.Assert._

/**
 * Vérification du chaînage correct de plusieurs règles.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
class RuleChainTest {

  val chainedRules = new ChainedRules

  @Test
  def rule1Only() {
    assertEquals("", chainedRules.apply(1))
    assertEquals("Foo", chainedRules.apply(6))
    assertEquals("FooFoo", chainedRules.apply(3))
  }

  @Test
  def rule2Only() {
    assertEquals("", chainedRules.apply(1))
    assertEquals("Bar", chainedRules.apply(10))
    assertEquals("BarBar", chainedRules.apply(5))
  }

  @Test
  def rules1And2() {
    assertEquals("FooBar", chainedRules.apply(53)) // contient un 5 et un 3, mais n'est divisible ni par 5, ni par 3.
    assertEquals("FooBar", chainedRules.apply(60)) // divisible par 5 et par 3, mais ne contenant ni 5, ni 3.
    assertEquals("FooFooBar", chainedRules.apply(30)) // contient un 3, divisible par 3 et par 5.
    assertEquals("FooBarBar", chainedRules.apply(15)) // contient un 3 et un 5, divisible par 3.
    assertEquals("FooFooBarBar", chainedRules.apply(1530)) // contient un 3 et un 5, divisible par 3 et par 5.
  }
}

/**
 * Classe de test enchaînant les règles 1 et 2.
 */
class ChainedRules extends Rule1 with Rule2
