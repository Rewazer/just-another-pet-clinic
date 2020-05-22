/*
 * Created by SS on 22/05/2020
 */

package ru.hcc.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
