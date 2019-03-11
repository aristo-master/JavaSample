package net.solutions.aristo.jackson;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.solutions.aristo.logger.LogOutputLoggingSLf4Logger;

/**
 * @author AristoMaster
 *
 */
public class JsonTool {

   private static final Logger logger = LoggerFactory.getLogger(LogOutputLoggingSLf4Logger.class);

   /**
    * JSON文字列構築
    *
    * @param param1
    * @param param2
    * @param param3
    * @return
    * @throws JsonProcessingException
    */
   public static String buildJsonSample(String param1, String param2, String param3) throws JsonProcessingException {

      ParamDto param = new ParamDto();
      param.setParam1(param1);
      param.setParam2(param2);
      param.setParam3(param3);

      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(param);

      logger.trace("json={}", json);

      return json;

   }

   public static ParamDto jsonToClass(String jsonStr) throws JsonParseException, JsonMappingException, IOException {

      logger.trace("jsonStr={}", jsonStr);

      ObjectMapper mapper = new ObjectMapper();
      ParamDto param = mapper.readValue(jsonStr, ParamDto.class);

      logger.trace("ParamDto.param1={}", param.getParam1());
      logger.trace("ParamDto.param2={}", param.getParam2());
      logger.trace("ParamDto.param3={}", param.getParam3());

      return param;

   }

}
