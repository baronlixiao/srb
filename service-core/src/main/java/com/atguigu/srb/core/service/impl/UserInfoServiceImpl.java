package com.atguigu.srb.core.service.impl;

import com.atguigu.srb.core.pojo.entity.UserInfo;
import com.atguigu.srb.core.mapper.UserInfoMapper;
import com.atguigu.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author lixiao
 * @since 2023-03-14
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
