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
    assertEquals("1", FooBarQix.process(1))
    assertEquals("2", FooBarQix.process(2))
    assertEquals("FooFoo", FooBarQix.process(3))
    assertEquals("4", FooBarQix.process(4))
    assertEquals("BarBar", FooBarQix.process(5))
    assertEquals("Foo", FooBarQix.process(6))
    assertEquals("QixQix", FooBarQix.process(7))
    assertEquals("8", FooBarQix.process(8))
    assertEquals("Foo", FooBarQix.process(9))
    assertEquals("Bar", FooBarQix.process(10))
    // ...
    assertEquals("Foo", FooBarQix.process(13))
    assertEquals("FooBarBar", FooBarQix.process(15))
    assertEquals("FooQix", FooBarQix.process(21))
    assertEquals("FooFooFoo", FooBarQix.process(33))
    assertEquals("FooBar", FooBarQix.process(51))
    assertEquals("BarFoo", FooBarQix.process(53))
  }
}
