package com.company.myapplication.domain.base;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 12.06.2023
 */
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    static final Long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    protected Long id;

    @Column(columnDefinition = "boolean default false")
    protected boolean deleted;

    public String getName() {
        return null;
    }
}
