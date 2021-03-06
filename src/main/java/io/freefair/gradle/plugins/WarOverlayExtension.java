package io.freefair.gradle.plugins;

import lombok.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Lars Grefer
 */
@Data
public class WarOverlayExtension {

    private Set<String> excludes = new HashSet<>();

    public WarOverlayExtension() {
        excludes.add("WEB-INF/lib/*.jar");
        excludes.add("META-INF/maven/**");
        excludes.add("META-INF/MANIFEST.MF");
    }

    public void exclude(String pattern) {
        excludes.add(pattern);
    }

    public void exclude(String... pattern) {
        Collections.addAll(excludes, pattern);
    }
}
