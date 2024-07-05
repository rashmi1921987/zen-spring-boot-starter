package com.zensar.entity;

import java.io.Serializable;

public interface PrimaryAuditEntity<I extends Serializable>{

    I getId();

    void setId(I id);

    String getReferenceId();

    void setReferenceId(String referenceId);
}
