package com.sg.superherosightings.models;

import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Organization {
    
    private int id;
    
    @NotBlank(message = "Name must not be empty.")
    @Size(max = 50, message="Name must be less than 50 characters.")
    private String name;
    
    private boolean isHero;
    
    @Size(max = 255, message="Description must be less than 255 characters.")
    private String description;
    
    @Size(max = 255, message="Address must be less than 255 characters.")
    private String address;
    
    @Size(max = 255, message="Contact must be less than 255 characters.")
    private String contact;
    
    private List<Hero> members;

    @Override
    public String toString() {
        return "Organization{" + "id=" + id + ", name=" + name + ", isHero=" + isHero + ", description=" + description + ", address=" + address + ", contact=" + contact + ", members=" + members + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (this.isHero ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.address);
        hash = 53 * hash + Objects.hashCode(this.contact);
        hash = 53 * hash + Objects.hashCode(this.members);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Organization other = (Organization) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.isHero != other.isHero) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.members, other.members)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsHero() {
        return isHero;
    }

    public void setIsHero(boolean isHero) {
        this.isHero = isHero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Hero> getMembers() {
        return members;
    }

    public void setMembers(List<Hero> members) {
        this.members = members;
    }
    
}
