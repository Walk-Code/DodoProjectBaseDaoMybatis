package com.dodo.project.base.dao.mybatis.mapper;

import com.dodo.project.base.dao.mybatis.model.SystemSubscription;

public interface SystemSubscriptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_subscription
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_subscription
     *
     * @mbg.generated
     */
    int insert(SystemSubscription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_subscription
     *
     * @mbg.generated
     */
    int insertSelective(SystemSubscription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_subscription
     *
     * @mbg.generated
     */
    SystemSubscription selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_subscription
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemSubscription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_subscription
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemSubscription record);
}