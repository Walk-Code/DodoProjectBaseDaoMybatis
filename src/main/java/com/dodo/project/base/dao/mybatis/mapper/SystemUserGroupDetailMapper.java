package com.dodo.project.base.dao.mybatis.mapper;

import com.dodo.project.base.dao.mybatis.model.SystemUserGroupDetail;

public interface SystemUserGroupDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_group_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_group_detail
     *
     * @mbg.generated
     */
    int insert(SystemUserGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_group_detail
     *
     * @mbg.generated
     */
    int insertSelective(SystemUserGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_group_detail
     *
     * @mbg.generated
     */
    SystemUserGroupDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_group_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemUserGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_group_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemUserGroupDetail record);
}