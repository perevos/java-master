package ru.bfu.ipmit.lab8.task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triple<X, Y, Z> {
    private X first;
    private Y second;
    private Z third;
}
