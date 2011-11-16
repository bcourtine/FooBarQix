package org.courtine.foobarqix

/**
 * Une "règle" appliquée à un nombre, renvoyant une chaîne de caractères.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
abstract class Rule {

  /**
   * Application de la règle à un nombre.
   *
   * @param n Nombre auquel on applique la règle
   * @return Chaîne de caractères résultant de l'application de la règle. Si la règle ne s'applique
   *         pas au nombre passé en paramètre, la chaîne vide est renvoyée.
   */
  def apply(n: Int): String = ""

}
