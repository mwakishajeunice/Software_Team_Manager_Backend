package com.jeunice.softwareteammanager.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Developers {

  @Id
    private Long developerId;
    @NotBlank(message = "FirstName is Mandatory")
    private String firstName;
    @NotBlank(message = "LastName is Mandatory")
    private String lastName;
    @NotBlank(message = "Email is Mandatory")
    private String email;
    @NotBlank(message = "Role is Mandatory")
    private String role;
    @NotBlank(message = "Experience is Mandatory")
    private String experience;

}
