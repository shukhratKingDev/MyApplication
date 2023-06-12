package com.company.myapplication.domain;

import com.company.myapplication.domain.base.AbstractAuditingEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Powered by: Shuxratjon Rayimjonov
 * Date: 12.06.2023
 */

@Getter
@Setter
@Entity
@Table(name = "users")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User extends AbstractAuditingEntity implements Serializable {

    static final Long serialVersionUID = 3L;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "patronymic")
    String patronymic;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;
}
