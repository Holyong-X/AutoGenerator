package com.holyong.autogenerator.config;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName MybatisPlusGenerator
 * @Description TODO
 * @Author wangpeng
 * @Date 2022/3/29 17:25
 */
public class MybatisPlusGenerator {
    static  String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        FastAutoGenerator.create(
                new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/element_modeling","root","Root@root123"))
                // 全局配置
                .globalConfig((builder) -> builder
                        // 交互式作用名称
                         .author("holyong")
//                        .fileOverride() // 覆盖已生成文件
                        // 开启swagger模式
                        .enableSwagger()
                        // 输出位置
                        .outputDir(projectPath + "/src/main/java")
                        .disableOpenDir() // 生成后禁止打开所生成的系统目录
                )
                // 包配置
                //scanner.apply("请输入包名？")
                .packageConfig((builder) -> builder.parent("com.holyong.autogenerator")
                        .service("service")
                        .serviceImpl("service.Impl")
                        .mapper("mapper")
                        .xml("mapper.xml")
                        .entity("entity")
                )

                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude()
                        .controllerBuilder().enableRestStyle().enableHyphenStyle().formatFileName("%sController")
                        .entityBuilder().enableLombok() // 开启lombok
                        .enableChainModel() // 链式
                        .enableRemoveIsPrefix() // 开启boolean类型字段移除is前缀
                        .enableTableFieldAnnotation() //开启生成实体时生成的字段注解
                        .versionColumnName("version") // 乐观锁数据库字段
                        .versionPropertyName("version") // 乐观锁实体类名称
                        .logicDeleteColumnName("is_deleted") // 逻辑删除数据库中字段名
                        .logicDeletePropertyName("deleted") // 逻辑删除实体类中的字段名
                        .naming(NamingStrategy.underline_to_camel) // 表名 下划线 -》 驼峰命名
//                        .columnNaming(NamingStrategy.underline_to_camel) // 字段名 下划线 -》 驼峰命名
                        .idType(IdType.ASSIGN_ID) // 主键生成策略 雪花算法生成id
                        .formatFileName("%s") // Entity 文件名称
                        .addTableFills(new Column("create_time", FieldFill.INSERT)) // 表字段填充
                        .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE)) // 表字段填充
                        .enableColumnConstant()
                        .enableActiveRecord()

                        // Service 策略配置
                        .serviceBuilder()
                        .formatServiceFileName("%sService") // Service 文件名称
                        .formatServiceImplFileName("%sServiceImpl") // ServiceImpl 文件名称

                        // Mapper 策略配置
                        .mapperBuilder()
                        .enableMapperAnnotation() // 开启@Mapper
                        .enableBaseColumnList() // 启用 columnList (通用查询结果列)
                        .enableBaseResultMap() // 启动resultMap
                        .formatMapperFileName("%sMapper") // Mapper 文件名称
                        .formatXmlFileName("%sMapper") // Xml 文件名称
                        .build()
                )
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
//                .templateEngine(new BeetlTemplateEngine())
                .templateConfig((builder) -> getTemplateConfig())
                .execute();
    }



    public static TemplateConfig getTemplateConfig () {
        TemplateConfig templateConfig = new TemplateConfig.Builder()
//                .disable(TemplateType.ENTITY)
                .entity("/templates/entity.java.vm")
                .service("/templates/service.java.vm")
                .serviceImpl("/templates/serviceImpl.java.vm")
                .mapper("/templates/mapper.java.vm")
                .xml("/templates/mapper.xml.vm")
                .controller("/templates/controller.java.vm")
                .build();
        return templateConfig;
    }


    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
