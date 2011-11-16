package org.courtine.foobarqix

import org.junit.Test
import org.junit.Assert._

/**
 * Test de la classe principale de traitement.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
class RuleProcessorTest {

  /** Le processeur est testé pour la première règle (chiffre 3 et chaîne "Foo"). */
  val TEST_RULE_PROCESSOR = new RuleProcessor(3, "Foo")

  /** Liste de nombres non divisibles par 3. */
  val MODULO_NOT_OK = List.range(1, 1000).filter(_ % 3 != 0)

  /** Liste de nombre divisibles par 3. */
  val MODULO_OK = List.range(1, 1000).filter(_ % 3 == 0)

  /** Liste de nombres ne contenant pas le chiffre 3. */
  val CONTAINS_NOT_OK = List.range(1, 1000).filter(!_.toString.contains("3"))

  /** Liste de nombres contenant le chiffre 3. */
  val CONTAINS_OK = List.range(1, 1000).filter(_.toString.contains("3"))


}
