package com.github.sejoung.codetest.constant;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum Platform {

    WEB("01","PC로 접속"),
    MOBILE("02","모바일로 접속");

    private String code;
    private String desc;

    Platform(String code,String desc){
        this.code = code;
        this.desc = desc;
    }

    private static final Map<String, Platform> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString, e -> e));

    public static Optional<Platform> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
