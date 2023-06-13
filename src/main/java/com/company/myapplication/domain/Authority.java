package com.company.myapplication.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 13.06.2023
 */
@Entity
@Table(name = "authority")
public class Authority implements Serializable {

    static final Long serialVersionUID = 4L;


    @Id
    @Column(length = 50)
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Authority)) {
            return false;
        }
        return Objects.equals(name, ((Authority) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Authority{" +
                "name='" + name + '\'' +
                "}";
    }

}
