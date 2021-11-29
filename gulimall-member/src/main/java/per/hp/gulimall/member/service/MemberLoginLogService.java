package per.hp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.hp.common.utils.PageUtils;
import per.hp.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 20:17:15
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

