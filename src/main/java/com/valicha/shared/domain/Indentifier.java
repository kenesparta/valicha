package com.valicha.shared.domain;

public abstract  class Indentifier {
    final protected Long id;

    public Indentifier(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
