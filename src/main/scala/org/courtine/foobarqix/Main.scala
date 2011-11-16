package org.courtine.foobarqix

/**
 * Programme principal. Celui-ci utilise le chaînage des traits en SCALA pour appliquer
 * les différentes règles de traitement du nombre, conformément aux exemples.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
object Main extends Rule1 with Rule2 with Rule3 with DefaultRule {

  def main(args: Array[String]) {
    List.range(1, 100).foreach(
      n => println(apply(n))
    )
  }
}
