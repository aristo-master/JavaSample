package net.solutions.aristo.jackson;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author AristoMaster
 *
 */
public class JsonToolTest {

   @Test
   public void testBuildJsonSample() throws JsonProcessingException {

      JsonTool.buildJsonSample(
            " param1", "param2", null);

   }

   @Test
   public void testJsonToClass() throws JsonParseException, JsonMappingException, IOException {

      JsonTool.jsonToClass("{\"param1\":20, \"param2\":\"HOGE\"}");

   }

}
