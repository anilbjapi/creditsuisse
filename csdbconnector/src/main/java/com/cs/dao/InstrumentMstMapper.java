package com.cs.dao;

import com.cs.entities.InstrumentMst;
import com.cs.entities.InstrumentMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstrumentMstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	long countByExample(InstrumentMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int deleteByExample(InstrumentMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int deleteByPrimaryKey(Integer instrumentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int insert(InstrumentMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int insertSelective(InstrumentMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	List<InstrumentMst> selectByExample(InstrumentMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	InstrumentMst selectByPrimaryKey(Integer instrumentId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int updateByExampleSelective(@Param("record") InstrumentMst record, @Param("example") InstrumentMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int updateByExample(@Param("record") InstrumentMst record, @Param("example") InstrumentMstExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int updateByPrimaryKeySelective(InstrumentMst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table instrument_mst
	 * @mbg.generated  Mon Jan 28 10:12:46 IST 2019
	 */
	int updateByPrimaryKey(InstrumentMst record);
}