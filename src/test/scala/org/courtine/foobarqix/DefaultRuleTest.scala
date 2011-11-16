package org.courtine.foobarqix

import org.junit.Test
import org.junit.Assert._

/**
 * Test du comportement de la règle par défaut.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
class DefaultRuleTest {

  val chainedRules = new ChainedDefaultRule

  @Test
  def rule1() {
    assertEquals("Foo", chainedRules.apply(6))
    assertEquals("FooFoo", chainedRules.apply(3))
  }

  @Test
  def defaultRule() {
    assertEquals("1", chainedRules.apply(1))
    assertEquals("2", chainedRules.apply(2))
    assertEquals("4", chainedRules.apply(4))
    assertEquals("5", chainedRules.apply(5))
    assertEquals("7", chainedRules.apply(7))
    assertEquals("8", chainedRules.apply(8))
    assertEquals("10", chainedRules.apply(10))
  }
}

class ChainedDefaultRule extends Rule1 with DefaultRule
