package com.example.GameReviewz.images;

import com.example.GameReviewz.articles.GameArticles;
import javax.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "games_id")
    private Long gameId;

    @Column(name="tech_id")
    private Long techId;

    @Column(name = "path")
    private String path;

}
