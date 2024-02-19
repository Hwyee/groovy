package cn.hwyee
import org.gradle.api.Plugin
import org.gradle.api.Project
/**
 * @author hwyee@foxmail.com
 * @version 1.0
 * @ClassName ${NAME}
 * @description
 * @date 2024/2/19
 * @since JDK 1.8
 */

class Main implements Plugin<Project>{
    @Override void apply(Project project) {
        project.task("hwyee"){
            doLast{
                println("自定义gradle插件")
            }
        }
    }
}
