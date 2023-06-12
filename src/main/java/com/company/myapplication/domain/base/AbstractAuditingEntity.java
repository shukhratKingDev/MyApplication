package com.company.myapplication.domain.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 12.06.2023
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractAuditingEntity extends BaseEntity implements Serializable {

    static final Long serialVersionUID = 2L;

    @Column(name = "creator_id")
    Long creatorId;

    @Column(name = "created_date")
    LocalDateTime createdDate;

    @Column(name = "updater_id")
    Long updaterId;

    @Column(name = "updated_date")
    LocalDateTime updatedDate;
}
