/**
 *
 */
package net.solutions.aristo.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Owner
 *
 */
public class LogOutputLoggingLog {

   private static final Log log = LogFactory.getLog(LogOutputLoggingLog.class);

   /**
    * @param args
    */
   public static void main(String[] args) {

      LogOutputLoggingLog logOutputLoggingLog = new LogOutputLoggingLog();
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

      log.trace(String.format("trace:%s", "param"));
      log.debug(String.format("debug:%s", "param"));
      log.info(String.format("info:%s", "param"));
      log.warn(String.format("warn:%s", "param"));
      log.error(String.format("error:%s", "param"));

   }

}
