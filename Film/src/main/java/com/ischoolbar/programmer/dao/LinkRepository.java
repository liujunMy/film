package com.ischoolbar.programmer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ischoolbar.programmer.entity.Link;

/**
 * 友情链接Repository接口
 * @author Administrator
 *
 */
public interface LinkRepository extends JpaRepository<Link, Integer>{

}
