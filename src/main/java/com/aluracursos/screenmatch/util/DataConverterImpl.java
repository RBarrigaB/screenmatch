package com.aluracursos.screenmatch.util;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverterImpl implements DataConverter{

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> genClass) {
        try {
            return objectMapper.readValue(json,genClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
