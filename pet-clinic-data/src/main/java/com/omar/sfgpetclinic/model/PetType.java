package com.omar.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;

}
