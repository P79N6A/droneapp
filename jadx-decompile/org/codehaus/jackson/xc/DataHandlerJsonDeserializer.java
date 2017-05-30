package org.codehaus.jackson.xc;

import com.baidu.tts.loopj.RequestParams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.deser.StdScalarDeserializer;

public class DataHandlerJsonDeserializer extends StdScalarDeserializer<DataHandler> {
    public DataHandlerJsonDeserializer() {
        super(DataHandler.class);
    }

    public DataHandler deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        final byte[] binaryValue = jsonParser.getBinaryValue();
        return new DataHandler(new DataSource() {
            public String getContentType() {
                return RequestParams.APPLICATION_OCTET_STREAM;
            }

            public InputStream getInputStream() {
                return new ByteArrayInputStream(binaryValue);
            }

            public String getName() {
                return "json-binary-data";
            }

            public OutputStream getOutputStream() {
                throw new IOException();
            }
        });
    }
}
