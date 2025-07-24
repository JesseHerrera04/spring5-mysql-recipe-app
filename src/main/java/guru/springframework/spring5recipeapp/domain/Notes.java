package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Notes
 * POJO/Entity for Notes
 */

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

} // End Notes Class
