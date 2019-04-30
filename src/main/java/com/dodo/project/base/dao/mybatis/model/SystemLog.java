package com.dodo.project.base.dao.mybatis.model;

import java.util.Date;

public class SystemLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.node
     *
     * @mbg.generated
     */
    private String node;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.action
     *
     * @mbg.generated
     */
    private String action;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.id
     *
     * @return the value of system_log.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.id
     *
     * @param id the value for system_log.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.ip
     *
     * @return the value of system_log.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.ip
     *
     * @param ip the value for system_log.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.node
     *
     * @return the value of system_log.node
     *
     * @mbg.generated
     */
    public String getNode() {
        return node;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.node
     *
     * @param node the value for system_log.node
     *
     * @mbg.generated
     */
    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.username
     *
     * @return the value of system_log.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.username
     *
     * @param username the value for system_log.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.action
     *
     * @return the value of system_log.action
     *
     * @mbg.generated
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.action
     *
     * @param action the value for system_log.action
     *
     * @mbg.generated
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.create_time
     *
     * @return the value of system_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.create_time
     *
     * @param createTime the value for system_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.content
     *
     * @return the value of system_log.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.content
     *
     * @param content the value for system_log.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}