package com.example.folders.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "files")
public class File implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String extension;

    @Column
    private int size;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;


    public File(String name, String extension, int size){
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File(){}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getExtension() { return extension; }

    public void setExtension(String extension) { this.extension = extension; }

    public int getSize() {return size; }

    public void setSize(int size) { this.size = size; }

    public Long getId() { return id; }

    public void setId(Long id) {this.id = id;}
}
