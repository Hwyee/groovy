package cn.hwyee.domain

/**
 * @author hwyee@foxmail.com
 * @version 1.0
 * @ClassName XiDanAndWangFuJing
 * @description 西单和王府井
 * @date 2023/4/30
 * @since JDK 1.8
 */
class Fix {
    def xiDan;
    /**
     * 不用具体的返回值类型,想去哪儿就去哪儿
     */
    public def goWhere(){

    }
}

def fix = new Fix()
fix["xiDan"] = "xx"
def address  = "王府井"
def food = "冰糖葫芦"