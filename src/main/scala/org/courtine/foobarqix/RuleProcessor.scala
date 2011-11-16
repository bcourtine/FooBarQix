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

  /**
   * Application de l'ensemble des deux sous-règles à un nombre. Si les deux règles s'appliquent
   * en même temps, leurs résultats sont concaténés.
   *
   * @param n Nombre à traiter
   * @return Chaîne correspondant à l'application des deux sous-règles (modulo et contenu). Si le
   *         nombre ne valide aucune de ces règles, la chaîne vide est renvoyée.
   */
  def processNumber(n: Int): String =
    modulo(n) + contains(n)

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
