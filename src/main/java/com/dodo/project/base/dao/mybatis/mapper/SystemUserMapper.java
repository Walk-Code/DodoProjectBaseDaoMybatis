package com.dodo.project.base.dao.mybatis.mapper;

import com.dodo.project.base.dao.mybatis.model.SystemUser;

public interface SystemUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    int insert(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    int insertSelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    SystemUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemUser record);
}