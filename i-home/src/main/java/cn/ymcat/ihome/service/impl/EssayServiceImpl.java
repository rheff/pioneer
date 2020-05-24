package cn.ymcat.ihome.service.impl;

import cn.ymcat.ihome.entity.Essay;
import cn.ymcat.ihome.mapper.EssayMapper;
import cn.ymcat.ihome.service.EssayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 86152
 * @since 2020-05-24
 */
@Service
public class EssayServiceImpl extends ServiceImpl<EssayMapper, Essay> implements EssayService {

}
