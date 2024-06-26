package com.github.sachithariyathilaka.resource;

/**
 * Header resource class;
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
public class Header {
    private String name;
    private String value;

    public Header() {
    }

    public Header(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
