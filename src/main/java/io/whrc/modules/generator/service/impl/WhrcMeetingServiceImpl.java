package io.whrc.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.whrc.common.utils.PageUtils;
import io.whrc.common.utils.Query;

import io.whrc.modules.generator.dao.WhrcMeetingDao;
import io.whrc.modules.generator.entity.WhrcMeetingEntity;
import io.whrc.modules.generator.service.WhrcMeetingService;


@Service("whrcMeetingService")
public class WhrcMeetingServiceImpl extends ServiceImpl<WhrcMeetingDao, WhrcMeetingEntity> implements WhrcMeetingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WhrcMeetingEntity> page = this.page(
                new Query<WhrcMeetingEntity>().getPage(params),
                new QueryWrapper<WhrcMeetingEntity>()
        );

        return new PageUtils(page);
    }

}