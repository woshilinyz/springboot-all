package com.lin.pojo;

import lombok.*;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 15:19:12
 **/
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Foo {
    private Long id;
    private String bar;
}
