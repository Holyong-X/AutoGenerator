package com.holyong.autogenerator.controller;


import com.holyong.autogenerator.entity.ParkLot;
import com.holyong.autogenerator.service.ParkLotService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.holyong.autogenerator.config.ResponseResult;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.Map;
import java.util.Date;
import java.util.List;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 道闸控制器
 */
@Api(value = "道闸", tags = "道闸")
@RestController
@RequestMapping("park-lot")
public class ParkLotController {

    @Autowired
    private ParkLotService targetService;



    /**
    * 获取分页数据
    *
    * @return
    */
    @ApiOperation(value = "获取道闸分页列表", notes = "获取道闸分页列表")
    @GetMapping(value = "{page}/{limit}")
    public ResponseResult list( @ApiParam(name = "current", value = "当前页码", required = true)
            @PathVariable Long current,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @RequestBody(required = false) ParkLot entity) {
        Page<ParkLot> pageParam = new Page<>(current, limit);
        QueryWrapper<ParkLot> wrapper = new QueryWrapper<>();
        targetService.page(pageParam,wrapper);
        return ResponseResult.ok().data("items", pageParam.getRecords()).data("total", pageParam.getTotal());
    }


    /**
    * 查找所有记录数
    */
    @ApiOperation(value = "获取道闸的所有数据")
    @GetMapping("/findAll")
    public ResponseResult findAll() {
        List<ParkLot> list = targetService.list();
        if (list != null){
            return ResponseResult.ok().data("result",list);
        }
        return ResponseResult.error();
    }



    /**
     * 根据ID查找数据
     */
    @ApiOperation(value = "获取道闸详情", notes = "根据ID获取道闸详情")
    @GetMapping("/get")
    public ResponseResult get(@RequestParam("id") String id) {
        ParkLot entity = targetService.getById(id);
        if (entity != null){
            return ResponseResult.ok().data("result",entity);
        }
        return ResponseResult.error();
    }

    /**
     * 添加数据
     * @return
     */
    @ApiOperation(value = "新增道闸", notes = "新增道闸")
    @PostMapping("/add")
    public ResponseResult add(@RequestBody ParkLot entity) {
        boolean bool = targetService.save(entity);
        if (bool){
            return ResponseResult.ok();
        }
        return ResponseResult.error();
    }

    /**
     * 更新数据
     * @return
     */
    @ApiOperation(value = "编辑道闸", notes = "编辑道闸")
    @PostMapping("/update")
    public ResponseResult update(@RequestBody ParkLot entity) {
        boolean bool = targetService.updateById(entity);
        if (bool){
            return ResponseResult.ok();
        }
        return ResponseResult.error();
    }

    /**
    * 删除数据
    * @return
    */
    @ApiOperation(value = "移除道闸", notes = "移除道闸")
    @DeleteMapping("/remove")
    public ResponseResult remove(@RequestParam(value = "id") String id) {
        boolean bool = targetService.removeById(id);
        if (bool){
            return ResponseResult.ok();
        }
        return ResponseResult.error();
    }

    /**
    * 批量删除数据
    * @return
    */
    @ApiOperation(value = "批量移除道闸", notes = "批量移除道闸 多个参数用,号隔开")
    @ApiResponses({
            @ApiResponse(responseCode = "401",description = "请进行身份验证"),
            @ApiResponse(responseCode = "403",description = "拒绝执行"),
            @ApiResponse(responseCode = "404",description = "资源未找到"),
            @ApiResponse(responseCode = "500",description = "系统异常")
    })
    @PostMapping("/batch/remove")
    public ResponseResult batchRemove(@RequestParam(value = "ids") String ids) {
        boolean bool = targetService.removeByIds(Arrays.asList(ids.split(",")));
        if (bool){
            return ResponseResult.ok();
        }
        return ResponseResult.error();

    }
}
