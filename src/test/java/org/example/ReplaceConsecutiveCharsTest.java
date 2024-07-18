package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceConsecutiveCharsTest {

    @Test
    void testReplaceConsecutive() {
        assertThat(ReplaceConsecutiveChars.output("abcccbad")).isEqualTo("d");
    }
}
