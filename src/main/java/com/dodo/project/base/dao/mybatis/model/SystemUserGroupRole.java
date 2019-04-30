package com.dodo.project.base.dao.mybatis.model;

import java.util.Date;

public class SystemUserGroupRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user_group_role.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user_group_role.user_group_id
     *
     * @mbg.generated
     */
    private Integer userGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user_group_role.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user_group_role.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user_group_role.id
     *
     * @return the value of system_user_group_role.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user_group_role.id
     *
     * @param id the value for system_user_group_role.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user_group_role.user_group_id
     *
     * @return the value of system_user_group_role.user_group_id
     *
     * @mbg.generated
     */
    public Integer getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user_group_role.user_group_id
     *
     * @param userGroupId the value for system_user_group_role.user_group_id
     *
     * @mbg.generated
     */
    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user_group_role.role_id
     *
     * @return the value of system_user_group_role.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user_group_role.role_id
     *
     * @param roleId the value for system_user_group_role.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user_group_role.create_time
     *
     * @return the value of system_user_group_role.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user_group_role.create_time
     *
     * @param createTime the value for system_user_group_role.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}