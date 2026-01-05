package com.aluracursos.screenmatch.util;

public interface DataConverter {

    <T> T getData(String json, Class<T> genClass);
}
