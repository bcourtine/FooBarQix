package org.courtine.foobarqix

/**
 * Si le nombre est divisible par 3 ou contient 3, écrire “Foo” à la place de 3.
 *
 * @author Benoît Courtine.
 * @since 2011-11-16.
 * @version 2011-11-16.
 */
trait Rule1 extends Rule {

  val RULE_PROCESSOR_1 = new RuleProcessor(3, "Foo")

  override def apply(n: Int): String =
    super.apply(n) + RULE_PROCESSOR_1.processNumber(n)

}
