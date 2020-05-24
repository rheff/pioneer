package cn.ymcat.ihome.controller;


import cn.ymcat.ihome.domain.requst.essay.EssayRequest;
import cn.ymcat.ihome.domain.response.EssayResponse;
import cn.ymcat.ihome.domain.response.EssayResponseBody;
import cn.ymcat.ihome.domain.response.BaseResponse;
import cn.ymcat.ihome.entity.Essay;
import cn.ymcat.ihome.service.EssayService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 86152
 * @since 2020-05-24
 */
@RestController
@RequestMapping("/essay")
public class EssayController {

    @Autowired
    private EssayService essayService;

    /**
     * 新增文章
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("新增文章")
    public BaseResponse create(@Validated({EssayRequest.CreateGroup.class}) @RequestBody EssayRequest request, BindingResult result) {
//        ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
//                .configure()
//                .addProperty( "hibernate.validator.fail_fast", "true" )
//                .buildValidatorFactory();
//        Validator validator = validatorFactory.getValidator();
//        validator.validate(EssayRequest.CreateGroup.class);
        // 插入新记录
        Essay essay = JSON.parseObject(JSON.toJSONString(request), Essay.class);
        BeanUtils.copyProperties(request, essay);
        essay.setId(null);
        essay.setServiceId("ES"+System.currentTimeMillis());
        essay.setCreateDate(LocalDateTime.now());
        essay.setModifyDate(LocalDateTime.now());
        essayService.save(essay);
        return new BaseResponse();
    }

    /**
     * 首页获取随机列表
     * @return
     */
    @RequestMapping(value = "/randomlist",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("首页获取随机列表")
    public BaseResponse<EssayResponse> startSpringBoot(@Validated({EssayRequest.ListGroup.class})@RequestBody EssayRequest request, BindingResult result) {
        QueryWrapper<Essay> wrapper = new QueryWrapper<>();
        if (request.getId()!= null) {
            wrapper.ne("id", request.getId());
        }
        IPage<Essay> page = essayService.page(new Page<>(Integer.parseInt(request.getPageNum()), Integer.parseInt(request.getPageSize())), wrapper);
        List<Essay> records = page.getRecords();
        List<EssayResponseBody> recordRsp = JSON.parseArray(JSON.toJSONString(records), EssayResponseBody.class);
        EssayResponse response = new EssayResponse();
        response.setRecords(recordRsp);
        return new BaseResponse().buildBody(response);
    }


}
