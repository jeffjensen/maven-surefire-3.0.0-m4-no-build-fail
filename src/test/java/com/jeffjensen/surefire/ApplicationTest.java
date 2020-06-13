package com.jeffjensen.surefire;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * <p>
 * Run with "@SpringBootTest" and the build correctly fails.
 * </p>
 * <p>
 * Run with "@ExtendWith(SpringExtension.class)" and "@WebMvcTest" and the
 * build does not fail.
 * </p>
 */
// @SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest
class ApplicationTest {
    @Test
    void contextLoads() {
    }
}
