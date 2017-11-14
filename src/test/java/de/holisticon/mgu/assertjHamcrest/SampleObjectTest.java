package de.holisticon.mgu.assertjHamcrest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.nullValue;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SampleObjectTest {

    @Test
    public void isNull(){
        // Given
        // When
        SampleObject nullObject = null;

        // Then

        assertThat(nullObject, nullValue());
        Assertions.assertThat(nullObject).isNull();
    }

    @Test
    public void isEqualTo(){
        // Given
        // When
        SampleObject sampleObject = SampleObject.builder().aStringProperty("aString").anIntProperty(3).build();

        // Then

        assertThat(sampleObject, equalTo(sampleObject));
        Assertions.assertThat(sampleObject).isEqualTo(sampleObject);
    }

}