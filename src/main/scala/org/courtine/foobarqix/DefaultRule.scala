package org.courtine.foobarqix

/**
 * Si aucune des règles précédentes ne s'est appliquée, le nombre est affiché.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
trait DefaultRule extends Rule {

  override def apply(n: Int): String =
    super.apply(n) match {
      case "" => n.toString
      case o => o
    }
}
