package com.shopping.developing.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class Goods {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private Integer code;

    @Column(nullable = false, unique = true)
    private String name_of_goods;

    @Column(nullable = false)
    private Long price;
}
