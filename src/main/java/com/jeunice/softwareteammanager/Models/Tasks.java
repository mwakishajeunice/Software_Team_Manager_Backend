package com.jeunice.softwareteammanager.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tasks {

    @Id
    private Long taskId;
    @NotBlank(message = "Task Title is Mandatory")
    private String taskTitle;
    @NotBlank(message = "Task Status is Mandatory")
    private String taskStatus;
    @NotBlank(message = "Due Date is Mandatory")
    private Date dueDate;

}
