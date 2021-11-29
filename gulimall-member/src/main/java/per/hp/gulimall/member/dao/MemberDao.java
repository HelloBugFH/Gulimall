package per.hp.gulimall.member.dao;

import per.hp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 20:17:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
