package com.omar.sfgpetclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
}
