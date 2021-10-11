package com.jeunice.softwareteammanager.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;
    @NotBlank(message = "Project Title is Mandatory")
    private String projectTitle;
//    @NotBlank(message = "Start Date is Mandatory")
    private Date startDate;
//    @NotBlank(message = "End Date is Mandatory")
    private Date endDate;
    @NotBlank(message = "Project Status is Mandatory")
    private  String projectStatus;
    @NotBlank(message = "Description is Mandatory")
    private String description;
    @NotBlank(message = "Languages is Mandatory")
    private String languages;

    @ManyToOne
    private Developers developers;
}
