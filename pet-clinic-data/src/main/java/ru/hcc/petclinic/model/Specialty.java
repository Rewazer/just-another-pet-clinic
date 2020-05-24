/*
 * Created by SS on 25/05/2020
 */

package ru.hcc.petclinic.model;

public class Specialty extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
