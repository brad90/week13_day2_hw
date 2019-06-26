package com.example.folders.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "folders")
public class Folder implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @JsonIgnore
//    @OneToMany
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @JsonIgnore
//    @OneToMany
////    @JoinColumn(name = "file_id", nullable = false)
//    private List<File> file;

//    @OneToMany
//    @JoinTable(
//            joinColumns = {@JoinColumn(name = "folder_name", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)}
//    )
//    private List<User> user;



    public Folder(){ }

    public Folder(String name){
        this.name = name;
//        this.file = new ArrayList<File>();
//        this.user = user;
    }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
