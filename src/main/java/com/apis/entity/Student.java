
package com.apis.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity @Data
public class Student{
@Id @GeneratedValue
private Long id;
private String name;
private String rollNo;
private double marks;
private double assignment;
}
