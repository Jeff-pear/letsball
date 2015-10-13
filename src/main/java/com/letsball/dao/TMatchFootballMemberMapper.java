package com.letsball.dao;

import com.letsball.entity.TMatchFootballMember;
import com.letsball.entity.TMatchFootballMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMatchFootballMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int countByExample(TMatchFootballMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int deleteByExample(TMatchFootballMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int deleteByPrimaryKey(Integer mmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int insert(TMatchFootballMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int insertSelective(TMatchFootballMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    List<TMatchFootballMember> selectByExample(TMatchFootballMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    TMatchFootballMember selectByPrimaryKey(Integer mmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int updateByExampleSelective(@Param("record") TMatchFootballMember record, @Param("example") TMatchFootballMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int updateByExample(@Param("record") TMatchFootballMember record, @Param("example") TMatchFootballMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int updateByPrimaryKeySelective(TMatchFootballMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_match_football_member
     *
     * @mbggenerated Tue Oct 13 13:07:36 CST 2015
     */
    int updateByPrimaryKey(TMatchFootballMember record);
}