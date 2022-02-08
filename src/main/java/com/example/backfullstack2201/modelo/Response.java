package com.example.backfullstack2201.modelo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

@Data

//te aplica el patron builder
@SuperBuilder
//incluidir los que no esten e null
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;
    //es un mapoa con los datos de respuestas, lo de arriba son metadatos
    protected Map<?, ?> data;
}
