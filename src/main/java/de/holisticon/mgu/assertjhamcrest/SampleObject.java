package de.holisticon.mgu.assertjhamcrest;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SampleObject {

    private String name;
    private int age;
}