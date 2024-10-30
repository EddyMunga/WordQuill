package com.eddy.wordquill.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String occupation;
    private int followers;
    private int following;

    private List<Quill> quills;

    @OneToOne(mappedBy = "quill", cascade = CascadeType.ALL, orphanRemoval = true)
    private Image profilePic;
}
