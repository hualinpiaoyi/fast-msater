package io.whrc.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.whrc.modules.generator.entity.WhrcMeetingEntity;
import io.whrc.modules.generator.service.WhrcMeetingService;
import io.whrc.common.utils.PageUtils;
import io.whrc.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-05-23 17:12:10
 */
@RestController
@RequestMapping("generator/whrcmeeting")
public class WhrcMeetingController {
    @Autowired
    private WhrcMeetingService whrcMeetingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:whrcmeeting:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = whrcMeetingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:whrcmeeting:info")
    public R info(@PathVariable("id") Integer id){
		WhrcMeetingEntity whrcMeeting = whrcMeetingService.getById(id);

        return R.ok().put("whrcMeeting", whrcMeeting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:whrcmeeting:save")
    public R save(@RequestBody WhrcMeetingEntity whrcMeeting){
		whrcMeetingService.save(whrcMeeting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:whrcmeeting:update")
    public R update(@RequestBody WhrcMeetingEntity whrcMeeting){
		whrcMeetingService.updateById(whrcMeeting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:whrcmeeting:delete")
    public R delete(@RequestBody Integer[] ids){
		whrcMeetingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
