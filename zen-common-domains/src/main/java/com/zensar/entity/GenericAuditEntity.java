package com.zensar.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public interface GenericAuditEntity extends Serializable,ServiceRequest, ServiceResponse {

    LocalDateTime getCreatedDate();

    void setCreatedDate(LocalDateTime createdDate);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getUpdatedDate();

    void setUpdatedDate(LocalDateTime updatedDate);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Integer getVersion();

    void setVersion(Integer version);



}
