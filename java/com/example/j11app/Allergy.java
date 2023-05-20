package com.example.j11app;
public class Allergy {
    private String name;
    private String severity;

    public Allergy(String name, String severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public String getSeverity() {
        return severity;
    }
}
