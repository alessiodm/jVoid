package io.jvoid.metadata.model;

import lombok.Data;

/**
 * A Java method metadata stored by JVoid.
 *
 */
@Data
public class JMethod implements JEntity<Long>, ChecksumAware {

    private Long id;
    private Long executionId;
    private String identifier;
    private String checksum;

}
