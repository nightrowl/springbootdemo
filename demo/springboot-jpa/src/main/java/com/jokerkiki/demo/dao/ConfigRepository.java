package com.jokerkiki.demo.dao;

import com.jokerkiki.demo.entity.DemoConfig;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConfigRepository  extends JpaRepository<DemoConfig, Long> {
}
