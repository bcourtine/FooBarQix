package org.courtine.foobarqix

/**
 * Si le nombre est divisible par 7 ou contient 7, écrire “Qix” à la place de 7.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
trait Rule3 extends Rule {

  val RULE_PROCESSOR_3 = new RuleProcessor(7, "Qix")

  override def apply(n: Int): String =
    super.apply(n) + RULE_PROCESSOR_3.processNumber(n)

}
