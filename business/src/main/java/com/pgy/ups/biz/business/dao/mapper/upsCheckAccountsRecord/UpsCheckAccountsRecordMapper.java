package com.pgy.ups.biz.business.dao.mapper.upsCheckAccountsRecord;


import com.pgy.ups.biz.facade.model.upsCheckAccountsRecord.UpsCheckAccountsRecord;

public interface UpsCheckAccountsRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    int insert(UpsCheckAccountsRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    int insertSelective(UpsCheckAccountsRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    UpsCheckAccountsRecord selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    int updateByPrimaryKeySelective(UpsCheckAccountsRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ups_check accounts_record
     *
     * @mbggenerated Wed Oct 24 10:32:59 CST 2018
     */
    int updateByPrimaryKey(UpsCheckAccountsRecord record);
}