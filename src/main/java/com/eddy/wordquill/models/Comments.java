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
public class Comments {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Long id;
    public String author;
    private String timestamp;
    private List<Impressions> impression;
    @ManyToOne
    @JoinColumn(name = "quill")
    private Quill quill;
}
