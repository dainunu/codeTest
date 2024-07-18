package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveConsecutiveCharsTest {

    @Test
    void testRemoveConsecutive() {
        assertThat(RemoveConsecutiveChars.output("aabcccbbad")).isEqualTo("d");
    }
}
