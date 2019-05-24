package io.whrc.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.whrc.common.utils.PageUtils;
import io.whrc.modules.generator.entity.WhrcMeetingEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-05-23 17:12:10
 */
public interface WhrcMeetingService extends IService<WhrcMeetingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

