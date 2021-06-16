package sabakikvidze.task4.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String country;

    @Lob
    private byte[] data;

    @ManyToMany
    private List <Category> categories;
}
