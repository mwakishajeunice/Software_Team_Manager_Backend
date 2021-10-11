package com.jeunice.softwareteammanager.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;
    @NotBlank(message = "Name is Mandatory")
    private String roleName;
//
//    @OneToMany( targetEntity = Developers.class, cascade = CascadeType.ALL)
//    private List<Developers> developers;

}
