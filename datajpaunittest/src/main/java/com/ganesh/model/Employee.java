package com.ganesh.model;

/*
 * @created: 28/02/2021 - 8:33 AM
 * @author: Ganesh
 */


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="employees")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Employee {

    @Id
    private Integer empId;
    private String empName;
    private Double empSal;
    private String empDept;

}
