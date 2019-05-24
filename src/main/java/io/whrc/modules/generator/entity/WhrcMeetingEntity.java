package io.whrc.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-05-23 17:12:10
 */
@Data
@TableName("whrc_meeting")
public class WhrcMeetingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * 会议室名称
	 */
	private String name;
	/**
	 * 会议内容
	 */
	private String content;
	/**
	 * 使用时间
	 */
	private Date useTime;
	/**
	 * 使用状态
	 */
	private String flag;
	/**
	 * 嘉宾
	 */
	private String guest;
	/**
	 * 会议记录人
	 */
	private String record;
	/**
	 * 会议主持人
	 */
	private String host;
	/**
	 * 创建信息时间
	 */
	private Date createTime;

}
