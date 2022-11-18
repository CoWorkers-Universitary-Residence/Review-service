package pe.edu.coworkers.reviewservice.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @NotNull(message = "Comment must not be empty")
    @NotBlank
    @Column(length = 150, nullable = false)
    private String comment;

    @NotNull
    @Column(nullable = false)
    private int score;

    @NotNull
    private Long publicationId;

    @NotNull
    private Long tenantId;
}