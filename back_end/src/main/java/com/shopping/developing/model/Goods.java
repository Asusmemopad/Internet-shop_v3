package com.shopping.developing.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Goods {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Integer code;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private Long price;
}
