package dev.suvera.scim2.schema.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateDeserializer extends StdDeserializer<Date> {

    private static final SimpleDateFormat withMillis = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
    private static final SimpleDateFormat withoutMillis = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");

    public DateDeserializer() {
        this(null);
    }

    public DateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String dateString = p.getText();
        if (dateString.isEmpty()) {
            //handle empty strings however you want,
            //but I am setting the Date objects null
            return null;
        }

        try {
            return withMillis.parse(dateString);
        } catch (ParseException e) {
            try {
                return withoutMillis.parse(dateString);
            } catch (ParseException e1) {
                throw new RuntimeException("Unable to parse date", e1);
            }
        }
    }
}
