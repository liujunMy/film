package com.ischoolbar.programmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ischoolbar.programmer.entity.WebSite;

/**
 * 电影Repository接口
 * @author Administrator
 *
 */
public interface WebSiteRepository extends JpaRepository<WebSite, Integer>,JpaSpecificationExecutor<WebSite>{


}
