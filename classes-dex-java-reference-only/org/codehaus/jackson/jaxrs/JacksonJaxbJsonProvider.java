package org.codehaus.jackson.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;
import org.codehaus.jackson.map.ObjectMapper;

@Consumes({"application/json", "text/json"})
@Produces({"application/json", "text/json"})
@Provider
public class JacksonJaxbJsonProvider
  extends JacksonJsonProvider
{
  public static final Annotations[] DEFAULT_ANNOTATIONS = { Annotations.JACKSON, Annotations.JAXB };
  
  public JacksonJaxbJsonProvider()
  {
    this(null, DEFAULT_ANNOTATIONS);
  }
  
  public JacksonJaxbJsonProvider(ObjectMapper paramObjectMapper, Annotations[] paramArrayOfAnnotations)
  {
    super(paramObjectMapper, paramArrayOfAnnotations);
  }
  
  public JacksonJaxbJsonProvider(Annotations... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/codehaus/jackson/jaxrs/JacksonJaxbJsonProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */