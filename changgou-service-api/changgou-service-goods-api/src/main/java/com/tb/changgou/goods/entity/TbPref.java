package com.tb.changgou.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author tb
 * @since 2020-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TbPref对象", description="")
public class TbPref implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "分类ID")
    private Integer cateId;

    @ApiModelProperty(value = "消费金额")
    private Integer buyMoney;

    @ApiModelProperty(value = "优惠金额")
    private Integer preMoney;

    @ApiModelProperty(value = "活动开始日期")
    private Date startTime;

    @ApiModelProperty(value = "活动截至日期")
    private Date endTime;

    @ApiModelProperty(value = "类型,1:普通订单，2：限时活动")
    private String type;

    @ApiModelProperty(value = "状态,1:有效，0：无效")
    private String state;


}
