package com.lin.pojo;

import lombok.*;

import javax.persistence.*;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 09:34:43
 **/
@Entity
@Table(name = "tb_user")
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private int age;

    private String address;
}