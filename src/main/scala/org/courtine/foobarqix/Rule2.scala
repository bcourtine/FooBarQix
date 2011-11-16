package org.courtine.foobarqix

/**
 * Si le nombre est divisible par 5 ou contient 5, écrire “Bar” à la place de 5.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
trait Rule2 extends Rule {

  val RULE_PROCESSOR_2 = new RuleProcessor(5, "Bar")

  override def apply(n: Int): String =
    super.apply(n) + RULE_PROCESSOR_2.processNumber(n)

}
