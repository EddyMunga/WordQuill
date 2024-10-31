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
public class Impressions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean Like;
    private boolean dislike;

    @ManyToOne
    @JoinColumn(name = "quill")
    private Quill quill;

    @ManyToOne
    @JoinColumn(name = "comment_id", nullable = false)
    private Comments comments;

}
