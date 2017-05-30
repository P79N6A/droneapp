package org.codehaus.jackson.jaxrs;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.codehaus.jackson.map.JsonMappingException;

@Provider
public class JsonMappingExceptionMapper
  implements ExceptionMapper<JsonMappingException>
{
  public Response toResponse(JsonMappingException paramJsonMappingException)
  {
    return Response.status(Response.Status.BAD_REQUEST).entity(paramJsonMappingException.getMessage()).type("text/plain").build();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/jaxrs/JsonMappingExceptionMapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */