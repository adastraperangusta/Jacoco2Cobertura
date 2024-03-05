package org.shubzz.j2c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Jacoco2CoberturaTest {

    @Test
    void main() {
        // call main with -j src/test/resources/jee/middle/target/site/jacoco/jacoco.xml -s src/main/java/ -d coverage.xml
        String[] args = {"-j", "src/test/resources/jee/middle/target/site/jacoco/jacoco.xml", "-s", "src/main/java/", "-d", "target/coverage.xml"};
        Jacoco2Cobertura.main(args);
    }
}