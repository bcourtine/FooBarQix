package org.courtine.foobarqix

/**
 * Classe chargée de la transformation principale du problème FooBarQix. Le traitement étant
 * similaire pour chacun des chiffres du problème, celui-ci est mutualisé dans cette classe
 * paramétrée.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
class RuleProcessor(
    val i: Int, // Chiffre testé (modulo et contenu).
    val replace: String // Chaîne de remplacement.
) {

  def processNumber(n: Int): String =
    null

  def modulo(n: Int): String =
    (n % i) match {
      case 0 => replace
      case _ => ""
    }

  def contains(n: Int): String =
    if (n.toString.contains(i.toString))
      replace
    else
      ""
}
