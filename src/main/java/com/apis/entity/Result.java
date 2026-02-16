
package com.apis.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity @Data
public class Result{
@Id @GeneratedValue
private Long id;
@OneToOne
private Student student;
private double pi;
private String grade;
private String risk;
private double stability;
private String trend;
}
