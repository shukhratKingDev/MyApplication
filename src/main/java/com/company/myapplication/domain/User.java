package com.company.myapplication.domain;

import com.company.myapplication.domain.base.AbstractAuditingEntity;
import com.company.myapplication.enums.Language;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @Column(name = "tin")
    String tin;

    @Column(name = "pinfl")
    String pinfl;

    @Column(name = "phone")
    String phone;

    @Column(name = "secret_key")
    String secretKey;

    @Column(name = "language")
    Language language = Language.UZ;

    @ManyToMany
    @JoinTable(name = "user_athority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")}
    )
    @BatchSize(size = 10)
    Set<Authority> authorities = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        return id != null && id.equals(((User) o).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
