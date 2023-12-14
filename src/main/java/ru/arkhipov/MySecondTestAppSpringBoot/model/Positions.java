package ru.arkhipov.MySecondTestAppSpringBoot.model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV (2.2, false),
    HR (1.2, false),
    TL (2.6, false),
    MAN (2.8, true),
    CEO (3.0, true),
    DIR (3.2, true);

    private final double positionCoefficient;
    private final boolean isManager;

    Positions(double positionCoefficient, boolean isManager) {
        this.positionCoefficient = positionCoefficient;
        this.isManager = isManager;
    }
}
