package com.example.bootapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
class ApiProxyModelKeys implements Serializable{
    private String host;
    private String key1;
}

@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ApiProxyModelKeys.class)
public class ApiProxyModel {

    @Id
    @Column(length = 128, nullable = false)
    private String host;
    @Id
    @Column(length = 64, nullable = false)
    private String key1;
    @Column(length = 128, nullable = false)
    private String key2;

}


@Entity
@Table(indexes = {@Index(columnList="api,lastUpdateTime")})
@NoArgsConstructor
@AllArgsConstructor
class ApiProxyRequestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Idx;

    @Column(length = 128, nullable = false)
    private String host;
    @Column(length = 64, nullable = false)
    private String key1;
    @Column(length = 128, nullable = false)
    private String api;
    @Column(nullable = false)
    private Date lastUpdateTime;

}