package com.example.testjacksonannotation;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TestDto(@JsonProperty("n") String name) {
}
