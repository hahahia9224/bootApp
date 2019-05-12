package com.example.bootapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

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


    /*public ApiProxyModel(String host, String key1, String key2) {
        this.host=host;
        this.key1=key1;
        this.key2=key2;
    }*/

}
