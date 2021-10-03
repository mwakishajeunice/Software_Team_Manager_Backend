package com.jeunice.softwareteammanager.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projects {

    @Id
    private Long projectId;
    @NotBlank(message = "Project Title is Mandatory")
    private String projectTitle;
    @NotBlank(message = "Due Date is Mandatory")
    private Date dueDate;
    @NotBlank(message = "Project Status is Mandatory")
    private  String projectStatus;
}
