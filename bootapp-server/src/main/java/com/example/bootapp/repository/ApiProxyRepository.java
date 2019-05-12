package com.example.bootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bootapp.model.ApiProxyModel;

public interface ApiProxyRepository extends JpaRepository<ApiProxyModel, String>{}