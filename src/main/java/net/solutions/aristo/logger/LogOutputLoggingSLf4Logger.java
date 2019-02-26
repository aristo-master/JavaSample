/**
 *
 */
package net.solutions.aristo.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Owner
 *
 */
public class LogOutputLoggingSLf4Logger {

   private static final Logger log = LoggerFactory.getLogger(LogOutputLoggingSLf4Logger.class);

   /**
    * @param args
    */
   public static void main(String[] args) {

      LogOutputLoggingSLf4Logger logOutputLoggingLog = new LogOutputLoggingSLf4Logger();
      logOutputLoggingLog.outputNomal();
      logOutputLoggingLog.outputRoop();
      logOutputLoggingLog.outputParam();

   }

   public void outputNomal() {

      log.trace("trace");
      log.debug("debug");
      log.info("info");
      log.warn("warn");
      log.error("error");

   }

   public void outputRoop() {

      for (int i = 0; i < 100; i++) {

         log.trace("trace");
         log.debug("debug");
         log.info("info");
         log.warn("warn");
         log.error("error");

      }
   }

   public void outputParam() {

      log.trace("trace:{}", "param");
      log.debug("debug:{}", "param");
      log.info("info:{}", "param");
      log.warn("warn:{}", "param");
      log.error("error:{}", "param");

   }

}
