package com.dodo.project.base.dao.mybatis.mapper;

import com.dodo.project.base.dao.mybatis.model.SystemMenu;

public interface SystemMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_menu
     *
     * @mbg.generated
     */
    int insert(SystemMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_menu
     *
     * @mbg.generated
     */
    int insertSelective(SystemMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_menu
     *
     * @mbg.generated
     */
    SystemMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemMenu record);
}