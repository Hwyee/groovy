package cn.hwyee

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author hwyee@foxmail.com
 * @version 1.0
 * @ClassName CustomPlugin
 * @description
 * @date 2024/2/19
 * @since JDK 1.8
 */
public class CustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("custom-plugin"){
            doLast{
                println("custom-gradle插件")
            }
        }
    }
}
