package de.holisticon.mgu.assertjhamcrest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Builder
@Getter
@AllArgsConstructor
public class SampleObject {

    private String name;
    private int age;
    private boolean important;

    @Override
    public String toString() {
        return name;
    }
}
