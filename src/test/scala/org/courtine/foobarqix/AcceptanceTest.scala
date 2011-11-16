package org.courtine.foobarqix

import org.junit.Test
import org.junit.Assert._

/**
 * Test d'acceptation reprenant les exemples de bon fonctionnement fournis sur le
 * <a href=http://www.code-story.net/2011/11/16/foobarqix.html>site du problème</a>.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
class AcceptanceTest {

  @Test
  def siteExamples() {
    assertEquals("1", acceptance.apply(1))
    assertEquals("2", acceptance.apply(2))
    assertEquals("FooFoo", acceptance.apply(3))
    assertEquals("4", acceptance.apply(4))
    assertEquals("BarBar", acceptance.apply(5))
    assertEquals("Foo", acceptance.apply(6))
    assertEquals("QixQix", acceptance.apply(7))
    assertEquals("8", acceptance.apply(8))
    assertEquals("Foo", acceptance.apply(9))
    assertEquals("Bar", acceptance.apply(10))
    // ...
    assertEquals("Foo", acceptance.apply(13))
    assertEquals("FooBarBar", acceptance.apply(15))
    assertEquals("FooFooFoo", acceptance.apply(33))
  }
}

/** Objet enchaînant les 3 règles et le comportement par défaut. */
object acceptance extends Rule1 with Rule2 with Rule3 with DefaultRule
