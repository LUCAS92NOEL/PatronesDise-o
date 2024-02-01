package org.lucas.noel.patrones.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lucas.noel.patrones.mapper.AppInfoMapper;
import org.lucas.noel.patrones.model.domain.AppInfo;
import org.springframework.stereotype.Service;

/**
 * a service class example, other services class should extends ServiceImpl like this
 *
 * @date 2019/12/13
 * @author netyjq@gmail.com
 */
@Service
public class AppInfoService extends ServiceImpl<AppInfoMapper, AppInfo> {


}
