package com.company.myapplication.domain.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
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

    @Id
    @Column(name = "id")
    protected Long id;

    @Column(columnDefinition = "boolean default false")
    protected boolean deleted;

    @Column(name = "creator_id")
    protected Long creatorId;

    @Column(name = "created_date")
    protected LocalDateTime createdDate;

    @Column(name = "updater_id")
    protected Long updaterId;

    @Column(name = "updated_date")
    protected LocalDateTime updatedDate;
}
