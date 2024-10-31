package com.eddy.wordquill.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Quill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String title;
    private String desc;
    private String author;
    private String timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "quill", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> quillImage;

    @OneToMany(mappedBy = "quill", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comments> comments;

    @OneToMany(mappedBy = "impressions", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Impressions> impressions;
}
