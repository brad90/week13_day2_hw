package com.example.folders.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {

    @Column(name = "name")
    private String name;

//    @JsonIgnore
//    @OneToMany
//    @JoinColumn(name = "folder_id", nullable = false)
//    private List<Folder> folder;

//    @OneToMany
//    @JoinTable(
//            joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "folder_name", nullable = false, updatable = false)}
//    )
//    private List<Folder> folder;


    public User(){};

    public User(String name){
        this.name = name;
//        this.folder = new ArrayList<Folder>();
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
