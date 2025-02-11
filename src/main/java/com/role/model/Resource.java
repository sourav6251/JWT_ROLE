package com.role.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Resource {

    @Id
    private String resourceId;
    private String resource;

    @OneToOne
    @JoinColumn(name="owner")
    private User owner;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Resource(String resourceId, String resource, User owner) {
        this.resourceId = resourceId;
        this.resource = resource;
        this.owner = owner;
    }

    public Resource() {
    }
}
