package com.mapper.all;

import com.po.HouseImageAuditPO;
import com.po.HouseImageAuditPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HouseImageAuditPOMapper {
    int countByExample(HouseImageAuditPOExample example);

    int deleteByExample(HouseImageAuditPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseImageAuditPO record);

    int insertSelective(HouseImageAuditPO record);

    List<HouseImageAuditPO> selectByExampleWithRowbounds(HouseImageAuditPOExample example, RowBounds rowBounds);

    List<HouseImageAuditPO> selectByExample(HouseImageAuditPOExample example);

    HouseImageAuditPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HouseImageAuditPO record, @Param("example") HouseImageAuditPOExample example);

    int updateByExample(@Param("record") HouseImageAuditPO record, @Param("example") HouseImageAuditPOExample example);

    int updateByPrimaryKeySelective(HouseImageAuditPO record);

    int updateByPrimaryKey(HouseImageAuditPO record);
}