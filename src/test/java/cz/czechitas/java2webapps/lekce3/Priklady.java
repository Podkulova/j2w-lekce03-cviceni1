package cz.czechitas.java2webapps.lekce3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Části kódu, které by se mohly hodit.
 */
class Priklady {
  @Test
  void spocitejVek() {
    LocalDate datumNarozeni = LocalDate.of(1996, 12, 24);
    Period period = datumNarozeni.until(LocalDate.now());
    int vek = period.getYears();

    System.out.printf("Osobě s datem narození %1$te. %1$tm. %1$tY je dnes %2$d let.", datumNarozeni, vek).println();
  }
}
