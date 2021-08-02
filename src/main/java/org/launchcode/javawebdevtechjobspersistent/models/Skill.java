package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(min = 5, max = 250, message="Description too long")
    private String description;

    @ManyToMany(mappedBy = "skills")
   private List<Job> jobs = new ArrayList<>();

    public Skill (String description){
        this.description = description;
    }

    public Skill () {}

    public List<Job> getJobs(){
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
