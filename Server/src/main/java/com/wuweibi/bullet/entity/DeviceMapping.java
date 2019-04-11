package com.wuweibi.bullet.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *   设备映射
 * </p>
 *
 * @author marker
 * @since 2017-12-09
 */
@Data
@TableName("t_device_mapping")
public class DeviceMapping extends Model<DeviceMapping> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("device_id")
	private Long deviceId;
	private String domain;
	private Integer port;

	/**
	 * 远端端口
	 */
    @TableField("remote_port")
	private Integer remotePort;

	/**
	 * 服务器地址
	 * （null 为本机）
	 */
    @TableField("host")
	private String host;

	private Long userId;

	/** 协议 1 HTTP */
	private Integer protocol;

	/** 备注 */
	private String description;

    /**
     * 创建时间
     */
	private Date createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}