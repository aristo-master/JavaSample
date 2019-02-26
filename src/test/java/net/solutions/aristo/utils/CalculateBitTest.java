package net.solutions.aristo.utils;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateBitTest {

   @Test
   public void testCalculateLogicalAndZero_その１() {

      System.out.println(String.format("%s", 1));

      CalculateBit balculateBit = new CalculateBit();

      boolean actual = balculateBit.calculateLogicalAndZero(0, 0);

      assertThat(actual, is(false));

   }

   @Test
   public void testCalculateLogicalAndZero_その２() {

      CalculateBit balculateBit = new CalculateBit();

      boolean actual = balculateBit.calculateLogicalAndZero(1, 0);

      assertThat(actual, is(false));

   }

   @Test
   public void testCalculateLogicalAndZero_その３() {

      CalculateBit balculateBit = new CalculateBit();

      boolean actual = balculateBit.calculateLogicalAndZero(1, 1);

      assertThat(actual, is(true));

   }

   @Test
   public void testCalculateLogicalAndZero_その４() {

      CalculateBit balculateBit = new CalculateBit();

      boolean actual = balculateBit.calculateLogicalAndZero(1, 2);

      assertThat(actual, is(false));

   }

   @Test
   public void testCalculateLogicalAndZero_その５() {

      CalculateBit balculateBit = new CalculateBit();

      boolean actual = balculateBit.calculateLogicalAndZero(1, 3);

      assertThat(actual, is(true));

   }

   @Test
   public void testCalculateLogicalAndZero_その６() {

      CalculateBit balculateBit = new CalculateBit();

      boolean actual = balculateBit.calculateLogicalAndZero(3, 5);

      assertThat(actual, is(true));

   }

}
