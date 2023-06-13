package com.company.myapplication.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.util.Map;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 13.06.2023
 */
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Language {

    UZ {

    };

    private final String name;

    private final String code;

    Language() {
        this.name = this.getName();
        this.code = this.name;
    }

    @JsonCreator
    @SuppressWarnings("unused")
    public static Language forValue(Map<String, String> value) {
        return Language.valueOf(value.get("code"));
    }
}
