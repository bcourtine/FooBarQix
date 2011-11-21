package org.courtine.foobarqix

/**
 * Objet principal de calcul du résultat du test.
 *
 * @author Benoît Courtine.
 * @since 2011-11-21.
 * @version 2011-11-21.
 */
object FooBarQix {

  def process(n: Int): String = {
    modulo3(n) + modulo5(n) + modulo7(n) + contains(n.toString.toList) match {
      case "" => n.toString
      case notEmpty => notEmpty
    }
  }

  def modulo3(n: Int): String =
    n % 3 match {
      case 0 => "Foo"
      case _ => ""
    }

  def modulo5(n: Int): String =
    n % 5 match {
      case 0 => "Bar"
      case _ => ""
    }

  def modulo7(n: Int): String =
    n % 7 match {
      case 0 => "Qix"
      case _ => ""
    }

  def contains(chars: List[Char]): String =
    chars match {
      case Nil => ""
      case '3' :: tail => "Foo" + contains(tail)
      case '5' :: tail => "Bar" + contains(tail)
      case '7' :: tail => "Qix" + contains(tail)
      case _ :: tail => contains(tail)
    }
}
