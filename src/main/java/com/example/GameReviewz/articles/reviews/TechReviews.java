package com.example.GameReviewz.articles.reviews;

import javax.persistence.*;
import lombok.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "tech_reviews")
public class TechReviews {
    public TechReviews(String comment, Integer parentId, Long techId, Long userId, String createdAt, int likes){
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date currdate = new Date();

        this.comment = comment;
        this.parentId = parentId;
        this.techId = techId;
        this.userId = userId;
        this.createdAt = format.format(currdate);
        this.likes = 0;

    }
    public TechReviews(String comment, Integer parentId, Long techId, Long userId, String username){
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date currdate = new Date();

        this.comment = comment;
        this.parentId = parentId;
        this.techId = techId;
        this.userId = userId;
        this.username = username;
        this.createdAt = format.format(currdate);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String comment;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "tech_id")
    private Long techId;

    @Column(columnDefinition = "integer default 0")
    private int likes;

    @Column
    private String username;
}
