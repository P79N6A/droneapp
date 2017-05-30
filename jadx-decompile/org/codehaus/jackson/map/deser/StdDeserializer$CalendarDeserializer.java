package org.codehaus.jackson.map.deser;

import java.util.Calendar;
import java.util.Date;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@JacksonStdImpl
public class StdDeserializer$CalendarDeserializer extends StdScalarDeserializer<Calendar> {
    Class<? extends Calendar> _calendarClass;

    public StdDeserializer$CalendarDeserializer() {
        this(null);
    }

    public StdDeserializer$CalendarDeserializer(Class<? extends Calendar> cls) {
        super(Calendar.class);
        this._calendarClass = cls;
    }

    public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Date _parseDate = _parseDate(jsonParser, deserializationContext);
        if (_parseDate == null) {
            return null;
        }
        if (this._calendarClass == null) {
            return deserializationContext.constructCalendar(_parseDate);
        }
        try {
            Calendar calendar = (Calendar) this._calendarClass.newInstance();
            calendar.setTimeInMillis(_parseDate.getTime());
            return calendar;
        } catch (Throwable e) {
            throw deserializationContext.instantiationException(this._calendarClass, e);
        }
    }
}
