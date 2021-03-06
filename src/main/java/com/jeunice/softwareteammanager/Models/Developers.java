package com.jeunice.softwareteammanager.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Developers {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long developerId;
    @NotBlank(message = "FirstName is Mandatory")
    private String firstName;
    @NotBlank(message = "LastName is Mandatory")
    private String lastName;
    @NotBlank(message = "Email is Mandatory")
    private String email;
    @NotNull(message = "Phone Number is Mandatory")
    private Long phoneNo;
    @NotBlank(message = "Password is Mandatory")
    private String password;
    @NotNull(message = "Experience is Mandatory")
    private Integer experience;

    @ManyToOne( targetEntity=Roles.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private Roles roles;

}
